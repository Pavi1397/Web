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

@WebServlet("/delete")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId = Integer.parseInt(request.getParameter("pid"));
		ProductService service = new ProductServiceImpl();
		Product p1;
		try {
			p1=service.getProductById(prodId);
			if(service.deleteProduct(p1)) {
				response.getWriter().println("Deleted Product");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
