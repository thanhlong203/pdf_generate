package vn.yume.cv.orm.dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import vn.yume.cv.orm.dao.Dao;
import vn.yume.cv.util.Collections;

public class MyBatisDao<T> extends SqlSessionDaoSupport implements Dao<T> {
	protected final ConcurrentHashMap<String, String> statements;
	protected final Class<? extends T> actualType;
	
	public MyBatisDao() {
		this.actualType = this.detectActualType();
		this.statements = new ConcurrentHashMap<String, String>();
	}
	
	public T get(Serializable id) {
		return getSqlSessionFactory().openSession().selectOne(getStatement("get"), id);
	}
	
	protected String getStatement(String query) {
		String r = this.statements.get(query);
		if(r == null) {
			r = this.actualType.getCanonicalName() + "." + query;
			r = Collections.putIfAbsent(this.statements, query, r);
		}
		return r;
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> detectActualType() {
		//
		Class<?> clazz = getClass();
		while(clazz.getSuperclass() != MyBatisDao.class) {
			clazz = clazz.getSuperclass();
		}
		
		//
		final Type type = clazz.getGenericSuperclass();
		return (Class<T>)((ParameterizedType)type).getActualTypeArguments()[0];
	}
	
	@Transactional
	private SqlSessionFactory getSqlSessionFactory() {
		SqlSessionFactory factory = null;
			try {
			  Reader reader  = Resources.getResourceAsReader("mybatis-config.xml");
			  factory = new SqlSessionFactoryBuilder().build(reader);
			  } catch (IOException e) {
			   throw new RuntimeException(e.getMessage());
			  }
		return factory;
	}
}
