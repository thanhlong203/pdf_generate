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
 * Company generated by hbm2java
 */
@Entity
@Table(name = "company", catalog = "SKILL_MNG")
public class Company implements java.io.Serializable {

	private Integer id;
	private String companyName;
	private String email;
	private String phone;
	private String webUrl;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public Company() {
	}

	public Company(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public Company(String companyName, String email, String phone, String webUrl, Boolean activeFlg,
			Date insertDatetime, Date updateDatetime) {
		this.companyName = companyName;
		this.email = email;
		this.phone = phone;
		this.webUrl = webUrl;
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

	@Column(name = "COMPANY_NAME")
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONE", length = 10)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "WEB_URL", length = 50)
	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
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
