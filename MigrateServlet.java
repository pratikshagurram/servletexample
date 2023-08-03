package com.migrate.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/migrate")
public class MigrateServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  
{
	resp.setContentType("text/plain");
	resp.getWriter().write("Migrating started\n");
	String uname = req.getParameter("uname");
    String psw = req.getParameter("psw");
    
    resp.getWriter().write("\nUsername:"+uname);
    resp.getWriter().write("\n\nPassword: "+psw);
}
	
}
