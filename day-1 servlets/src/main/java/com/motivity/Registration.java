package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Registration extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=(String)request.getParameter("username");
		String email=(String)request.getParameter("useremail");
		String password=(String)request.getParameter("userpassword");
		int phone=Integer.parseInt(request.getParameter("phonenumber"));
		String gender=(String)request.getParameter("gender");
		String date=(String)request.getParameter("userdob");
		String address=(String)request.getParameter("address");
		PrintWriter out=response.getWriter();
		
		out.println(name+"  "+password+" "+email+" "+phone +" "+gender+" "+date+"  "+address);
		
	}

}
