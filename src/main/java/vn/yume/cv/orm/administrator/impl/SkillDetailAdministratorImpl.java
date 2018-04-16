package vn.yume.cv.orm.administrator.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.fabric.xmlrpc.base.Array;

import vn.yume.cv.orm.administrator.AbstractAdministrator;
import vn.yume.cv.orm.po.SkillDetail;
import vn.yume.cv.orm.po.SkillGroup;
import vn.yume.cv.orm.service.SkillDetailService;
import vn.yume.cv.orm.service.SkillGroupService;

public class SkillDetailAdministratorImpl implements AbstractAdministrator{
	private SkillDetailService skillDetailService;
	private SkillGroupService skillGroupService;
	public SkillDetailAdministratorImpl() {};
	
	@Override
	public Map<Integer, List<SkillDetail>> getSkillDetails() {
		List<SkillDetail> listSkillDetail = skillDetailService.getAll();
		List<SkillGroup> listSkillGroup = skillGroupService.getAll();
		Map<Integer, List<SkillDetail>> mapSkillDetail = new HashMap<Integer, List<SkillDetail>>();
		for (SkillDetail skillDetail : listSkillDetail) {
			int skillGroupId = skillDetail.getSkillGroupId();
			for (SkillGroup skillGroup : listSkillGroup) {
				if (skillGroupId == skillGroup.getId()) {
					List<SkillDetail> skillDetails = mapSkillDetail.get(skillGroup.getId());
					if (skillDetails == null) mapSkillDetail.put(skillGroup.getId(), skillDetails = new ArrayList());
					skillDetails.add(skillDetail);
				}
			}
		}
		return mapSkillDetail;
	}
	
}
