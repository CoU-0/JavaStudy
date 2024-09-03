<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = " org.apache.commons.fileupload.FileUpload" %>
    <%@ page import = "org.apache.commons.fileupload.DiskFileUpload" %>
    <%@ page import = "org.apache.commons.fileupload.FileItem" %>
    <%@ page import ="java.io.File" %>
    <%@ page import ="java.io.BufferedInputStream" %>
       <%@ page import ="java.io.BufferedOutputStream" %>
    <%@ page import ="java.io.FileOutputStream" %>
    <%@ page import ="java.io.IOException" %>
    <%@ page import ="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
 if(FileUpload.isMultipartContent(request)){// 내용에 요청이 있을 경우에 아래에 경로를 잡음 
	 String temporaryDir = "c:\\tem";
 	DiskFileUpload fileUpload = new DiskFileUpload();
 	fileUpload.setRepositoryPath(temporaryDir); // 여기가 저장소가 됨 

	//최대 1메가 까지 저장 할것이다
	fileUpload.setSizeMax(1*1024*1024);
 	//한번에 100K까지는 메모리에 저장하게끔 만든다. 
 	fileUpload.setSizeThreshold(100*1024);
 	// 항목을 만듦 
 	List fileItemList = fileUpload.parseRequest(request);
 	
 	for(int i=0; i<fileItemList.size();i++){
 		FileItem fileItem = (FileItem)fileItemList.get(i);
 		if(fileItem.isFormField()){
		//파일 이외의 파라미터 

%>
	폼파라미터 : <%=fileItem.getFieldName() %>=
	<%=fileItem.getString() %><br>
	<%}else{ //파일인 경우 %>
		파일 : <%=fileItem.getFieldName() %>=
		<%=fileItem.getName() %>(<%=fileItem.getSize() %>bytes)<br>
			<%if(fileItem.isInMemory()){%>
			"메모리에 저장"<br>
			<%}else{ %>
			"메모리에 저장"<br>
			<%} %>
			<%
			String filepath = application.getRealPath("upload");
			 //업로드한 파일이 존재한다면 
			 if(fileItem.getSize() >0){
				 int idx = fileItem.getName().lastIndexOf("\\"); // 경로
				 if(idx == -1){
					 idx =fileItem.getName().lastIndexOf("/");
				 }
				 String fileName = fileItem.getName().substring(idx+1);
			 	try{
			 		File uploadFile = new File(filepath, fileName);
			 		fileItem.write(uploadFile);
			 	}catch(IOException e){
			 		e.printStackTrace();
			 	}
			 }
		}
	}
 }else{
 %>
	인코딩 타입이 multipart/form-data가 아닙니다.
<%} %>
</body>
</html>