package com.hoa.dto;

import java.util.Date;

public class FaqDTO {

	    private Integer faqid;
	    private String question;
	    private String answer;
	    private Integer roleid;
	    private Boolean activestatus;
	    private Integer communityid;
	    private Integer createdbyid;
	    private Integer modifiedbyid;
	    private Date createddate;
	    private Date modifieddate;
	    private UserDTO user2;
	    private RoleDTO role;
	    private UserDTO user;
	    private CommunityDTO community;

	    // Getters and Setters for all fields

	    public Integer getFaqid() {
	        return faqid;
	    }

	    public void setFaqid(Integer faqid) {
	        this.faqid = faqid;
	    }

	    public String getQuestion() {
	        return question;
	    }

	    public void setQuestion(String question) {
	        this.question = question;
	    }

	    public String getAnswer() {
	        return answer;
	    }

	    public void setAnswer(String answer) {
	        this.answer = answer;
	    }

	    public Integer getRoleid() {
	        return roleid;
	    }

	    public void setRoleid(Integer roleid) {
	        this.roleid = roleid;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    public Integer getCreatedbyid() {
	        return createdbyid;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdbyid = createdbyid;
	    }

	    public Integer getModifiedbyid() {
	        return modifiedbyid;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedbyid = modifiedbyid;
	    }

	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    public Date getModifieddate() {
	        return modifieddate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifieddate = modifieddate;
	    }

	    public UserDTO getUser2() {
	        return user2;
	    }

	    public void setUser2(UserDTO user2) {
	        this.user2 = user2;
	    }

	    public RoleDTO getRole() {
	        return role;
	    }

	    public void setRole(RoleDTO role) {
	        this.role = role;
	    }

	    public UserDTO getUser() {
	        return user;
	    }

	    public void setUser(UserDTO user) {
	        this.user = user;
	    }

	    public CommunityDTO getCommunity() {
	        return community;
	    }

	    public void setCommunity(CommunityDTO community) {
	        this.community = community;
	    }

		@Override
		public String toString() {
			return "FaqDto [faqid=" + faqid + ", question=" + question + ", answer=" + answer + ", roleid=" + roleid
					+ ", activestatus=" + activestatus + ", communityid=" + communityid + ", createdbyid=" + createdbyid
					+ ", modifiedbyid=" + modifiedbyid + ", createddate=" + createddate + ", modifieddate="
					+ modifieddate + ", user2=" + user2 + ", role=" + role + ", user=" + user + ", community="
					+ community + "]";
		}

		public FaqDTO(Integer faqid, String question, String answer, Integer roleid, Boolean activestatus,
				Integer communityid, Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate,
				UserDTO user2, RoleDTO role, UserDTO user, CommunityDTO community) {
			super();
			this.faqid = faqid;
			this.question = question;
			this.answer = answer;
			this.roleid = roleid;
			this.activestatus = activestatus;
			this.communityid = communityid;
			this.createdbyid = createdbyid;
			this.modifiedbyid = modifiedbyid;
			this.createddate = createddate;
			this.modifieddate = modifieddate;
			this.user2 = user2;
			this.role = role;
			this.user = user;
			this.community = community;
		}

		public FaqDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
