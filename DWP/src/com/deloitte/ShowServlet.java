package com.deloitte;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show")
public class ShowServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void service (HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
		String name = req.getParameter("txtname");
		String gender = req.getParameter("gender");
		List<String>langs = Arrays.asList(req.getParameterValues("cblang"));
		String country = req.getParameter("country");
		
		Person person = new Person (name,gender,langs,country);
		RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
		req.setAttribute("person", person);
		rd.forward(req,res);
		
//		PrintWriter out = res.getWriter();
//		out.println("Name: "+name+"<br>");
//		out.println("Gender: "+gender+"<br>");
//		out.println("Languages: ");
//		langs.forEach((l)->out.println(l));
//		out.println("Country: "+country+"<br>");
	}
}
