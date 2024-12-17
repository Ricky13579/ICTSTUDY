<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프리미어리그 선수 정보</title>
</head>
<body>
	<form action="01_epl_info.jsp" action="get">
		선수 이름 : <input type="text" name="user_name" size="5"><br>
		선수 포지션 : <select name="user_pos">
					<option value="">포지션을 선택하세요</option>
					<option value="FW">FW</option>
					<option value="MF">MF</option>
					<option value="DF">DF</option>
					<option value="GK">GK</option>
				  </select>
				  <br>
		선수 등번호 : <input type="text" name="user_num" size="5"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>