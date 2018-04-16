package vn.yume.cv.orm.service.impl;

import java.util.List;

import vn.yume.cv.orm.dao.SkillDetailDao;
import vn.yume.cv.orm.po.SkillDetail;
import vn.yume.cv.orm.service.SkillDetailService;

public class SkillDetailServiceImpl implements SkillDetailService{
	private SkillDetailDao skillDetailDao;

	public void setSkillDetailDao(SkillDetailDao skillDetailDao) {
		this.skillDetailDao = skillDetailDao;
	}

	@Override
	public SkillDetail get(int id) {
		return skillDetailDao.get(id);
	}

	@Override
	public List<SkillDetail> getAll() {
		return skillDetailDao.getAll();
	}
	
}
