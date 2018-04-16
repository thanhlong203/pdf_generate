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
 * EmployeeSkill generated by hbm2java
 */
@Entity
@Table(name = "employee_skill", catalog = "SKILL_MNG")
public class EmployeeSkill implements java.io.Serializable {

	private Integer id;
	private Boolean status;
	private String skillDetailId;
	private int employeeId;
	private Integer projectId;
	private Integer evaluationType;
	private String description;
	private Integer skillLevelId;
	private Integer expValue;
	private Integer gradeValue;
	private Integer lastModifier;
	private Date lastModifiedTime;
	private Date lastAcceptedTime;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public EmployeeSkill() {
	}

	public EmployeeSkill(int employeeId, Date insertDatetime) {
		this.employeeId = employeeId;
		this.insertDatetime = insertDatetime;
	}

	public EmployeeSkill(Boolean status, String skillDetailId, int employeeId, Integer projectId,
			Integer evaluationType, String description, Integer skillLevelId, Integer expValue, Integer gradeValue,
			Integer lastModifier, Date lastModifiedTime, Date lastAcceptedTime, Boolean activeFlg, Date insertDatetime,
			Date updateDatetime) {
		this.status = status;
		this.skillDetailId = skillDetailId;
		this.employeeId = employeeId;
		this.projectId = projectId;
		this.evaluationType = evaluationType;
		this.description = description;
		this.skillLevelId = skillLevelId;
		this.expValue = expValue;
		this.gradeValue = gradeValue;
		this.lastModifier = lastModifier;
		this.lastModifiedTime = lastModifiedTime;
		this.lastAcceptedTime = lastAcceptedTime;
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

	@Column(name = "STATUS", precision = 1, scale = 0)
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "SKILL_DETAIL_ID", length = 10)
	public String getSkillDetailId() {
		return this.skillDetailId;
	}

	public void setSkillDetailId(String skillDetailId) {
		this.skillDetailId = skillDetailId;
	}

	@Column(name = "EMPLOYEE_ID", nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "PROJECT_ID")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "EVALUATION_TYPE")
	public Integer getEvaluationType() {
		return this.evaluationType;
	}

	public void setEvaluationType(Integer evaluationType) {
		this.evaluationType = evaluationType;
	}

	@Column(name = "DESCRIPTION", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "SKILL_LEVEL_ID")
	public Integer getSkillLevelId() {
		return this.skillLevelId;
	}

	public void setSkillLevelId(Integer skillLevelId) {
		this.skillLevelId = skillLevelId;
	}

	@Column(name = "EXP_VALUE")
	public Integer getExpValue() {
		return this.expValue;
	}

	public void setExpValue(Integer expValue) {
		this.expValue = expValue;
	}

	@Column(name = "GRADE_VALUE")
	public Integer getGradeValue() {
		return this.gradeValue;
	}

	public void setGradeValue(Integer gradeValue) {
		this.gradeValue = gradeValue;
	}

	@Column(name = "LAST_MODIFIER")
	public Integer getLastModifier() {
		return this.lastModifier;
	}

	public void setLastModifier(Integer lastModifier) {
		this.lastModifier = lastModifier;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_MODIFIED_TIME", length = 19)
	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_ACCEPTED_TIME", length = 19)
	public Date getLastAcceptedTime() {
		return this.lastAcceptedTime;
	}

	public void setLastAcceptedTime(Date lastAcceptedTime) {
		this.lastAcceptedTime = lastAcceptedTime;
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
