package vn.yume.cv.orm.service;

import java.util.List;

import vn.yume.cv.orm.po.SkillDetail;

public interface SkillDetailService {
	SkillDetail get(int id);
	List<SkillDetail> getAll();
}
