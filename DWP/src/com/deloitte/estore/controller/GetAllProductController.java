package com.deloitte.estore.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

 
@WebServlet("/getall")
public class GetAllProductController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
   
	 
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
			
			 ProductService service=new ProductServiceImpl();
			 try {
				 List<Product> products=service.getAllProducts();
				 HttpSession ssn=request.getSession();
				 ssn.setAttribute("products", products);
				 response.sendRedirect("showall.jsp");
				 
				 
			    
		}catch (Exception e) {
			System.out.println(e);
		}
			 
		}
		
	
 
}