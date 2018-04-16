package vn.yume.cv.orm.service.impl;

import vn.yume.cv.orm.dao.SkillDetailDao;
import vn.yume.cv.orm.po.SkillDetail;
import vn.yume.cv.orm.service.SkillDetailService;

public class SkillDetailServiceImpl implements SkillDetailService{
	private SkillDetailDao skillDetailDao;

	public void setSkillDetailDao(SkillDetailDao skillDetailDao) {
		this.skillDetailDao = skillDetailDao;
	}

	@Override
	public SkillDetail getSkillDetail(int id) {
		return skillDetailDao.get(id);
	}
	
}
