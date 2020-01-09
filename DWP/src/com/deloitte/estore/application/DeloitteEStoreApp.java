package com.deloitte.estore.application;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;
import java.util.*;

public class DeloitteEStoreApp {

	public static void main(String[] args) {
		ProductService service = new ProductServiceImpl();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your option");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			Product p = new Product(104,"LEDTV",900);
		try {
			if(service.addProduct(p)){
				System.out.println("Product added");
			}
			else {
				System.out.println("Not added");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		break;
		
		case 2 :
			Product p1 = new Product(102,null,0);
		try {
			if(service.deleteProduct(p1)) {
				System.out.println("Product Deleted");
				
			}
			else {
				System.out.println("Not deleted");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		break;
		
		case 3 :
			Product p2 = new Product(102,"Mobile",450);
		try {
			if(service.updateProduct(p2)) {
				System.out.println("Product updated");
				
			}
			else {
				System.out.println("Not updated");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		break;
		
		case 4 :
			Product p3 = new Product();
		try {
			p3 =service.getProductById(102);
			if(p3 != null) {
				System.out.println(p3.toString());
				
			}
			else {
				System.out.println("Not executed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		break;
		case 5 :
			List<Product> products = new ArrayList<>();
		try {
			products = service.getAllProducts();
			System.out.println(products);
			}
			
		catch(Exception e) {
			e.printStackTrace();
		}
		break;
			default : {System.out.println("Invalid choice");}
			
		}
	}
	}

