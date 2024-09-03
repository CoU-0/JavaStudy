<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.oreilly.servlet.MultipartRequest" %><!-- 파일 업로드시 사용되는 클래스 -->
<%@ page import ="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %><!-- 같은파일 여러번 업로드에도 중복 처리할 떄- 활용 -->
<%@ page import ="java.util.*" %> 
<%@ page import ="java.io.*" %>

<%
String realFolder = "";
String saveFolder ="";
String encType ="utf-8";
int maxSize = 10 * 1024 * 1024; //10MB

ServletContext context = getServletContext(); // 어플리케이션 전체에서 사용 
realFolder = context.getRealPath(saveFolder);

ArrayList saveFiles = new ArrayList();
ArrayList origiFiles = new ArrayList();

String paramUser ="";
String paramTitle ="";
String paramAbstract ="";

try {
	MultipartRequest multi =new MultipartRequest
			(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());

	paramUser = multi.getParameter("txtUser");
	paramTitle = multi.getParameter("txtTitle");
	paramAbstract = multi.getParameter("txtAbstract");
	
	Enumeration files = multi.getFileNames();
	
	while(files.hasMoreElements()){
		//실제 서버 저장된 파일을 데리고 와서 보여줌 - 
		String name =(String)files.nextElement();
		saveFiles.add(multi.getFilesystemName(name)); // 
		origiFiles.add(multi.getOriginalFileName(name)); // 
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Information Page</title>
<link href = "style.css" rel ="stylesheet" type="text/css">
</head>
<body>
<table width ="75%" border ="1" align = "center" cellpadding ="1"
			cellspacing = "1" bordercolor ="#660000" bgcolor ="#ffff99">
	<tr >
	<td width="10%" bgcolor="#ffcc00" > 
		<div align ="right"><strong>title</strong></div>
	</td>
	<td width ="30%"><%=paramTitle %></td>
	
	<td width="10%" bgcolor="#ffcc00" > 
		<div align ="right"><strong>user</strong></div>
	</td>
	<td width ="30%"><%=paramUser %></td>
	
	</tr>		
	
	<tr>
		<td width="10%" bgcolor="#ffcc00" >
		<div align="center"><Strong>Abstract</Strong></div>
		</td>
			<td width="50%" colspan="3">
			<textarea rows="5" cols="50"><%=paramAbstract %></textarea>
			</td>
	</tr>

<tr><td colspan="4" bgcolor="#ffffff">&nbsp;<td></tr> <!--  파일 표시 칸  -->
	 <!-- 업로드 확인 /  고정 확인인지 - 폼만들어서 하는건지  -->
 <% for(int i =0; i<saveFiles.size(); i++) {%>
<tr bgcolor="#ffcc00">
	<td colspan="4" >
	<a href="<%="/"+saveFolder+"/"+saveFiles.get(i) %>"> <!--  / 에다가 프로젝트 명을 써줌  -->
	<strong><%=origiFiles.get(i) %></strong>
	</a>
	</td>
</tr>


<%} %>	
</table>



</body>
</html>

<%
}catch(IOException ioe){
	System.out.println(ioe);
}catch(Exception ex){
	System.out.println(ex);
}
%>