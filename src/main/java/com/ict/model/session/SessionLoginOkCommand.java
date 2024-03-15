package com.ict.model.session;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ict.db.session.SessionDAO;
import com.ict.db.session.SessionVO;

public class SessionLoginOkCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		SessionVO svo = new SessionVO();
		svo.setId(id);
		svo.setPwd(pwd);
		
		SessionVO svo2 = new SessionDAO().getLogin(svo);
		
		if (svo2 == null) {
			return "view/session/loginForm.jsp";
		}else {
			// HttpSession session = request.getSession(); => session 만들기
			// session.setAttribute("이름", 값); => session에 값 저장
			// session.getAttribute("이름"); => session의 값 반환
			// session.removeAttribute("이름"); => 인자로 들어간 이름의 값만 삭제
			
			// 기타 주요메서드
			// 세션명.getID : 세션 고유ID 반환
			// 세션명.getCreationTime() : 세션이 생성된 시간 반환
			// 세션명.getLastAccessedTime() : 마지막에 접근한 시간 반환
			// 세션명.invalidate() : session 전체 데이터 초기화(삭제)
			// 세션명.setMaxInactiveInterval(시간) : 세션 생명주기 시간 제한
			// 세션은 클라이언트 화면단에서 
			
			// 세션의 생명주기는 시간을 지정해주지 않으면 브라우저가 꺼지면 삭제된다.
			
			// session을 만들어서 session에 저장한다.
			HttpSession session = request.getSession();
			session.setAttribute("svo", svo2);
			return "view/session/index.jsp";
		}
	}
}
