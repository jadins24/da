package com.hoa.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO class for "Servicetype"
 */
public class ServiceTypeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Boolean activestatus;
    private List<VendorDTO> listOfVendor;
    private List<ServiceRequestDTO> listOfServicerequest;

    // Constructor
    public ServiceTypeDTO() {
    }

    // Constructor with fields
    public ServiceTypeDTO(Integer id, String name, Boolean activestatus, List<VendorDTO> listOfVendor,
                          List<ServiceRequestDTO> listOfServicerequest) {
        this.id = id;
        this.name = name;
        this.activestatus = activestatus;
        this.listOfVendor = listOfVendor;
        this.listOfServicerequest = listOfServicerequest;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActivestatus() {
        return activestatus;
    }

    public void setActivestatus(Boolean activestatus) {
        this.activestatus = activestatus;
    }

    public List<VendorDTO> getListOfVendor() {
        return listOfVendor;
    }

    public void setListOfVendor(List<VendorDTO> listOfVendor) {
        this.listOfVendor = listOfVendor;
    }

    public List<ServiceRequestDTO> getListOfServicerequest() {
        return listOfServicerequest;
    }

    public void setListOfServicerequest(List<ServiceRequestDTO> listOfServicerequest) {
        this.listOfServicerequest = listOfServicerequest;
    }

    // toString method
    @Override
    public String toString() {
        return "ServicetypeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", activestatus=" + activestatus +
                '}';
    }
}
