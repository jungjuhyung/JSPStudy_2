package com.ict.model.session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.session.SessionDAO;
import com.ict.db.session.SessionVO;

public class SessionProfileOkCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "view/session/detail.jsp";
	}
}
