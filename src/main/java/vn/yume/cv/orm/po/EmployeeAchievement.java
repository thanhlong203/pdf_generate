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
 * EmployeeAchievement generated by hbm2java
 */
@Entity
@Table(name = "employee_achievement", catalog = "SKILL_MNG")
public class EmployeeAchievement implements java.io.Serializable {

	private Integer id;
	private Boolean status;
	private int employeeId;
	private Integer projectId;
	private String achievement;
	private int lastModifier;
	private Date lastModifiedTime;
	private Date lastAcceptedTime;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public EmployeeAchievement() {
	}

	public EmployeeAchievement(int employeeId, int lastModifier, Date lastModifiedTime, Date insertDatetime) {
		this.employeeId = employeeId;
		this.lastModifier = lastModifier;
		this.lastModifiedTime = lastModifiedTime;
		this.insertDatetime = insertDatetime;
	}

	public EmployeeAchievement(Boolean status, int employeeId, Integer projectId, String achievement, int lastModifier,
			Date lastModifiedTime, Date lastAcceptedTime, Boolean activeFlg, Date insertDatetime, Date updateDatetime) {
		this.status = status;
		this.employeeId = employeeId;
		this.projectId = projectId;
		this.achievement = achievement;
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

	@Column(name = "ACHIEVEMENT", length = 1000)
	public String getAchievement() {
		return this.achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	@Column(name = "LAST_MODIFIER", nullable = false)
	public int getLastModifier() {
		return this.lastModifier;
	}

	public void setLastModifier(int lastModifier) {
		this.lastModifier = lastModifier;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_MODIFIED_TIME", nullable = false, length = 19)
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
