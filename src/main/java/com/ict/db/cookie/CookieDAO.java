package com.ict.db.cookie;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class CookieDAO {
	private static SqlSession ss;
	
	private synchronized  static SqlSession getSession() {
		if (ss==null) {
			ss = CookieDBService.getFactoty().openSession();
		}
		return ss;
	}
	// DB처리 메서드들
	public static int getJoin(CookieVO cvo) {
		int result = 0;
		result = getSession().insert("cookieUser.c_join", cvo);
		ss.commit();
		return result;
	}
	public static CookieVO getLogin(CookieVO cvo) {
		CookieVO cvo2 = null;
		cvo2 = getSession().selectOne("cookieUser.c_login", cvo);
		return cvo2;
	}
	public static CookieVO getDetail(String id) {
		CookieVO cvo = null;
		cvo = getSession().selectOne("cookieUser.c_detail", id);
		return cvo;
	}
	
}
