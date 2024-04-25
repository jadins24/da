package com.hoa.dto;

import java.util.Date;

public class AddressDTO {

	    private Integer addressid;
	    private String address;
	    private String city;
	    private Integer stateid;
	    private Integer countryid;
	    private Boolean activestatus;
	    private Integer createdbyid;
	    private Integer modifiedbyid;
	    private Date createddate;
	    private Date modifieddate;

	    // Getter and Setter for addressid
	    public Integer getAddressid() {
	        return addressid;
	    }

	    public void setAddressid(Integer addressid) {
	        this.addressid = addressid;
	    }

	    // Getter and Setter for address
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    // Getter and Setter for city
	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    // Getter and Setter for stateid
	    public Integer getStateid() {
	        return stateid;
	    }

	    public void setStateid(Integer stateid) {
	        this.stateid = stateid;
	    }

	    // Getter and Setter for countryid
	    public Integer getCountryid() {
	        return countryid;
	    }

	    public void setCountryid(Integer countryid) {
	        this.countryid = countryid;
	    }

	    // Getter and Setter for activestatus
	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	    // Getter and Setter for createdbyid
	    public Integer getCreatedbyid() {
	        return createdbyid;
	    }

	    public void setCreatedbyid(Integer createdbyid) {
	        this.createdbyid = createdbyid;
	    }

	    // Getter and Setter for modifiedbyid
	    public Integer getModifiedbyid() {
	        return modifiedbyid;
	    }

	    public void setModifiedbyid(Integer modifiedbyid) {
	        this.modifiedbyid = modifiedbyid;
	    }

	    // Getter and Setter for createddate
	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    // Getter and Setter for modifieddate
	    public Date getModifieddate() {
	        return modifieddate;
	    }

	    public void setModifieddate(Date modifieddate) {
	        this.modifieddate = modifieddate;
	    }

		@Override
		public String toString() {
			return "AddressDto [addressid=" + addressid + ", address=" + address + ", city=" + city + ", stateid="
					+ stateid + ", countryid=" + countryid + ", activestatus=" + activestatus + ", createdbyid="
					+ createdbyid + ", modifiedbyid=" + modifiedbyid + ", createddate=" + createddate
					+ ", modifieddate=" + modifieddate + "]";
		}

		public AddressDTO(Integer addressid, String address, String city, Integer stateid, Integer countryid,
				Boolean activestatus, Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate) {
			super();
			this.addressid = addressid;
			this.address = address;
			this.city = city;
			this.stateid = stateid;
			this.countryid = countryid;
			this.activestatus = activestatus;
			this.createdbyid = createdbyid;
			this.modifiedbyid = modifiedbyid;
			this.createddate = createddate;
			this.modifieddate = modifieddate;
		}

		public AddressDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
