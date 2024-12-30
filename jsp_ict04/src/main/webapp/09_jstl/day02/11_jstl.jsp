<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="useBean.LeagueDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<LeagueDTO> list = new ArrayList<LeagueDTO>();
		LeagueDTO dto1 = new LeagueDTO();
		dto1.setLeagueNo(1);
		dto1.setLeagueName("EPL");
		list.add(dto1);
		
		LeagueDTO dto2 = new LeagueDTO();
		dto2.setLeagueNo(2);
		dto2.setLeagueName("라리가");
		list.add(dto2);
		
		LeagueDTO dto3 = new LeagueDTO();
		dto3.setLeagueNo(3);
		dto3.setLeagueName("분데스리가");
		list.add(dto3);
		
		LeagueDTO dto4 = new LeagueDTO();
		dto4.setLeagueNo(4);
		dto4.setLeagueName("세리에 a");
		list.add(dto4);
		
		LeagueDTO dto5 = new LeagueDTO();
		dto5.setLeagueNo(5);
		dto5.setLeagueName("리그앙");
		list.add(dto5);
		
		request.setAttribute("leagues", list);
		String view = "11_league.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	%>
</body>
</html>