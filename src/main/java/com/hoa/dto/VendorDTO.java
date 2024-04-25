package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO class for "Vendor"
 */
public class VendorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer vendorid;
    private String name;
    private String emailid;
    private String phone;
    private String zipcode;
    private Integer servicetypeid;
    private Integer communityid;
    private Date licenseexpirydate;
    private Integer createdbyid;
    private Integer modifiedbyid;
    private Date createddate;
    private Date modifieddate;
    private UserDTO user;
    private UserDTO user2;
    private ServiceTypeDTO servicetype;
    private CommunityDTO community;
    private List<ServiceRequestDTO> listOfServicerequest;
   
    public Integer getVendorid() {
		return vendorid;
	}

	public void setVendorid(Integer vendorid) {
		this.vendorid = vendorid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getServicetypeid() {
		return servicetypeid;
	}

	public void setServicetypeid(Integer servicetypeid) {
		this.servicetypeid = servicetypeid;
	}

	public Integer getCommunityid() {
		return communityid;
	}

	public void setCommunityid(Integer communityid) {
		this.communityid = communityid;
	}

	public Date getLicenseexpirydate() {
		return licenseexpirydate;
	}

	public void setLicenseexpirydate(Date licenseexpirydate) {
		this.licenseexpirydate = licenseexpirydate;
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

	public ServiceTypeDTO getServicetype() {
		return servicetype;
	}

	public void setServicetype(ServiceTypeDTO servicetype) {
		this.servicetype = servicetype;
	}

	public CommunityDTO getCommunity() {
		return community;
	}

	public void setCommunity(CommunityDTO community) {
		this.community = community;
	}

	public List<ServiceRequestDTO> getListOfServicerequest() {
		return listOfServicerequest;
	}

	public void setListOfServicerequest(List<ServiceRequestDTO> listOfServicerequest) {
		this.listOfServicerequest = listOfServicerequest;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "VendorDTO{" +
                "vendorid=" + vendorid +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phone='" + phone + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", servicetypeid=" + servicetypeid +
                ", communityid=" + communityid +
                ", licenseexpirydate=" + licenseexpirydate +
                ", createdbyid=" + createdbyid +
                ", modifiedbyid=" + modifiedbyid +
                ", createddate=" + createddate +
                ", modifieddate=" + modifieddate +
                '}';
    }

	public VendorDTO(Integer vendorid, String name, String emailid, String phone, String zipcode, Integer servicetypeid,
			Integer communityid, Date licenseexpirydate, Integer createdbyid, Integer modifiedbyid, Date createddate,
			Date modifieddate, UserDTO user, UserDTO user2, ServiceTypeDTO servicetype, CommunityDTO community,
			List<ServiceRequestDTO> listOfServicerequest) {
		super();
		this.vendorid = vendorid;
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.zipcode = zipcode;
		this.servicetypeid = servicetypeid;
		this.communityid = communityid;
		this.licenseexpirydate = licenseexpirydate;
		this.createdbyid = createdbyid;
		this.modifiedbyid = modifiedbyid;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
		this.user = user;
		this.user2 = user2;
		this.servicetype = servicetype;
		this.community = community;
		this.listOfServicerequest = listOfServicerequest;
	}

	public VendorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
