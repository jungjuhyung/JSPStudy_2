package com.ict.db.basic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BasicDAO {
	private static SqlSession ss;
	
	private synchronized  static SqlSession getSession() {
		if (ss==null) {
			ss = BasicDBService.getFactoty().openSession();
		}
		return ss;
	}
	// DB처리 메서드들
	public static int getJoin(BasicVO bvo) {
		int result = 0;
		result = getSession().insert("userMembers.join", bvo);
		ss.commit();
		return result;
	}
	public static BasicVO getLogin(BasicVO bvo) {
		BasicVO bvo2 = null;
		bvo2 = getSession().selectOne("userMembers.login", bvo);
		return bvo2;
	}
	public static BasicVO getDetail(String id) {
		BasicVO bvo = null;
		bvo = getSession().selectOne("userMembers.detail", id);
		return bvo;
	}
	
}
