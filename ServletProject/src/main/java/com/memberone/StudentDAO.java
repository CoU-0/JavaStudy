package com.memberone;


import java.sql.*;
import java.util.Vector;

import javax.sql.*;
import javax.naming.*;
public class StudentDAO {

	
	private Connection getConnection() throws SQLException {
		Connection conn =null;
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn=ds.getConnection();

			
		}catch(NamingException ne) {
			System.err.println("Connection 생설실패 ㅜㅜ");
		}
		
		return conn;
		
	}

	public boolean idCheck(String id) {
		boolean result = true;
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn  = getConnection(); // 디비 연결 . 
			String sql = "select * from student where id=? ";
			pstmt = conn.prepareStatement(sql); // 쿼리문 작성  //매소드를 불러야지 사용가능  쿼리 실행을 위한 문장 
			pstmt.setString(1,id);
			
			rs = pstmt.executeQuery(); // 셀렉문 - 쿼리  -> 쿼리문 작성 후 실행 
			if(!rs.next()) result =false;
			
		}catch(SQLException ss) {
			ss.printStackTrace();
		}finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
					ss.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
					ss.printStackTrace();
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
					ss.printStackTrace();
				}

		}
		return result ;
		// end idCheck 
	}
	
	
	/*
	 * 우편번호를 데이터베이스에서 검색하여 vector컬렉션에 저장하여 리턴해주는
	 * 기능구현 
	 * 
	 */
	
	//백터는 자동으로 받는 값을 저장해 준다. 
	public Vector<ZipCodeVO> zipcodeRead(String dong){
		
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		Vector<ZipCodeVO> vecList  =new Vector<ZipCodeVO>(); //add로 저장함 
		
		try {
			
			conn = getConnection();
			
			String sql ="select * from zipcode where dong like '"+dong+"%' "; //동을 조건으로 검색하는 쿼리문 작성 // 동 첫글자만 검색해도 가져 올 수 있도록 
			pstmt = conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				ZipCodeVO zipcode = new ZipCodeVO();
				
				zipcode.setZipcode(rs.getString("zipcode"));
				zipcode.setSido(rs.getString("sido"));
				zipcode.setGugun(rs.getString("gugun"));
				zipcode.setDong(rs.getString("dong"));
				zipcode.setRi(rs.getString("ri"));
				zipcode.setBunji(rs.getString("bunji"));
				
				vecList.addElement(zipcode);
				
				
			}
			
			
		} catch (SQLException s) {
			s.printStackTrace();
		}
		
		if ( conn !=null)
			try {
				conn.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		if ( rs !=null)
			try {
				rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}if ( pstmt !=null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
					ss.printStackTrace();
		
				
				}
			return vecList;
	}// end zipread 끝나는데 

	
	//실제 정보를저장하기 위해서 
	public boolean memberInsert(StudentVO vo) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet -> 저장하는 기능이기 때문에 필요하지 않음  
		boolean flag = false;  // 
		
		try {
			conn = getConnection(); // 디비연결 
			String sql ="insert into student values(?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
	
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPass());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getEmail());
			pstmt.setString(8, vo.getZipcode());
			pstmt.setString(9, vo.getAddress1());
			pstmt.setString(10, vo.getAddress2());
		
			int count =pstmt.executeUpdate();
			if(count >0) flag = true;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ss) {
					ss.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ss) {
					ss.printStackTrace();
				}

		}
		return flag;
		
		
	}// 매소드 끝 
	/*
	 * 로그이인폼에서 로그인 버튼을 클릭하면 입력한 아이디와 비밓번호가 
	 * 데이터베이스에 있는 아이디와 비밀번호 비교해서 같으면 로그인성공, 다르면 실패처리하는 기능을 구현 
	 * 
	 * 아이디와 비밀번호 비교하여 결과를 정수형으로 반환해주는 메소드 구현
	 * 1: 로그인성공 0:비밀번호 오류 -1:아이디 존재하지 않음 
	 */
	
public int loginCheck(String id, String pass) {
	
	Connection conn = null;
	PreparedStatement pstmt = null; 
	ResultSet rs =null;
	
	int check = -1; 
	
	try {
		conn =getConnection();
		String sql ="select pass from student where id =?";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()){// rs에 저장 
			String dbPass =rs.getString("pass");
			if(pass.equals(dbPass)) {
			check = 1;
		}else {
			check =0;
		}
		
		}
	} catch (Exception e) {
		e.printStackTrace();
	
	}finally {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
			}
		if (rs != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
			}
		
	}
	return check;
}// login check 

/*
 * 정보수정화면
 * 			정보수정을 클릭하면 현재 로그인한 회원의 정보를 
 * 			수정할 수 있도록 미리 화면에 보여줘야함
 * 			
 * 			세션에 설정된 아이디를 가지고 회원정보를 
 * 			얻어오는 메소드를 구현 
 */

public StudentVO getMemeber(String id) {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	StudentVO vo = null;
	
	
	try {
		conn= getConnection(); // 또 디비를 연결하는 이유? 
		String sql = "select * from student where id =?";
		pstmt = conn.prepareStatement(sql); // 실행 		
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			vo = new StudentVO();
			vo.setId(rs.getString("id"));
			vo.setPass(rs.getString("pass"));
			vo.setName(rs.getString("name"));
			vo.setPhone1(rs.getString("phone1"));
			vo.setPhone2(rs.getString("phone2"));
			vo.setPhone3(rs.getString("phone3"));
			vo.setEmail(rs.getString("email"));
			vo.setZipcode(rs.getString("zipcode"));
			vo.setAddress1(rs.getString("address1"));
			vo.setAddress2(rs.getString("address2"));
					
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}finally {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
			}
		if (rs != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
			}
		
	}
	return vo;
}// member 끝 

// 정보수정 버튼을 클릭하면 데이터베이스에서도 수정처리해야함 
// 정보 수정을 처리할 매소드를 구현 

public void UpdateMember (StudentVO vo) { //반환형이 vo - 리턴값 없음 
	
	Connection conn =null; //디비 설정 
	PreparedStatement pstmt= null; // statement -값을 지정해서 사용할떄 / preparedStatment - 뭐가 입력될지 모를때 바인딩을 이용해서 사용하려 할떄
	//ResultSet rs = null ; 값을 저장해야할 때
	
	try {
		
		conn = getConnection();
		String sql = "update student set pass=?, phone1=?, phone2=?, phone3=?, email=?, zipcode=?, address1=?, address2=? where id = ? ";
		pstmt = conn.prepareStatement(sql);
		
		
		System.out.println("@@@@ => " + vo.getPhone2());
		
		pstmt.setString(1, vo.getPass());
		pstmt.setString(2, vo.getPhone1());		
		pstmt.setString(3, vo.getPhone2());
		pstmt.setString(4, vo.getPhone3());
		pstmt.setString(5, vo.getEmail());
		pstmt.setString(6, vo.getZipcode());
		pstmt.setString(7, vo.getAddress1());
		pstmt.setString(8, vo.getAddress2());
		pstmt.setString(9, vo.getId());

		pstmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
			}
		
	}
	
}// end update.
/*
 * 회원탈퇴 버튼을 클릭하면 실제 데이터베이스에서 회원데이터가 삭제되어야한다. 
 * 회원삭제처리를 할 메소드를 구현 
 * 
 */

public int deleteMember(String id, String pass) {

	Connection conn =null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
		int result = -1;  // 아이디 없음 
	String dbPass = "";
		
	try {
		conn = getConnection();
		String sql1 ="select pass from student where id =? ";
		pstmt = conn.prepareStatement(sql1);
		pstmt.setString(1, id);

		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			dbPass = rs.getString("pass");
			if(dbPass.equals(pass)) {
				//데이터베이스에서 삭제처리 
				String sql2 ="delete from student where id=?";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, id);
				pstmt.executeUpdate();
				
				result =1; // 회원탈퇴 // 일치 하는거니까 
				
			}else {
				result = 0 ; //비밀번호 오류 
			}
		}

		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ss) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ss) {
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ss) {
			}
		
	}

	return result;
}


}


