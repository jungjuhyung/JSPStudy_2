package com.ict.model.session;

import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ict.db.session.SessionVO;

public class SessionProfileCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// session을 생성해서 session 안에 있는 데이터를 꺼내자
		HttpSession session = request.getSession();
		
		// 저장된 객체 데이터는 나올 때 object타입으로 나오기 때문에 형변환해줘야한다.
		// 원래 세션은 화면단에서 접근할 수 있기 때문에 여기서 값을 빼지 않고 화면단에서 사용하면 된다.
		SessionVO svo = (SessionVO) session.getAttribute("svo");
		
		request.setAttribute("pwd", svo.getPwd());
		return "view/session/profile.jsp";
	}

}
