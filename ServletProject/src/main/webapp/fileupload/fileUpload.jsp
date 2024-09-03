<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.oreilly.servlet.MultipartRequest" %><!-- 파일 업로드시 사용되는 클래스 -->
<%@ page import ="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %><!-- 같은파일 여러번 업로드에도 중복 처리할 떄  -->
<%@ page import ="java.util.*" %>
    
    
<% 
// 업로드 파일을 만듦 -> 파일을 올리게 되면 업로드라는 파일에 저장이 되게 됨 

String uploadPath = request.getRealPath("upload"); // 파일이 없으면 안됨 
int size = 10 * 1024 * 1024;

String name ="";
String subject ="";
String filename1 ="";// 업로드한 파일명 
String filename2 ="";
String origifilename1 =""; // 원본 파일명 
String origifilename2 =""; // 

//폴리싱 - 중복처리리 사용 
try{
	MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());

	name = multi.getParameter("name");
	subject = multi.getParameter("subject");
	
	Enumeration files = multi.getFileNames(); //반환형이 뭐? 
	String file1 = (String)files.nextElement();
	filename1 = multi.getFilesystemName(file1);
	origifilename1 = multi.getOriginalFileName(file1);
			
	
	String file2 = (String)files.nextElement();
	filename2 = multi.getFilesystemName(file2);
	origifilename2 = multi.getOriginalFileName(file2);
	
// 결과를 이 페이지에 뿌린다. 			

}catch(Exception e){
	e.printStackTrace();
}



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<form action="fileCheck.jsp" name="filecheck" method="post">
<input type ="hidden" name ="name" value =<%=name %>>
<input type ="hidden" name ="subject" value =<%=subject %>>
<input type ="hidden" name ="filename1" value =<%=filename1 %>>
<input type ="hidden" name ="filename2" value =<%=filename2 %>>
<input type ="hidden" name ="origifilename1" value =<%=origifilename1 %>>
<input type ="hidden" name ="origifilename2" value =<%=origifilename2 %>>



</form>
<a href = "#" onclick="javascript:filecheck.submit()">업로드 확인 페이지 이동</a> <!-- name 따라가는건지? -->

</body>
</html>