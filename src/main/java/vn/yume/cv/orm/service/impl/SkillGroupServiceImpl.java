package vn.yume.cv.orm.service.impl;

import java.util.List;

import vn.yume.cv.orm.dao.SkillGroupDao;
import vn.yume.cv.orm.po.SkillGroup;
import vn.yume.cv.orm.service.SkillGroupService;

public class SkillGroupServiceImpl implements SkillGroupService{
	SkillGroupDao skillGroupDao;
	@Override
	public SkillGroup get(int id) {
		return skillGroupDao.get(id);
	}

	@Override
	public List<SkillGroup> getAll() {
		return skillGroupDao.getAll();
	}

}
