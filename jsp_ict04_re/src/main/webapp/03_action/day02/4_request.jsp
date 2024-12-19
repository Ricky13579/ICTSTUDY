<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="4_request_next.jsp" method="post">
      <table border="1" cellspacing="0" cellpadding="10">
         <tr>
            <td align="right"> 이름 </td>
            <td><input type="text" name="user_name"></td>
         </tr>
         
         <tr>
            <td align="right"> 배경색 </td>
            <td><input type="color" name="back_color"></td>
         </tr>
         
         <tr>
            <td align="right"> 글자색 </td>
            <td><input type="color" name="font_color"></td>
         </tr>
         
         <tr>
            <td align="right"> 그림자색 </td>
            <td><input type="color" name="shadow_color" value="pink"></td>
         </tr>
         
         <tr>
            <div>
               <br><br>
               <td colspan="2" align="center">
                  <input type="submit" value="전송">
                  <input type="reset" value="취소">
               </td>
            </div>
         </tr>
      
      </table>
</form>
</body>
</html>