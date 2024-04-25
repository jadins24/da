package com.hoa.dto;

import java.util.Date;

public class EnquiryDTO {

	    private Integer enquiryid;
	    private String firstname;
	    private String lastname;
	    private String emailid;
	    private String phone;
	    private String city;
	    private Integer countryid;
	    private Integer stateid;
	    private Integer planid;
	    private Date createddate;
	    private CountryDTO country;
	    private StateDTO state;
	    private PlanDTO plan;

	    // Getters and Setters for all fields

	    public Integer getEnquiryid() {
	        return enquiryid;
	    }

	    public void setEnquiryid(Integer enquiryid) {
	        this.enquiryid = enquiryid;
	    }

	    public String getFirstname() {
	        return firstname;
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
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

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public Integer getCountryid() {
	        return countryid;
	    }

	    public void setCountryid(Integer countryid) {
	        this.countryid = countryid;
	    }

	    public Integer getStateid() {
	        return stateid;
	    }

	    public void setStateid(Integer stateid) {
	        this.stateid = stateid;
	    }

	    public Integer getPlanid() {
	        return planid;
	    }

	    public void setPlanid(Integer planid) {
	        this.planid = planid;
	    }

	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    public CountryDTO getCountry() {
	        return country;
	    }

	    public void setCountry(CountryDTO country) {
	        this.country = country;
	    }

	    public StateDTO getState() {
	        return state;
	    }

	    public void setState(StateDTO state) {
	        this.state = state;
	    }

	    public PlanDTO getPlan() {
	        return plan;
	    }

	    public void setPlan(PlanDTO plan) {
	        this.plan = plan;
	    }

		@Override
		public String toString() {
			return "EnquiryDto [enquiryid=" + enquiryid + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", emailid=" + emailid + ", phone=" + phone + ", city=" + city + ", countryid=" + countryid
					+ ", stateid=" + stateid + ", planid=" + planid + ", createddate=" + createddate + ", country="
					+ country + ", state=" + state + ", plan=" + plan + "]";
		}

		public EnquiryDTO(Integer enquiryid, String firstname, String lastname, String emailid, String phone,
				String city, Integer countryid, Integer stateid, Integer planid, Date createddate, CountryDTO country,
				StateDTO state, PlanDTO plan) {
			super();
			this.enquiryid = enquiryid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.emailid = emailid;
			this.phone = phone;
			this.city = city;
			this.countryid = countryid;
			this.stateid = stateid;
			this.planid = planid;
			this.createddate = createddate;
			this.country = country;
			this.state = state;
			this.plan = plan;
		}

		public EnquiryDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
