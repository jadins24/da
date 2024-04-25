package com.hoa.dto;

import java.io.Serializable;

/**
 * DTO class for "Rolepage"
 */
public class RolePageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rolepageid;
    private Integer roleid;
    private Integer pageid;
    private Boolean create;
    private Boolean read;
    private Boolean update;
    private Boolean delete;

    // Constructor
    public RolePageDTO() {
    }

    // Constructor with fields
    public RolePageDTO(Integer rolepageid, Integer roleid, Integer pageid, Boolean create, Boolean read, Boolean update, Boolean delete) {
        this.rolepageid = rolepageid;
        this.roleid = roleid;
        this.pageid = pageid;
        this.create = create;
        this.read = read;
        this.update = update;
        this.delete = delete;
    }

    // Getters and Setters
    public Integer getRolepageid() {
        return rolepageid;
    }

    public void setRolepageid(Integer rolepageid) {
        this.rolepageid = rolepageid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Boolean getCreate() {
        return create;
    }

    public void setCreate(Boolean create) {
        this.create = create;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    // toString method
    @Override
    public String toString() {
        return "RolepageDTO{" +
                "rolepageid=" + rolepageid +
                ", roleid=" + roleid +
                ", pageid=" + pageid +
                ", create=" + create +
                ", read=" + read +
                ", update=" + update +
                ", delete=" + delete +
                '}';
    }
}
