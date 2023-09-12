package com.ecommerce.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.login.dao.LoginDao;

@WebServlet("/login")
public class login extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		LoginDao loginDao = new LoginDao();
		
		try {
			if(loginDao.check(uname,pass)) {
				response.sendRedirect("profile.jsp");
			}
			else {
				response.sendRedirect("login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
