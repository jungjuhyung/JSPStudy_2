package com.ict.db.cookie;

import java.io.InputStream;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CookieDBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/db/cookie/cookie_config.xml";
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static SqlSessionFactory getFactoty() {
		return factory;
		
	}
}
