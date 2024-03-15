package com.ict.model.session;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartClean {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// session에 있는 값 초기화
		// 장바구니 기능은 list도 사라진다.
		request.getSession().invalidate();
		return "view/session_cart/session_cart.jsp";
	}
}
