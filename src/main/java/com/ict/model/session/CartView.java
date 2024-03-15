package com.ict.model.session;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartView {
	// session 카트에 담는 기능을 하는 하는 모델 
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "view/session_cart/session_cart_view.jsp";
	}
}
