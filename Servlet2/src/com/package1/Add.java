package com.package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public Add() {
		 		        // TODO Auto-generated constructor stub
		    }
	        // TODO Auto-generated constructor stub
	    
    /**
     * Default constructor. 
     */
   
    	
    	
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double i=Double.parseDouble(request.getParameter("a"));
		double j=Double.parseDouble(request.getParameter("b"));
		double k=i+j;
		out.println("<html><body>");
		out.println("<h1>Answer</h1><br>");
		out.println("The sum is:"+k);
		out.println("</body></html>");
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
