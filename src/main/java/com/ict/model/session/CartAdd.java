package com.ict.model.session;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartAdd {
	// session 카트에 담는 기능을 하는 하는 모델 
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String fruits = request.getParameter("fruits");
		HttpSession session = request.getSession();
		
		// 장바구니의 크기를 알 수 없다.(컬렉션에 담아야 한다.)
		
		// session에 있는 리스트 호출(일단 먼저 호출해서 아래에서 session.getAttribute("list")를 처리한다.)
		// dbservice할 때의 싱글턴 디자인 패턴과 비슷하다.
		ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");
		
		if (list==null) {
			// 맨 처음 해당 페이지에 오면 session에 list가 없기 때문에 null이다.
			list = new ArrayList<String>();
			session.setAttribute("list", list);
		}
		// 리스트에 정보를 추가
		list.add(fruits);
		return "view/session_cart/session_cart.jsp";
	}
}
