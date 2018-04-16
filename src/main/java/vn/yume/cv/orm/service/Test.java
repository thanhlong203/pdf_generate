package vn.yume.cv.orm.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.yume.cv.orm.po.SkillDetail;

public class Test {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-config.xml");

		SkillDetailService service = (SkillDetailService) context.getBean("skilldetailservice");
		SkillDetail po = service.getSkillDetail(1);
		System.out.println(po);
 }
}
