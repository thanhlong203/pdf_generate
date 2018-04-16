package vn.yume.cv.orm.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.yume.cv.orm.po.UserPo;

public class Test {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-config.xml");

		UserService dao = (UserService) context.getBean("userService");
		UserPo po = dao.getUser(1);
		System.out.println(po);
 }
}
