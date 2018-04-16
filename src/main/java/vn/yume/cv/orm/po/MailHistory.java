package vn.yume.cv.orm.po;
// Generated Apr 16, 2018 10:58:41 AM by Hibernate Tools 5.1.6.Final

import java.util.Date;

/**
 * MailHistory generated by hbm2java
 */
public class MailHistory implements java.io.Serializable {

	private Integer id;
	private String mailCode;
	private String mailFrom;
	private String mailTo;
	private String mailCc;
	private String mailBcc;
	private String mailTitle;
	private String mailContent;
	private Date sentDatetime;
	private Boolean activeFlg;
	private Date insertDatetime;
	private Date updateDatetime;

	public MailHistory() {
	}

	public MailHistory(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public MailHistory(String mailCode, String mailFrom, String mailTo, String mailCc, String mailBcc, String mailTitle,
			String mailContent, Date sentDatetime, Boolean activeFlg, Date insertDatetime, Date updateDatetime) {
		this.mailCode = mailCode;
		this.mailFrom = mailFrom;
		this.mailTo = mailTo;
		this.mailCc = mailCc;
		this.mailBcc = mailBcc;
		this.mailTitle = mailTitle;
		this.mailContent = mailContent;
		this.sentDatetime = sentDatetime;
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

	public String getMailCode() {
		return this.mailCode;
	}

	public void setMailCode(String mailCode) {
		this.mailCode = mailCode;
	}

	public String getMailFrom() {
		return this.mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getMailTo() {
		return this.mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getMailCc() {
		return this.mailCc;
	}

	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}

	public String getMailBcc() {
		return this.mailBcc;
	}

	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}

	public String getMailTitle() {
		return this.mailTitle;
	}

	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}

	public String getMailContent() {
		return this.mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	public Date getSentDatetime() {
		return this.sentDatetime;
	}

	public void setSentDatetime(Date sentDatetime) {
		this.sentDatetime = sentDatetime;
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
