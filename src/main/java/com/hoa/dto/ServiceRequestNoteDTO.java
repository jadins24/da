package com.hoa.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO class for "Servicerequestnote"
 */
public class ServiceRequestNoteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer servicerequestnoteid;
    private Integer servicerequestid;
    private String note;
    private Date createddate;

    // Constructor
    public ServiceRequestNoteDTO() {
    }

    // Constructor with fields
    public ServiceRequestNoteDTO(Integer servicerequestnoteid, Integer servicerequestid, String note, Date createddate) {
        this.servicerequestnoteid = servicerequestnoteid;
        this.servicerequestid = servicerequestid;
        this.note = note;
        this.createddate = createddate;
    }

    // Getters and Setters
    public Integer getServicerequestnoteid() {
        return servicerequestnoteid;
    }

    public void setServicerequestnoteid(Integer servicerequestnoteid) {
        this.servicerequestnoteid = servicerequestnoteid;
    }

    public Integer getServicerequestid() {
        return servicerequestid;
    }

    public void setServicerequestid(Integer servicerequestid) {
        this.servicerequestid = servicerequestid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    // toString method
    @Override
    public String toString() {
        return "ServicerequestnoteDTO{" +
                "servicerequestnoteid=" + servicerequestnoteid +
                ", servicerequestid=" + servicerequestid +
                ", note='" + note + '\'' +
                ", createddate=" + createddate +
                '}';
    }
}
