<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  동이름을 입력하였다면 현재 페이지에 링크가 되어 있기 떄문에 
  봉 이름을 매개변수로 받아서 데이터베이스에서 데이터를 가져와서 현재 페이지에 보여주는 기능을 구현 
   -->
<jsp:useBean id="dao" class="com.memberone.StudentDAO" />

<%@page import="com.memberone.ZipCodeVO"%>
<%@page import="java.util.Vector"%>
<%
request.setCharacterEncoding("utf-8");

String check = request.getParameter("check");
String dong = request.getParameter("dong");

Vector<ZipCodeVO> zipcdoeList = dao.zipcodeRead(dong);

int totalList = zipcdoeList.size();
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우편번호 검색</title>
<link herf="style.css" rel="stylesheet" type="text/css">
<script src="script.js"></script>
</head>
<body bgcolor="#FFFFCC">
	<div align="center">
		<b>우편번호 찾기</b>
		<form action="zipCheck.jsp" method="post" name="zipForm">
			<table>
				<tr>
					<td>동이름 입력 <input type="text" name="dong"> <input
						type="button" value="검색" onclick="dongCheck()">
					</td>
				</tr>
			</table>
			<input type="hidden" name="check" value="n">
		</form>

		<table>
			<!--  
동 이름 검색한 결과를 출력 
 -->
			<%
			if (check.equals("n")) {
				if (zipcdoeList.isEmpty()) {
			%>

			<tr>
				<td align="center"><b>검색결과가 없습니다. </b></td>
			</tr>
			<%
			} else {
			%>

			<tr>
				<td><br> * 검색 후, 아래 우편번호를 클릭하면 자동으로 입력됩니다.</td>
			</tr>

			<%
			for (int i = 0; i < totalList; i++) { // 포문으로 벡터에 저장했다가 사용 
				ZipCodeVO vo = zipcdoeList.elementAt(i);

				String tempZipcode = vo.getZipcode();
				String tempSido = vo.getSido();
				String tempGugun = vo.getGugun();
				String tempDong = vo.getDong();
				String tempRi = vo.getRi();
				String tempBunji = vo.getBunji();
				if (tempRi == null)
					tempRi = " ";
				if (tempBunji == null)
					tempBunji = " ";
			%>

			<tr>
				<td><a
					href="javascript:sendAddress('<%=tempZipcode%>', '<%=tempSido%>', '<%=tempGugun%>', '<%=tempDong%>', '<%=tempRi%>', '<%=tempBunji%>')">
						<%=tempZipcode%>&nbsp;<%=tempSido%>&nbsp;<%=tempGugun%>&nbsp;<%=tempDong%>&nbsp;<%=tempRi%>','<%=tempBunji%>

				</a><br></td>
			</tr>

			<%
			} // end for
			} // end else
			} // end if
			%>
			<tr>
				<td align="center"><a href="javascript:this.close()">닫기</a></td>
			</tr>
		</table>
	</div>
</body>
</html>