package com.hoa.dto;

import java.util.Date;

public class BankDetailDTO {

	    private Integer bankid;
	    private Integer communityid;
	    private String routingnumber;
	    private String accountnumber;
	    private Boolean isverified;
	    private Integer createdbyid;
	    private Date createddate;
	    private Integer modifiedbyid;
	    private Date modifieddate;
	   

	    // Getter and Setter for bankid
	    public Integer getBankid() {
	        return bankid;
	    }

	    public void setBankid(Integer bankid) {
	        this.bankid = bankid;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    // Getter and Setter for routingnumber
	    public String getRoutingnumber() {
	        return routingnumber;
	    }

	    public void setRoutingnumber(String routingnumber) {
	        this.routingnumber = routingnumber;
	    }

	    // Getter and Setter for accountnumber
	    public String getAccountnumber() {
	        return accountnumber;
	    }

	    public void setAccountnumber(String accountnumber) {
	        this.accountnumber = accountnumber;
	    }

	    // Getter and Setter for isverified
	    public Boolean getIsverified() {
	        return isverified;
	    }

	    public void setIsverified(Boolean isverified) {
	        this.isverified = isverified;
	    }

	    // Getter and Setter for createdbyid
	    public Integer getCreatedbyid() {
	        return createdbyid;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdbyid = createdbyid;
	    }

	    // Getter and Setter for createddate
	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    // Getter and Setter for modifiedbyid
	    public Integer getModifiedbyid() {
	        return modifiedbyid;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedbyid = modifiedbyid;
	    }

	    // Getter and Setter for modifieddate
	    public Date getModifieddate() {
	        return modifieddate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifieddate = modifieddate;
	    }

	    // Getter and Setter for user
//	    public UserDTO getUser() {
//	        return user;
//	    }
//
//	    public void setUser(UserDTO user) {
//	        this.user = user;
//	    }
//
//	    // Getter and Setter for user2
//	    public UserDTO getUser2() {
//	        return user2;
//	    }
//
//	    public void setUser2(UserDTO user2) {
//	        this.user2 = user2;
//	    }
//
//	    // Getter and Setter for community
//	    public CommunityDTO getCommunity() {
//	        return community;
//	    }
//
//	    public void setCommunity(CommunityDTO community) {
//	        this.community = community;
//	    }

		@Override
		public String toString() {
			return "BankdetailDto [bankid=" + bankid + ", communityid=" + communityid + ", routingnumber="
					+ routingnumber + ", accountnumber=" + accountnumber + ", isverified=" + isverified
					+ ", createdbyid=" + createdbyid + ", createddate=" + createddate + ", modifiedbyid=" + modifiedbyid
					+ ", modifieddate=" + modifieddate  + "]";
		}

		public BankDetailDTO(Integer bankid, Integer communityid, String routingnumber, String accountnumber,
				Boolean isverified, Integer createdbyid, Date createddate, Integer modifiedbyid, Date modifieddate) {
			super();
			this.bankid = bankid;
			this.communityid = communityid;
			this.routingnumber = routingnumber;
			this.accountnumber = accountnumber;
			this.isverified = isverified;
			this.createdbyid = createdbyid;
			this.createddate = createddate;
			this.modifiedbyid = modifiedbyid;
			this.modifieddate = modifieddate;
		
		}

		public BankDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
