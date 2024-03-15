package com.ict.controller.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.session.CartAdd;
import com.ict.model.session.CartClean;
import com.ict.model.session.CartView;
import com.ict.model.session.Command;
import com.ict.model.session.SessionJoinCommand;
import com.ict.model.session.SessionJoinOkCommand;
import com.ict.model.session.SessionLoginCommand;
import com.ict.model.session.SessionLoginOkCommand;
import com.ict.model.session.SessionLogoutCommand;
import com.ict.model.session.SessionProfileCommand;
import com.ict.model.session.SessionProfileOkCommand;

@WebServlet("/CartController3")
public class CartController3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		CartClean cartClean = new CartClean();
		String path = cartClean.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}


}
