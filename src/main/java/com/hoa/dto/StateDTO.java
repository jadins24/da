package com.hoa.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO class for "State"
 */
public class StateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer stateid;
    private String statename;
    private Integer countryid;
    private Boolean activestatus;
//    private List<EnquiryDTO> listOfEnquiry;
//    private CountryDTO country;
//    private List<AddressDTO> listOfAddress;

    // Constructor
    public StateDTO() {
    }

    // Constructor with fields
    public StateDTO(Integer stateid, String statename, Integer countryid, Boolean activestatus) {
        this.stateid = stateid;
        this.statename = statename;
        this.countryid = countryid;
        this.activestatus = activestatus;
      
    }

    // Getters and Setters
    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public Boolean getActivestatus() {
        return activestatus;
    }

    public void setActivestatus(Boolean activestatus) {
        this.activestatus = activestatus;
    }

//    public List<EnquiryDTO> getListOfEnquiry() {
//        return listOfEnquiry;
//    }
//
//    public void setListOfEnquiry(List<EnquiryDTO> listOfEnquiry) {
//        this.listOfEnquiry = listOfEnquiry;
//    }
//
//    public CountryDTO getCountry() {
//        return country;
//    }
//
//    public void setCountry(CountryDTO country) {
//        this.country = country;
//    }
//
//    public List<AddressDTO> getListOfAddress() {
//        return listOfAddress;
//    }
//
//    public void setListOfAddress(List<AddressDTO> listOfAddress) {
//        this.listOfAddress = listOfAddress;
//    }

    // toString method
    @Override
    public String toString() {
        return "StateDTO{" +
                "stateid=" + stateid +
                ", statename='" + statename + '\'' +
                ", countryid=" + countryid +
                ", activestatus=" + activestatus +
                '}';
    }
}
