package vn.yume.cv.orm.administrator;

import java.util.List;
import java.util.Map;

import vn.yume.cv.orm.po.SkillDetail;

public interface AbstractAdministrator {
	Map<Integer, List<SkillDetail>> getSkillDetails();
}
