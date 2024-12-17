<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프리미어리그 선수 정보</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("user_name");
	String pos = request.getParameter("user_pos");
	int back = Integer.parseInt(request.getParameter("user_num"));
	
	if(pos.equals("FW")){
		response.sendRedirect("01_epl_FW.jsp?name="+name+"&pos="+pos+"&num="+back);
	}
	else if(pos.equals("MF")){
		response.sendRedirect("01_epl_MF.jsp?name="+name+"&pos="+pos+"&num="+back);
	}
	else if(pos.equals("DF")){
		response.sendRedirect("01_epl_DF.jsp?name="+name+"&pos="+pos+"&num="+back);
	}
	else
	{
		response.sendRedirect("01_epl_GK.jsp?name="+name+"&pos="+pos+"&num="+back);
	}
%>
</body>
</html>