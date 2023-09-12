package com.ecommerce.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.signup.action.SignUpAction;
import com.ecommerce.signup.dao.CheckSignUpDao;
import com.ecommerce.signup.dao.SignUpDao;

@WebServlet("/signup")
public class SignUp extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String rno = request.getParameter("rno");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		
		SignUpAction signupAction = new SignUpAction(rno, uname, pass, cpass);
		SignUpDao dao = new SignUpDao();
		CheckSignUpDao checkDao = new CheckSignUpDao();
		PrintWriter out = response.getWriter();
		
		try {
			if(checkDao.check(rno,uname)) {
				//out.println("CHECK REGISTER NUMBER OR USERNAME,ALREADY EXISTS");
				response.sendRedirect("signup.jsp");
			}else if(!(pass.contentEquals(cpass))) {
				response.sendRedirect("signup.jsp");
			}
			else {
				dao.SignUpDao(signupAction);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("Sucessfully created");
	}

}
