package vn.yume.cv.orm.po;
// Generated Apr 16, 2018 10:58:41 AM by Hibernate Tools 5.1.6.Final

import java.util.Date;

/**
 * QacQuestionTemplate generated by hbm2java
 */
public class QacQuestionTemplate implements java.io.Serializable {

	private Integer id;
	private Integer companyId;
	private String question;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public QacQuestionTemplate() {
	}

	public QacQuestionTemplate(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public QacQuestionTemplate(Integer companyId, String question, Boolean activeFlg, Date insertDatetime,
			Date updateDatetime) {
		this.companyId = companyId;
		this.question = question;
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

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
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