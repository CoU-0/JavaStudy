<%@page import="javax.media.jai.RenderedOp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.awt.Graphics2D" %><!--  -->
<%@ page import="java.awt.image.renderable.ParameterBlock" %> <!--  -->
<%@ page import="java.awt.image.BufferedImage" %><!--  -->
<%@ page import="javax.media.jai.JAI" %>
<%@ page import="javax.media.jai.RenderableOp" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %><!-- 중복 -->
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>

 <%
 		String imagePath=request.getRealPath("upload");
 		int size = 1*1024 *2024; //1Mb
 		String filename ="";
 		try{
 			
 			MultipartRequest multi = new MultipartRequest(
 					request, imagePath, size, "utf-8", new DefaultFileRenamePolicy());
 			Enumeration files =multi.getFileNames();
 			String file = (String)files.nextElement();
 			filename =multi.getFilesystemName(file);
 			
 			
 		}catch(Exception e){
 			e.printStackTrace();
 		}
 		
 		ParameterBlock pb = new ParameterBlock();
 		pb.add(imagePath+"/"+filename); //업로드에 이미지 파일 추가 
 		RenderedOp rOp = JAI.create("fileload",pb);
 		
 		BufferedImage bi = rOp.getAsBufferedImage(); // 이미지 객체 
 		BufferedImage thumb = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
 		
 				Graphics2D g = thumb.createGraphics();
 				g.drawImage(bi, 0, 0, 100, 100, null); // 이미지 객체 좌표 시작지점 , 좌표 크기  제목 null
 				File file = new File(imagePath+"/sm_"+filename);
 				ImageIO.write(thumb, "png", file);
 		
 %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 썸네일</title>
</head>
<body>
-원본이미지-<br>
<img src="/upload/<%=filename%>">
<br>
-썸네일 이미지-<br>
<img src="/upload/sm_<%=filename%>">



</body>
</html>