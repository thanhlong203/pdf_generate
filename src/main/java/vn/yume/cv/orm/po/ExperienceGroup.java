package vn.yume.cv.orm.po;
// Generated Apr 16, 2018 10:58:41 AM by Hibernate Tools 5.1.6.Final

import java.util.Date;

/**
 * ExperienceGroup generated by hbm2java
 */
public class ExperienceGroup implements java.io.Serializable {

	private Integer id;
	private String expGroupName;
	private Integer fieldId;
	private String description;
	private Short displayOrder;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public ExperienceGroup() {
	}

	public ExperienceGroup(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public ExperienceGroup(String expGroupName, Integer fieldId, String description, Short displayOrder,
			Boolean activeFlg, Date insertDatetime, Date updateDatetime) {
		this.expGroupName = expGroupName;
		this.fieldId = fieldId;
		this.description = description;
		this.displayOrder = displayOrder;
		this.activeFlg = activeFlg;
		this.insertDatetime = insertDatetime;
		this.updateDatetime = updateDatetime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExpGroupName() {
		return this.expGroupName;
	}

	public void setExpGroupName(String expGroupName) {
		this.expGroupName = expGroupName;
	}

	public Integer getFieldId() {
		return this.fieldId;
	}

	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Boolean getActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(Boolean activeFlg) {
		this.activeFlg = activeFlg;
	}

	public Date getInsertDatetime() {
		return this.insertDatetime;
	}

	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}