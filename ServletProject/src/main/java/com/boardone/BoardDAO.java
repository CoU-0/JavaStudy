package com.boardone;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//DAO - 데이터베이스 작업함 
public class BoardDAO {

	private static BoardDAO instance = null;
	
	private BoardDAO() {  }
	
	public static BoardDAO getInstance() {

		// 동시접속시에 문제가 되는 부분 해결 
	if(instance == null) {
		synchronized (BoardDAO.class) {
			instance = new BoardDAO();
			
		}
	}
		
		return instance;
	}

	// 여기서부터 게시판 기능들을 하나씩 메소드를 추가해서 완성해나아감 
// 데이터베이스에 데이터를 저장하는 매소드 구현 
	
	public void insertArticle(BoardVO article) { // 매소드에 인자값 들어오는게 파라미터 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int num = article.getNum();
		int ref = article.getRef();
		int step = article.getStep();
		int depth = article.getDepth();
		
		int number = 0;
		String sql ="";
		
		try {
			conn = ConnUtil.getConnection(); //db연결 
			pstmt = conn.prepareStatement("select max(num) from board");
			rs = pstmt.executeQuery();// 쿼리문이 실행한 결과를 저장한다. 
			
			if(rs.next()) number = rs.getInt(1)+1; // // 결과에 순차적으로rs 정보가 있다면 넘버에 저장 
			else number =1; // 그 전에 글이 잇다면 1로 // 첫번째 열 
			
			if (num !=0) {
				//글이 있다는 뜻 - 답변글일 경우
				sql = "update board set step=step+1 where ref = ? and step > ?";// db에서 +1 시키는것
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, step);
				pstmt.executeUpdate();
				step = step+1; // 웹상에서 +1 시키는 것 
				depth = depth +1;
				
			}else {//새글일 경우 번호에 +1 해야한다 .
				ref = number;// 새글일 경우 넘버에 저장
				step =0;
				depth = 0;
			}
			//board 테이블에 데이터 저장할 쿼리문 
			// 새글일때의 쿼리문 
			sql ="insert into board(num, writer, email,subject, pass, regdate, ref, step, depth, content, ip) values(board_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql); // 쿼리 실행
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2, article.getEmail());
			pstmt.setString(3, article.getSubject());
			pstmt.setString(4, article.getPass());
			pstmt.setTimestamp(5, article.getRegdate());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, step);
			pstmt.setInt(8, depth);
			pstmt.setString(9, article.getContent());
			pstmt.setString(10, article.getIp());
			pstmt.executeUpdate();
			
			
			
		} catch (Exception e) { //catch 블럭 내에 발생한 예외처리 
			e.printStackTrace();
			
		}finally { // 
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
			
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
				
				}
			
			
		}
		
	}// insertArticle end /
	
	/*
	 * 글 목록화면 작성 
	 * 전체 글의 개수를 가져오는 매소드 구현 
	 */
	
	public int getArticleCount() { // 검색한게 몇개인지 카운트 하는것 - 무엇을 검색했는지 찾아야함 
		
		Connection conn=null; // db가 마지막에 끊어져야함 // rs -> pstmt -> conn // 순서 안지키면 db못가져옴
		PreparedStatement pstmt = null; //sql문 작성 
		ResultSet rs =null; // sql문 저장 
		
		int x = 0; // 초기값 0
		
		try {
			
			conn = ConnUtil.getConnection();
			String sql = "select count(*) from board"; // 모든 내용을 세는것? 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				x =rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
			
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
				
				}
			
		}
		return x; // 목록을 가져오는애 이기 때문에 리턴해주면 검색 끝
		
	}// end getArticleCount()
	//List - 자동적으로 저장공간을 늘리는 역할 
	public List<BoardVO> getArticles(int start, int end){ //List가 BoardVO의 객체만 담을 수 있다는 뜻  
	
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> articleList = null;
		
		try {
			
			conn = ConnUtil.getConnection();
			//String sql = "select * from board order by num desc"; //오름차순 
			
			String sql = "select * from (select rownum rnum, num, writer, email, subject, pass, regdate, readcount, ref, step, depth, content, ip from "
					+ "( select * from board order by ref desc, step asc)) where rnum >=? and rnum <= ? ";
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				articleList = new ArrayList<BoardVO>(end-start+1);
				do {
					BoardVO article = new BoardVO();
					article.setNum(rs.getInt("num"));
					article.setWriter(rs.getString("writer"));
					article.setEmail(rs.getString("email"));
					article.setSubject(rs.getString("subject"));
					article.setPass(rs.getString("pass"));
					article.setRegdate(rs.getTimestamp("regdate"));
					article.setReadcount(rs.getInt("readcount"));
					article.setRef(rs.getInt("ref"));
					article.setStep(rs.getInt("step"));
					article.setDepth(rs.getInt("depth"));
					article.setContent(rs.getString("content"));
					article.setIp(rs.getString("ip"));
					articleList.add(article);
					
					
				}while(rs.next()); // 데이터 있으면 와일문 만큼 데리고옴 
			}
			
		}catch (Exception e) {

		}finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
			
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
				
				}
			
			
		}
			return articleList;
	}// end articles();
	
	
	
	public BoardVO getArticle(int num) {
		
		Connection conn =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		BoardVO article =null;
	
	try {
		conn = ConnUtil.getConnection();
		String sql ="update board set readcount =readcount+1 where num=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.executeUpdate();
		
		String sql1 = "select * from board where num=?";
		pstmt=conn.prepareStatement(sql1);
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		
		
		if(rs.next()) {
			article = new BoardVO();
			
			article.setNum(rs.getInt("num"));
			article.setWriter(rs.getString("writer"));
			article.setEmail(rs.getString("email"));
			article.setSubject(rs.getString("subject"));
			article.setPass(rs.getString("pass"));
			article.setRegdate(rs.getTimestamp("regdate"));
			article.setReadcount(rs.getInt("readcount"));
			article.setRef(rs.getInt("ref"));
			article.setStep(rs.getInt("step"));
			article.setDepth(rs.getInt("depth"));
			article.setContent(rs.getString("content"));
			article.setIp(rs.getString("ip"));
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	
	}finally {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ss) {
				
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
		
			}

		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			
			}
	
	}
	return article;
	}//end

	/*
	 * 글 상세보기 화면에서 글 수정 버튼을 클릭했을 경우, updateForm.jsp로 이동하여 
	 * 글 수정 화면을 만든 후 
	 * 글 번호에 해당하는 글을 가져와서 수정 처리해야함 
	 * 
	 * 글 수정시에는 글 목록보기와 다르게 조회수를 증가할 필요가 없음 
	 * 
	 */
	
	public BoardVO updateGetAritcle(int num) { // 수정할걸 넘에서 가져와서 뿌림 
	
	Connection conn =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BoardVO article = null; // 반환형이 BoardVO이기 때문에 반환해줌 . // 저장된 넘버를 가져올떄 넘버를 가져오면 됨 
	
	String sql ="select * from board where num=?";
	
	try {
		conn = ConnUtil.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			article = new BoardVO();
			article.setNum(rs.getInt("num"));// 만약 rs에 저장된것중에 넘이 입력 받으면 - 아티클에 저장한다 
			article.setWriter(rs.getString("writer"));
			article.setEmail(rs.getString("email"));
			article.setSubject(rs.getString("subject"));
			article.setPass(rs.getString("pass"));
			article.setRegdate(rs.getTimestamp("regdate"));
			article.setReadcount(rs.getInt("readcount"));
			article.setRef(rs.getInt("ref"));
			article.setStep(rs.getInt("step"));
			article.setDepth(rs.getInt("depth"));
			article.setContent(rs.getString("content"));
			article.setIp(rs.getString("ip"));
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	
	}finally {
		
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ss) {
				
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
		
			}

		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			
			}
		
		
	}
			return article;

	}
	
	
	/*
	 * updateForm.jsp 
	 * 입력하고 글 수정을 클릭하면 데이터베이스에서 실제로 저장된 글이 수정이 됨 
	 * 실제 글 수정처리를 할 메소드를 구현 
	 * 1 = 성공"수정완료" 0 = 비밀번호 오류 -1 = 수정 없을때 
	 */

	public int updateArticle(BoardVO article) {
		
		Connection conn =null;
		PreparedStatement pstmt =null;
		ResultSet rs= null;
		
		String dbpasswd =" ";
		String sql1 ="select pass from board where num =?" ; // 넘버를 조건으로 패스워드 찾기 
		String sql2 ="update board set writer=?, email=?, subject=?, content=? where num=? "; 
		int result =-1; // 수정 처리 이기 때문에 디폴트가 -1 "수정이 안되었습니다"
		
		
		// 수정 처리 - 비밀버호 일치 -> 비밀번호 수정 완료 
		try {
			conn = ConnUtil.getConnection();
			pstmt=conn.prepareStatement(sql1);
			pstmt.setInt(1, article.getNum()); // 조건에 맞는 
			
			rs= pstmt.executeQuery(); // 실행결과 가져오기 
			
			if(rs.next()) {
				dbpasswd = rs.getString("pass");
				if(dbpasswd.equals(article.getPass())) {
					// 데이터베이스에 저장된 비밀번호와 입력한 비밀번호가 같으면 - 일치한다는 쿼리문을 날림 
				
					pstmt = conn.prepareStatement(sql2);
					pstmt.setString(1, article.getWriter());
					pstmt.setString(2, article.getEmail());
					pstmt.setString(3, article.getSubject());
					pstmt.setString(4, article.getContent());
					pstmt.setInt(5, article.getNum());
					result = pstmt.executeUpdate();
					result =1; // 글 수정 성공
				
			}
			}else{
				result=0; // 비번 오류 
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
			
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
				
				}
			
		}
		
		return result;
	}

	/*
	 * 글 삭제 처리
	 * 글 삭제처리는 비밀번호를 입력받아 데이터베이스에서 비밀번호와 비교하여 일치하면 삭제 
	 * 그렇지않으면 비밀번호가 틀리다 알려줌  / select num from board where pass = ? ;
	 *  성고 = 1 비번틀리다 =0
	 */
	
	public int deleteArticle (int num, String pass) {
		
		Connection conn =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		String dbpasswd = ""; // 데이터베이스에서 가져와서 저장 
		int result =-1;
	
		String sql1 = "select pass from board where num=? ";//비밀번호 검색 
		String sql2 = "delete from board where num=?";
		
		try {
			conn = ConnUtil.getConnection();
			pstmt =conn.prepareStatement(sql1);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbpasswd = rs.getString("pass");
				if (dbpasswd.equals(pass)) {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setInt(1, num);
					pstmt.executeUpdate();
					result =1;//글삭제 
				}else {
					result =0;//비밀번호 오류 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
			
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
				
				}
		
		
		}
			
		return result;
		
	}//deletearticle end '
	
	
	
	// 검색한 내용이 몇개인지를 반환하는 메소드 (what : 검색조건 / content : 검색할내용 
	// 같은 매소드 이름에 다른 매개변수 -> 오버로딩  - 같은 메소드를 써도 매개변수에 따라 알아서 적용 될 수 있도록 
public int getArticleCount(String what, String content) { // 검색한게 몇개인지 카운트 하는것 - 무엇을 검색했는지 찾아야함 
		
		Connection conn=null; // db가 마지막에 끊어져야함 // rs -> pstmt -> conn // 순서 안지키면 db못가져옴
		PreparedStatement pstmt = null; //sql문 작성 
		ResultSet rs =null; // sql문 저장 
		
		int x = 0; // 초기값 0
		
		try {
			
			conn = ConnUtil.getConnection();
//			String sql = "select count(*) from board"; // 모든 내용을 세는것? 
			String sql = "select count(*) from board where " +what+" like '%"+content+"%'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				x =rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
			
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
				
				}
			
		}
		return x; // 목록을 가져오는애 이기 때문에 리턴해주면 검색 끝
		
	}
	

 	/* 검색한 내용(content)을 리스트로 받아옴.
	 	검색 조건(what), 검색내용(content), 어디서부터(시작번호 : start) 어디까지(끝번호 : end)
	 	시작번호와 끝번호는 페이징 처리용 
	*/
	public List<BoardVO> getArticles(String what, String content, int start, int end){ //List가 BoardVO의 객체만 담을 수 있다는 뜻  
	
	Connection conn =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<BoardVO> articleList = null;
	
	try {
		
		conn = ConnUtil.getConnection();
		//String sql = "select * from board order by num desc"; //오름차순 
		/*
		String sql = "select * from (select rownum rnum, num, writer, email, subject, pass, regdate, readcount, ref, step, depth, content, ip from "
				+ "( select * from board order by ref desc, step asc)) where rnum >=? and rnum <= ? ";
		*/
		/*String sql = "select * from (select rownum rnum, num, writer, email, subject, pass, regdate, readcount, ref, step, depth, content, ip from "
				+ "(select * from board "
				+what+" like '%"+content+"%' order by ref desc, step asc)) where rnum >=? and rnum <= ? ";
	
		pstmt =conn.prepareStatement(sql);
		*/
		String sql = "select * from (select rownum rnum, num, "
					+ "writer, email, subject, pass, regdate, readcount, "
					+ "ref, step, depth, content, ip from "
					+ "(select * from board where "
					+ what+" like '%"+content+"%' order by ref desc, step asc)) "
					+ "where rnum >= ? and rnum <= ?";
		
		pstmt =conn.prepareStatement(sql);
		pstmt.setInt(1, start);
		pstmt.setInt(2, end);
		
		rs = pstmt.executeQuery();
		
		
		if(rs.next()) {
			articleList = new ArrayList<BoardVO>(5); // 5개씩
			do {
				BoardVO article = new BoardVO();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPass(rs.getString("pass"));
				article.setRegdate(rs.getTimestamp("regdate"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setStep(rs.getInt("step"));
				article.setDepth(rs.getInt("depth"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
				articleList.add(article);
				
				
			}while(rs.next()); // 데이터 있으면 와일문 만큼 데리고옴 
		}
		
	}catch (Exception e) {
		
		e.printStackTrace();
		
	}finally {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ss) {
				
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
		
			}

		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			
			}
		
		
	}
		return articleList;
}
	

}
