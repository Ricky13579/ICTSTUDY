package servlet;

import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/test")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }
    
    /*
     * HttpServletRequest : 클라이언트의 요청정보를 저장한다.
     * HttpServletResponse : 응답정보를 저장한다.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		System.out.println("<<< doGet() 호출 >>>");
		
		response.setContentType("text/html; charset=UTF-8");
		
		/*
		 * 	Printwriter : 웹브라우저에 html로 출력하기 위한 출력스트림
		 *  서블릿은 자바파일이기 때문에, 응답하기 위한 html 코드가 없으므로
		 *  PrintWriter라는 출력스트림을 만들어서 html 코드를 작성한다.
		 */
		PrintWriter out = response.getWriter();
		
		// 출력스트림 PrintWriter의 print() 메서드로 웹브라우저에 출력
		out.print("<html>");
		out.print("<head>");
		out.print("<title>서블릿</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>첫 서블릿 페이지</h3>");
		out.print("현재 시간은 ");
		out.print(new Date());
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		System.out.println("<<< doPost() 호출 >>>");
		doGet(request, response);
	}

}
