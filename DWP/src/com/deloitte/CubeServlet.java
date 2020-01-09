package com.deloitte;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cube")
public class CubeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = 0;
		Cookie[] cookies = request.getCookies();
		for (Cookie ck : cookies) {
			if(ck.getName().equals("deloitte.sum")) {
				sum = Integer.parseInt(ck.getValue());
				break;
			}
		}
		HttpSession ssn = request.getSession();
		//int sum = Integer.parseInt(request.getParameter("sum"));
		//int sum = (int)(ssn.getAttribute("sum"));
		int cube = sum*sum*sum;
		ssn.setAttribute("cube", cube);
		response.sendRedirect("number.jsp");
		//response.getWriter().println("Sum = " + sum +"<br>");
		response.getWriter().println("Answer = " + cube);
	}

}
