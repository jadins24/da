package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO class for "Violation"
 */
public class ViolationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer violationid;
    private Integer violationtypeid;
    private String name;
    private Double amount;
    private Double latecharge;
    private Integer communityid;
    private Integer createdbyid;
    private Integer modifiedbyid;
    private Date createddate;
    private Date modifieddate;
    private ViolationTypeDTO violationtype;
    private List<ViolationDetailDTO> listOfViolationdetail;
    private UserDTO user;
    private UserDTO user2;
    private CommunityDTO community;
    
    public Integer getViolationid() {
		return violationid;
	}

	public void setViolationid(Integer violationid) {
		this.violationid = violationid;
	}

	public Integer getViolationtypeid() {
		return violationtypeid;
	}

	public void setViolationtypeid(Integer violationtypeid) {
		this.violationtypeid = violationtypeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getLatecharge() {
		return latecharge;
	}

	public void setLatecharge(Double latecharge) {
		this.latecharge = latecharge;
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

	public ViolationTypeDTO getViolationtype() {
		return violationtype;
	}

	public void setViolationtype(ViolationTypeDTO violationtype) {
		this.violationtype = violationtype;
	}

	public List<ViolationDetailDTO> getListOfViolationdetail() {
		return listOfViolationdetail;
	}

	public void setListOfViolationdetail(List<ViolationDetailDTO> listOfViolationdetail) {
		this.listOfViolationdetail = listOfViolationdetail;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "ViolationDTO{" +
                "violationid=" + violationid +
                ", violationtypeid=" + violationtypeid +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", latecharge=" + latecharge +
                ", communityid=" + communityid +
                ", createdbyid=" + createdbyid +
                ", modifiedbyid=" + modifiedbyid +
                ", createddate=" + createddate +
                ", modifieddate=" + modifieddate +
                '}';
    }

	public ViolationDTO(Integer violationid, Integer violationtypeid, String name, Double amount, Double latecharge,
			Integer communityid, Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate,
			ViolationTypeDTO violationtype, List<ViolationDetailDTO> listOfViolationdetail, UserDTO user, UserDTO user2,
			CommunityDTO community) {
		super();
		this.violationid = violationid;
		this.violationtypeid = violationtypeid;
		this.name = name;
		this.amount = amount;
		this.latecharge = latecharge;
		this.communityid = communityid;
		this.createdbyid = createdbyid;
		this.modifiedbyid = modifiedbyid;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
		this.violationtype = violationtype;
		this.listOfViolationdetail = listOfViolationdetail;
		this.user = user;
		this.user2 = user2;
		this.community = community;
	}

	public ViolationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
