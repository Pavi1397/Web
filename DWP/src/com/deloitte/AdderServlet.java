package com.deloitte;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AdderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		int sum = number1+number2;
//		HttpSession ssn = request.getSession();
//		ssn.setAttribute("sum", sum);
//		response.sendRedirect("cube");
		
		Cookie cookie = new Cookie("deloitte.sum", String.valueOf(sum));
		response.addCookie(cookie);
		response.sendRedirect("cube");
}
 
    
	

}
