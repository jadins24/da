package com.hoa.dto;

import java.util.Date;

public class NewsDTO {

	    private Integer newsid;
	    private String title;
	    private String newscontent;
	    private Date datepublished;
	    private Integer publishtoclientid;
	    private Integer communityid;
	    private Integer createdbyid;
	    private Date createddate;
	    private Integer modifiedbyid;
	    private Date modifieddate;
	    private ClientDTO client;
	    private UserDTO user;
	    private UserDTO user2;
	    private CommunityDTO community;

	    // Getters and Setters for all fields

	    public Integer getNewsid() {
	        return newsid;
	    }

	    public void setNewsid(Integer newsid) {
	        this.newsid = newsid;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getNewscontent() {
	        return newscontent;
	    }

	    public void setNewscontent(String newscontent) {
	        this.newscontent = newscontent;
	    }

	    public Date getDatepublished() {
	        return datepublished;
	    }

	    public void setDatepublished(Date datepublished) {
	        this.datepublished = datepublished;
	    }

	    public Integer getPublishtoclientid() {
	        return publishtoclientid;
	    }

	    public void setPublishtoclientid(Integer publishtoclientid) {
	        this.publishtoclientid = publishtoclientid;
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

	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    public Integer getModifiedbyid() {
	        return modifiedbyid;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedbyid = modifiedbyid;
	    }

	    public Date getModifieddate() {
	        return modifieddate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifieddate = modifieddate;
	    }

	    public ClientDTO getClient() {
	        return client;
	    }

	    public void setClient(ClientDTO client) {
	        this.client = client;
	    }

	    public UserDTO getUser() {
	        return user;
	    }

	    public void setUser(UserDTO user) {
	        this.user = user;
	    }

	    public UserDTO getUser2() {
	        return user2;
	    }

	    public void setUser2(UserDTO user2) {
	        this.user2 = user2;
	    }

	    public CommunityDTO getCommunity() {
	        return community;
	    }

	    public void setCommunity(CommunityDTO community) {
	        this.community = community;
	    }

		@Override
		public String toString() {
			return "NewsDto [newsid=" + newsid + ", title=" + title + ", newscontent=" + newscontent
					+ ", datepublished=" + datepublished + ", publishtoclientid=" + publishtoclientid + ", communityid="
					+ communityid + ", createdbyid=" + createdbyid + ", createddate=" + createddate + ", modifiedbyid="
					+ modifiedbyid + ", modifieddate=" + modifieddate + ", client=" + client + ", user=" + user
					+ ", user2=" + user2 + ", community=" + community + "]";
		}

		public NewsDTO(Integer newsid, String title, String newscontent, Date datepublished, Integer publishtoclientid,
				Integer communityid, Integer createdbyid, Date createddate, Integer modifiedbyid, Date modifieddate,
				ClientDTO client, UserDTO user, UserDTO user2, CommunityDTO community) {
			super();
			this.newsid = newsid;
			this.title = title;
			this.newscontent = newscontent;
			this.datepublished = datepublished;
			this.publishtoclientid = publishtoclientid;
			this.communityid = communityid;
			this.createdbyid = createdbyid;
			this.createddate = createddate;
			this.modifiedbyid = modifiedbyid;
			this.modifieddate = modifieddate;
			this.client = client;
			this.user = user;
			this.user2 = user2;
			this.community = community;
		}

		public NewsDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
