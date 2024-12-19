package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemberServlet() {
        super();
    }
    
    // jsp의 method="get"일 때 진입
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("userID");
		String name = request.getParameter("userName");
		String email = request.getParameter("userEmail");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>회원정보</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>첫 서블릿 페이지</h3>");
		out.print("<table border='1' cellspacing='0' cellpadding='10'>");
		out.print("<tr>");
		out.print("<th>");
		out.print("아이디");
		out.print("</th>");
		out.print("<td>");
		out.print(id);
		out.print("</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>");
		out.print("이름");
		out.print("</th>");
		out.print("<td>");
		out.print(name);
		out.print("</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>");
		out.print("이메일");
		out.print("</th>");
		out.print("<td>");
		out.print(email);
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}
	
	// jsp의 method="post"일 때 진입
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		doGet(request, response);
	}

}
