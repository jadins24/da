package com.hoa.dto;

import java.util.List;

public class CountryDTO {

	    private Integer countryid;
	    private String countryname;
	    private Boolean activestatus;
	   

	    // Getters and Setters for all fields

	    public Integer getCountryid() {
	        return countryid;
	    }

	    public void setCountryid(Integer countryid) {
	        this.countryid = countryid;
	    }

	    public String getCountryname() {
	        return countryname;
	    }

	    public void setCountryname(String countryname) {
	        this.countryname = countryname;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	   
		@Override
		public String toString() {
			return "CountryDto [countryid=" + countryid + ", countryname=" + countryname + ", activestatus="
					+ activestatus + "]";
		}

		public CountryDTO(Integer countryid, String countryname, Boolean activestatus
				) {
			super();
			this.countryid = countryid;
			this.countryname = countryname;
			this.activestatus = activestatus;
			
		}

		public CountryDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
