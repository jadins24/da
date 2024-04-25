package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class PaymentDetailDTO {

	    private Integer paymentdetailid;
	    private Integer clientid;
	    private Integer communityid;
	    private String paymenttype;
	    private String paymentmethod;
	    private Double amount;
	    private String paymentstatus;
	    private Boolean isapproved;
	    private Integer createdbyid;
	    private Date createddate;
	    private Integer modifiedbyid;
	    private Date modifieddate;
	    private String paymentbank;
	    private Date paymentdate;
	    private String reason;
	    private List<ServiceRequestDTO> listOfServicerequest;
	    private List<AmenityBookingDTO> listOfAmenitybooking;
	    private UserDTO user2;
	    private List<HoaFeeDTO> listOfHoafee;
	    private ClientDTO client;
	    private List<ViolationDetailDTO> listOfViolationdetail;
	    private UserDTO user;
	    private CommunityDTO community;

	    // Getters and Setters for all fields

	    public Integer getPaymentdetailid() {
	        return paymentdetailid;
	    }

	    public void setPaymentdetailid(Integer paymentdetailid) {
	        this.paymentdetailid = paymentdetailid;
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

	    public String getPaymenttype() {
	        return paymenttype;
	    }

	    public void setPaymenttype(String paymenttype) {
	        this.paymenttype = paymenttype;
	    }

	    public String getPaymentmethod() {
	        return paymentmethod;
	    }

	    public void setPaymentmethod(String paymentmethod) {
	        this.paymentmethod = paymentmethod;
	    }

	    public Double getAmount() {
	        return amount;
	    }

	    public void setAmount(Double amount) {
	        this.amount = amount;
	    }

	    public String getPaymentstatus() {
	        return paymentstatus;
	    }

	    public void setPaymentstatus(String paymentstatus) {
	        this.paymentstatus = paymentstatus;
	    }

	    public Boolean getIsapproved() {
	        return isapproved;
	    }

	    public void setIsapproved(Boolean isapproved) {
	        this.isapproved = isapproved;
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

	    public String getPaymentbank() {
	        return paymentbank;
	    }

	    public void setPaymentbank(String paymentbank) {
	        this.paymentbank = paymentbank;
	    }

	    public Date getPaymentdate() {
	        return paymentdate;
	    }

	    public void setPaymentdate(Date paymentdate) {
	        this.paymentdate = paymentdate;
	    }

	    public String getReason() {
	        return reason;
	    }

	    public void setReason(String reason) {
	        this.reason = reason;
	    }

	    public List<ServiceRequestDTO> getListOfServicerequest() {
	        return listOfServicerequest;
	    }

	    public void setListOfServicerequest(List<ServiceRequestDTO> listOfServicerequest) {
	        this.listOfServicerequest = listOfServicerequest;
	    }

	    public List<AmenityBookingDTO> getListOfAmenitybooking() {
	        return listOfAmenitybooking;
	    }

	    public void setListOfAmenitybooking(List<AmenityBookingDTO> listOfAmenitybooking) {
	        this.listOfAmenitybooking = listOfAmenitybooking;
	    }

	    public UserDTO getUser2() {
	        return user2;
	    }

	    public void setUser2(UserDTO user2) {
	        this.user2 = user2;
	    }

	    public List<HoaFeeDTO> getListOfHoafee() {
	        return listOfHoafee;
	    }

	    public void setListOfHoafee(List<HoaFeeDTO> listOfHoafee) {
	        this.listOfHoafee = listOfHoafee;
	    }

	    public ClientDTO getClient() {
	        return client;
	    }

	    public void setClient(ClientDTO client) {
	        this.client = client;
	    }

		@Override
		public String toString() {
			return "PaymentdetailDto [paymentdetailid=" + paymentdetailid + ", clientid=" + clientid + ", communityid="
					+ communityid + ", paymenttype=" + paymenttype + ", paymentmethod=" + paymentmethod + ", amount="
					+ amount + ", paymentstatus=" + paymentstatus + ", isapproved=" + isapproved + ", createdbyid="
					+ createdbyid + ", createddate=" + createddate + ", modifiedbyid=" + modifiedbyid
					+ ", modifieddate=" + modifieddate + ", paymentbank=" + paymentbank + ", paymentdate=" + paymentdate
					+ ", reason=" + reason + ", listOfServicerequest=" + listOfServicerequest
					+ ", listOfAmenitybooking=" + listOfAmenitybooking + ", user2=" + user2 + ", listOfHoafee="
					+ listOfHoafee + ", client=" + client + ", listOfViolationdetail=" + listOfViolationdetail
					+ ", user=" + user + ", community=" + community + "]";
		}

		public PaymentDetailDTO(Integer paymentdetailid, Integer clientid, Integer communityid, String paymenttype,
				String paymentmethod, Double amount, String paymentstatus, Boolean isapproved, Integer createdbyid,
				Date createddate, Integer modifiedbyid, Date modifieddate, String paymentbank, Date paymentdate,
				String reason, List<ServiceRequestDTO> listOfServicerequest,
				List<AmenityBookingDTO> listOfAmenitybooking, UserDTO user2, List<HoaFeeDTO> listOfHoafee,
				ClientDTO client, List<ViolationDetailDTO> listOfViolationdetail, UserDTO user,
				CommunityDTO community) {
			super();
			this.paymentdetailid = paymentdetailid;
			this.clientid = clientid;
			this.communityid = communityid;
			this.paymenttype = paymenttype;
			this.paymentmethod = paymentmethod;
			this.amount = amount;
			this.paymentstatus = paymentstatus;
			this.isapproved = isapproved;
			this.createdbyid = createdbyid;
			this.createddate = createddate;
			this.modifiedbyid = modifiedbyid;
			this.modifieddate = modifieddate;
			this.paymentbank = paymentbank;
			this.paymentdate = paymentdate;
			this.reason = reason;
			this.listOfServicerequest = listOfServicerequest;
			this.listOfAmenitybooking = listOfAmenitybooking;
			this.user2 = user2;
			this.listOfHoafee = listOfHoafee;
			this.client = client;
			this.listOfViolationdetail = listOfViolationdetail;
			this.user = user;
			this.community = community;
		}

		public PaymentDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
