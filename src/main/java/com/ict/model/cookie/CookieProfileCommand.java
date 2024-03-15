package com.ict.model.cookie;

import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieProfileCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		String pwd = null;
		if (cookies != null && cookies.length > 0) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("pwd")) {
					pwd = cookies[i].getValue();
				}
			}
		}
		
		request.setAttribute("pwd", pwd);
		return "view/cookie/profile.jsp";
	}

}
