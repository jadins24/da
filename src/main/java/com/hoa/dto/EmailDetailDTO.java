package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class EmailDetailDTO {

	    private Integer emaildetailid;
	    private Integer communityid;
	    private String emailtype;
	    private String emailfrom;
	    private String emailto;
	    private String subject;
	    private String content;
	    private String emailstatus;
	    private Date createddate;
	    private Date senddate;
	    private List<EmailSendToDTO> listOfEmailsendto;
	    private CommunityDTO community;

	    // Getters and Setters for all fields

	    public Integer getEmaildetailid() {
	        return emaildetailid;
	    }

	    public void setEmaildetailid(Integer emaildetailid) {
	        this.emaildetailid = emaildetailid;
	    }

	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    public String getEmailtype() {
	        return emailtype;
	    }

	    public void setEmailtype(String emailtype) {
	        this.emailtype = emailtype;
	    }

	    public String getEmailfrom() {
	        return emailfrom;
	    }

	    public void setEmailfrom(String emailfrom) {
	        this.emailfrom = emailfrom;
	    }

	    public String getEmailto() {
	        return emailto;
	    }

	    public void setEmailto(String emailto) {
	        this.emailto = emailto;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public String getEmailstatus() {
	        return emailstatus;
	    }

	    public void setEmailstatus(String emailstatus) {
	        this.emailstatus = emailstatus;
	    }

	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    public Date getSenddate() {
	        return senddate;
	    }

	    public void setSenddate(Date senddate) {
	        this.senddate = senddate;
	    }

	    public List<EmailSendToDTO> getListOfEmailsendto() {
	        return listOfEmailsendto;
	    }

	    public void setListOfEmailsendto(List<EmailSendToDTO> listOfEmailsendto) {
	        this.listOfEmailsendto = listOfEmailsendto;
	    }

	    public CommunityDTO getCommunity() {
	        return community;
	    }

	    public void setCommunity(CommunityDTO community) {
	        this.community = community;
	    }

		@Override
		public String toString() {
			return "EmaildetailDto [emaildetailid=" + emaildetailid + ", communityid=" + communityid + ", emailtype="
					+ emailtype + ", emailfrom=" + emailfrom + ", emailto=" + emailto + ", subject=" + subject
					+ ", content=" + content + ", emailstatus=" + emailstatus + ", createddate=" + createddate
					+ ", senddate=" + senddate + ", listOfEmailsendto=" + listOfEmailsendto + ", community=" + community
					+ "]";
		}

		public EmailDetailDTO(Integer emaildetailid, Integer communityid, String emailtype, String emailfrom,
				String emailto, String subject, String content, String emailstatus, Date createddate, Date senddate,
				List<EmailSendToDTO> listOfEmailsendto, CommunityDTO community) {
			super();
			this.emaildetailid = emaildetailid;
			this.communityid = communityid;
			this.emailtype = emailtype;
			this.emailfrom = emailfrom;
			this.emailto = emailto;
			this.subject = subject;
			this.content = content;
			this.emailstatus = emailstatus;
			this.createddate = createddate;
			this.senddate = senddate;
			this.listOfEmailsendto = listOfEmailsendto;
			this.community = community;
		}

		public EmailDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	   
}
