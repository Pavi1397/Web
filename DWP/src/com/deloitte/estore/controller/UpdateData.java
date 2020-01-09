package com.deloitte.estore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/updatedata")
public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("uid"));
		String pname =request.getParameter("uname");
		float price = Float.parseFloat(request.getParameter("uprice"));
		Product product = new Product (pid,pname,price);
		ProductService ps = new ProductServiceImpl();
		try {
			if(ps.updateProduct(product)) {
				response.sendRedirect("success.jsp");
			}
		}catch (Exception e) {
		System.out.println(e);
		}
	}

}
