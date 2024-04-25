package com.hoa.dto;

import java.util.Date;

public class AuditLogDTO {

	    private Integer auditlogid;
	    private Integer userid;
	    private String actionperformed;
	    private String pagename;
	    private Integer communityid;
	    private Date createddate;
	    

	    // Getter and Setter for auditlogid
	    public Integer getAuditlogid() {
	        return auditlogid;
	    }

	    public void setAuditlogid(Integer auditlogid) {
	        this.auditlogid = auditlogid;
	    }

	    // Getter and Setter for userid
	    public Integer getUserid() {
	        return userid;
	    }

	    public void setUserid(Integer userid) {
	        this.userid = userid;
	    }

	    // Getter and Setter for actionperformed
	    public String getActionperformed() {
	        return actionperformed;
	    }

	    public void setActionperformed(String actionperformed) {
	        this.actionperformed = actionperformed;
	    }

	    // Getter and Setter for pagename
	    public String getPagename() {
	        return pagename;
	    }

	    public void setPagename(String pagename) {
	        this.pagename = pagename;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    // Getter and Setter for createddate
	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
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
			return "AuditlogDto [auditlogid=" + auditlogid + ", userid=" + userid + ", actionperformed="
					+ actionperformed + ", pagename=" + pagename + ", communityid=" + communityid + ", createddate="
					+ createddate + "]";
		}

		public AuditLogDTO(Integer auditlogid, Integer userid, String actionperformed, String pagename,
				Integer communityid, Date createddate) {
			super();
			this.auditlogid = auditlogid;
			this.userid = userid;
			this.actionperformed = actionperformed;
			this.pagename = pagename;
			this.communityid = communityid;
			this.createddate = createddate;
			
		}

		public AuditLogDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
