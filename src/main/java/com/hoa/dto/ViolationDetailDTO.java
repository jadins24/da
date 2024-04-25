package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO class for "Violationdetail"
 */
public class ViolationDetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer violationid;
    private Date violationdate;
    private Integer communityid;
    private Double amount;
    private Integer clientid;
    private String paymentstatus;
    private String violationstatus;
    private Integer createdbyid;
    private Date createddate;
    private Integer modifiedbyid;
    private Date modifieddate;
    private Integer paymentdetailid;
    private UserDTO user;
    private UserDTO user2;
    private PaymentDetailDTO paymentdetail;
    private CommunityDTO community;
    private ViolationDTO violation;
    private ClientDTO client;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getViolationid() {
		return violationid;
	}

	public void setViolationid(Integer violationid) {
		this.violationid = violationid;
	}

	public Date getViolationdate() {
		return violationdate;
	}

	public void setViolationdate(Date violationdate) {
		this.violationdate = violationdate;
	}

	public Integer getCommunityid() {
		return communityid;
	}

	public void setCommunityid(Integer communityid) {
		this.communityid = communityid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public String getViolationstatus() {
		return violationstatus;
	}

	public void setViolationstatus(String violationstatus) {
		this.violationstatus = violationstatus;
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

	public Integer getPaymentdetailid() {
		return paymentdetailid;
	}

	public void setPaymentdetailid(Integer paymentdetailid) {
		this.paymentdetailid = paymentdetailid;
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

	public ViolationDTO getViolation() {
		return violation;
	}

	public void setViolation(ViolationDTO violation) {
		this.violation = violation;
	}

	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "ViolationDetailDto{" +
                "id=" + id +
                ", violationid=" + violationid +
                ", violationdate=" + violationdate +
                ", communityid=" + communityid +
                ", amount=" + amount +
                ", clientid=" + clientid +
                ", paymentstatus='" + paymentstatus + '\'' +
                ", violationstatus='" + violationstatus + '\'' +
                ", createdbyid=" + createdbyid +
                ", createddate=" + createddate +
                ", modifiedbyid=" + modifiedbyid +
                ", modifieddate=" + modifieddate +
                ", paymentdetailid=" + paymentdetailid +
                '}';
    }

	public ViolationDetailDTO(Integer id, Integer violationid, Date violationdate, Integer communityid, Double amount,
			Integer clientid, String paymentstatus, String violationstatus, Integer createdbyid, Date createddate,
			Integer modifiedbyid, Date modifieddate, Integer paymentdetailid, UserDTO user, UserDTO user2,
			PaymentDetailDTO paymentdetail, CommunityDTO community, ViolationDTO violation, ClientDTO client) {
		super();
		this.id = id;
		this.violationid = violationid;
		this.violationdate = violationdate;
		this.communityid = communityid;
		this.amount = amount;
		this.clientid = clientid;
		this.paymentstatus = paymentstatus;
		this.violationstatus = violationstatus;
		this.createdbyid = createdbyid;
		this.createddate = createddate;
		this.modifiedbyid = modifiedbyid;
		this.modifieddate = modifieddate;
		this.paymentdetailid = paymentdetailid;
		this.user = user;
		this.user2 = user2;
		this.paymentdetail = paymentdetail;
		this.community = community;
		this.violation = violation;
		this.client = client;
	}

	public ViolationDetailDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
