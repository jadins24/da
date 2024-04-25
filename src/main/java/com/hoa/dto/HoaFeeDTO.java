package com.hoa.dto;

import java.util.Date;

public class HoaFeeDTO {

	    private Integer hoafeeid;
	    private Integer clientid;
	    private Integer communityid;
	    private Integer paymentdetailid;
	    private String paymentstatus;
	    private Integer createdbyid;
	    private Date createddate;
	    private Integer modifiedbyid;
	    private Date modifieddate;
	    private UserDTO user;
	    private UserDTO user2;
	    private ClientDTO client;
	    private PaymentDetailDTO paymentdetail;
	    private CommunityDTO community;

	    // Getters and Setters for all fields

	    public Integer getHoafeeid() {
	        return hoafeeid;
	    }

	    public void setHoafeeid(Integer hoafeeid) {
	        this.hoafeeid = hoafeeid;
	    }

	    public Integer getClientid() {
	        return clientid;
	    }

	    public void setClientid(Integer clientid) {
	        this.clientid = clientid;
	    }

	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    public Integer getPaymentdetailid() {
	        return paymentdetailid;
	    }

	    public void setPaymentdetailid(Integer paymentdetailid) {
	        this.paymentdetailid = paymentdetailid;
	    }

	    public String getPaymentstatus() {
	        return paymentstatus;
	    }

	    public void setPaymentstatus(String paymentstatus) {
	        this.paymentstatus = paymentstatus;
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

	    public ClientDTO getClient() {
	        return client;
	    }

	    public void setClient(ClientDTO client) {
	        this.client = client;
	    }

	    public PaymentDetailDTO getPaymentdetail() {
	        return paymentdetail;
	    }

	    public void setPaymentdetail(PaymentDetailDTO paymentdetail) {
	        this.paymentdetail = paymentdetail;
	    }

	    public CommunityDTO getCommunity() {
	        return community;
	    }

	    public void setCommunity(CommunityDTO community) {
	        this.community = community;
	    }

		@Override
		public String toString() {
			return "HoafeeDto [hoafeeid=" + hoafeeid + ", clientid=" + clientid + ", communityid=" + communityid
					+ ", paymentdetailid=" + paymentdetailid + ", paymentstatus=" + paymentstatus + ", createdbyid="
					+ createdbyid + ", createddate=" + createddate + ", modifiedbyid=" + modifiedbyid
					+ ", modifieddate=" + modifieddate + ", user=" + user + ", user2=" + user2 + ", client=" + client
					+ ", paymentdetail=" + paymentdetail + ", community=" + community + "]";
		}

		public HoaFeeDTO(Integer hoafeeid, Integer clientid, Integer communityid, Integer paymentdetailid,
				String paymentstatus, Integer createdbyid, Date createddate, Integer modifiedbyid, Date modifieddate,
				UserDTO user, UserDTO user2, ClientDTO client, PaymentDetailDTO paymentdetail, CommunityDTO community) {
			super();
			this.hoafeeid = hoafeeid;
			this.clientid = clientid;
			this.communityid = communityid;
			this.paymentdetailid = paymentdetailid;
			this.paymentstatus = paymentstatus;
			this.createdbyid = createdbyid;
			this.createddate = createddate;
			this.modifiedbyid = modifiedbyid;
			this.modifieddate = modifieddate;
			this.user = user;
			this.user2 = user2;
			this.client = client;
			this.paymentdetail = paymentdetail;
			this.community = community;
		}

		public HoaFeeDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
