package com.ict.model.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.session.SessionDAO;
import com.ict.db.session.SessionVO;

public class SessionJoinOkCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입
		SessionVO svo = new SessionVO();
		svo.setId(request.getParameter("id"));
		svo.setPwd(request.getParameter("pwd"));
		svo.setName(request.getParameter("name"));
		svo.setEmail(request.getParameter("email"));
		svo.setAddr(request.getParameter("addr"));
		svo.setPhone(request.getParameter("phone"));
		
		int result = SessionDAO.getJoin(svo);
		if (result == 1) {
			return "view/session/loginForm.jsp";			
		}else {
			return "view/session/joinForm.jsp";			
		}
	}

}
