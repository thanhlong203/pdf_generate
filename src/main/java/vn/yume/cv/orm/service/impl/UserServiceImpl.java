package vn.yume.cv.orm.service.impl;

import vn.yume.cv.orm.dao.UserDao;
import vn.yume.cv.orm.po.UserPo;
import vn.yume.cv.orm.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public UserPo getUser(int id) {
		return userDao.get(id);
	}
}
