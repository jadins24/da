package com.hoa.dto;

import java.util.Date;

public class CommunityDocumentDTO {

	    private Integer communitydocumentid;
	    private Integer communityid;
	    private Integer ownerid;
	    private String name;
	    private Date uploadeddate;
	    private Integer uploadedbyid;
	    private String documenturl;
	    private Integer createdbyid;
	    private Integer modifiedbyid;
	    private Date createddate;
	    private Date modifieddate;
	    private String documenttype;

	    // Getters and Setters for all fields
	    public Integer getCommunitydocumentid() {
	        return communitydocumentid;
	    }

	    public void setCommunitydocumentid(Integer communitydocumentid) {
	        this.communitydocumentid = communitydocumentid;
	    }

	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    public Integer getOwnerid() {
	        return ownerid;
	    }

	    public void setOwnerid(Integer ownerid) {
	        this.ownerid = ownerid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Date getUploadeddate() {
	        return uploadeddate;
	    }

	    public void setUploadeddate(Date uploadeddate) {
	        this.uploadeddate = uploadeddate;
	    }

	    public Integer getUploadedbyid() {
	        return uploadedbyid;
	    }

	    public void setUploadedbyid(Integer uploadedbyid) {
	        this.uploadedbyid = uploadedbyid;
	    }

	    public String getDocumenturl() {
	        return documenturl;
	    }

	    public void setDocumenturl(String documenturl) {
	        this.documenturl = documenturl;
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

	    public String getDocumenttype() {
	        return documenttype;
	    }

	    public void setDocumenttype(String documenttype) {
	        this.documenttype = documenttype;
	    }

		@Override
		public String toString() {
			return "CommunitydocumentDto [communitydocumentid=" + communitydocumentid + ", communityid=" + communityid
					+ ", ownerid=" + ownerid + ", name=" + name + ", uploadeddate=" + uploadeddate + ", uploadedbyid="
					+ uploadedbyid + ", documenturl=" + documenturl + ", createdbyid=" + createdbyid + ", modifiedbyid="
					+ modifiedbyid + ", createddate=" + createddate + ", modifieddate=" + modifieddate
					+ ", documenttype=" + documenttype + "]";
		}

		public CommunityDocumentDTO(Integer communitydocumentid, Integer communityid, Integer ownerid, String name,
				Date uploadeddate, Integer uploadedbyid, String documenturl, Integer createdbyid, Integer modifiedbyid,
				Date createddate, Date modifieddate, String documenttype) {
			super();
			this.communitydocumentid = communitydocumentid;
			this.communityid = communityid;
			this.ownerid = ownerid;
			this.name = name;
			this.uploadeddate = uploadeddate;
			this.uploadedbyid = uploadedbyid;
			this.documenturl = documenturl;
			this.createdbyid = createdbyid;
			this.modifiedbyid = modifiedbyid;
			this.createddate = createddate;
			this.modifieddate = modifieddate;
			this.documenttype = documenttype;
		}

		public CommunityDocumentDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
