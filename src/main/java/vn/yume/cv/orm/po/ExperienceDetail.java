package vn.yume.cv.orm.po;
// Generated Apr 16, 2018 11:28:39 AM by Hibernate Tools 5.1.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ExperienceDetail generated by hbm2java
 */
@Entity
@Table(name = "experience_detail", catalog = "SKILL_MNG")
public class ExperienceDetail implements java.io.Serializable {

	private Integer id;
	private String name;
	private Boolean type;
	private int expGroupId;
	private Integer subGroup;
	private Integer dependentId;
	private Integer dependentGroupId;
	private String unit;
	private Boolean checkBox;
	private Short displayOrder;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public ExperienceDetail() {
	}

	public ExperienceDetail(int expGroupId, Date insertDatetime) {
		this.expGroupId = expGroupId;
		this.insertDatetime = insertDatetime;
	}

	public ExperienceDetail(String name, Boolean type, int expGroupId, Integer subGroup, Integer dependentId,
			Integer dependentGroupId, String unit, Boolean checkBox, Short displayOrder, Boolean activeFlg,
			Date insertDatetime, Date updateDatetime) {
		this.name = name;
		this.type = type;
		this.expGroupId = expGroupId;
		this.subGroup = subGroup;
		this.dependentId = dependentId;
		this.dependentGroupId = dependentGroupId;
		this.unit = unit;
		this.checkBox = checkBox;
		this.displayOrder = displayOrder;
		this.activeFlg = activeFlg;
		this.insertDatetime = insertDatetime;
		this.updateDatetime = updateDatetime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TYPE", precision = 1, scale = 0)
	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	@Column(name = "EXP_GROUP_ID", nullable = false)
	public int getExpGroupId() {
		return this.expGroupId;
	}

	public void setExpGroupId(int expGroupId) {
		this.expGroupId = expGroupId;
	}

	@Column(name = "SUB_GROUP")
	public Integer getSubGroup() {
		return this.subGroup;
	}

	public void setSubGroup(Integer subGroup) {
		this.subGroup = subGroup;
	}

	@Column(name = "DEPENDENT_ID")
	public Integer getDependentId() {
		return this.dependentId;
	}

	public void setDependentId(Integer dependentId) {
		this.dependentId = dependentId;
	}

	@Column(name = "DEPENDENT_GROUP_ID")
	public Integer getDependentGroupId() {
		return this.dependentGroupId;
	}

	public void setDependentGroupId(Integer dependentGroupId) {
		this.dependentGroupId = dependentGroupId;
	}

	@Column(name = "UNIT", length = 10)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "CHECK_BOX", precision = 1, scale = 0)
	public Boolean getCheckBox() {
		return this.checkBox;
	}

	public void setCheckBox(Boolean checkBox) {
		this.checkBox = checkBox;
	}

	@Column(name = "DISPLAY_ORDER")
	public Short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}

	@Column(name = "ACTIVE_FLG", precision = 1, scale = 0)
	public Boolean getActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(Boolean activeFlg) {
		this.activeFlg = activeFlg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_DATETIME", nullable = false, length = 19)
	public Date getInsertDatetime() {
		return this.insertDatetime;
	}

	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATETIME", length = 19)
	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}
