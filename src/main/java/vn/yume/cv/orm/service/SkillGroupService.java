package vn.yume.cv.orm.service;

import java.util.List;

import vn.yume.cv.orm.po.SkillGroup;

public interface SkillGroupService {
	SkillGroup get(int id);
	List<SkillGroup> getAll();
}
