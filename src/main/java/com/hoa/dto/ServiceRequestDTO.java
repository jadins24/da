package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO class for "Servicerequest"
 */
public class ServiceRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer servicerequestid;
    private Integer servicetypeid;
    private Integer requestedclientid;
    private String description;
    private Integer communityid;
    private Integer vendorid;
    private Integer createdbyid;
    private Integer modifiedbyid;
    private Date createddate;
    private Date modifieddate;
    private Double servicecharge;
    private String servicestatus;
    private String paymentstatus;
    private Integer paymentdetailid;

    // Constructor
    public ServiceRequestDTO() {
    }

    // Constructor with fields
    public ServiceRequestDTO(Integer servicerequestid, Integer servicetypeid, Integer requestedclientid,
                             String description, Integer communityid, Integer vendorid, Integer createdbyid,
                             Integer modifiedbyid, Date createddate, Date modifieddate, Double servicecharge,
                             String servicestatus, String paymentstatus, Integer paymentdetailid) {
        this.servicerequestid = servicerequestid;
        this.servicetypeid = servicetypeid;
        this.requestedclientid = requestedclientid;
        this.description = description;
        this.communityid = communityid;
        this.vendorid = vendorid;
        this.createdbyid = createdbyid;
        this.modifiedbyid = modifiedbyid;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.servicecharge = servicecharge;
        this.servicestatus = servicestatus;
        this.paymentstatus = paymentstatus;
        this.paymentdetailid = paymentdetailid;
    }

    // Getters and Setters
    public Integer getServicerequestid() {
        return servicerequestid;
    }

    public void setServicerequestid(Integer servicerequestid) {
        this.servicerequestid = servicerequestid;
    }

    public Integer getServicetypeid() {
        return servicetypeid;
    }

    public void setServicetypeid(Integer servicetypeid) {
        this.servicetypeid = servicetypeid;
    }

    public Integer getRequestedclientid() {
        return requestedclientid;
    }

    public void setRequestedclientid(Integer requestedclientid) {
        this.requestedclientid = requestedclientid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }

    public Integer getVendorid() {
        return vendorid;
    }

    public void setVendorid(Integer vendorid) {
        this.vendorid = vendorid;
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

    public Double getServicecharge() {
        return servicecharge;
    }

    public void setServicecharge(Double servicecharge) {
        this.servicecharge = servicecharge;
    }

    public String getServicestatus() {
        return servicestatus;
    }

    public void setServicestatus(String servicestatus) {
        this.servicestatus = servicestatus;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public Integer getPaymentdetailid() {
        return paymentdetailid;
    }

    public void setPaymentdetailid(Integer paymentdetailid) {
        this.paymentdetailid = paymentdetailid;
    }

    // toString method
    @Override
    public String toString() {
        return "ServicerequestDTO{" +
                "servicerequestid=" + servicerequestid +
                ", servicetypeid=" + servicetypeid +
                ", requestedclientid=" + requestedclientid +
                ", description='" + description + '\'' +
                ", communityid=" + communityid +
                ", vendorid=" + vendorid +
                ", createdbyid=" + createdbyid +
                ", modifiedbyid=" + modifiedbyid +
                ", createddate=" + createddate +
                ", modifieddate=" + modifieddate +
                ", servicecharge=" + servicecharge +
                ", servicestatus='" + servicestatus + '\'' +
                ", paymentstatus='" + paymentstatus + '\'' +
                ", paymentdetailid=" + paymentdetailid +
                '}';
    }
}
