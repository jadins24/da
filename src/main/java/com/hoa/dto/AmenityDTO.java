package com.hoa.dto;

import java.util.Date;

public class AmenityDTO {

	    private Integer amenityid;
	    private Integer amenitytypeid;
	    private String name;
	    private Integer communityid;
	    private Integer createdbyid;
	    private Integer modifiedbyid;
	    private Date createddate;
	    private Date modifieddate;
	    private Double amount;
	    private Double latecharge;

	    // Getter and Setter for amenityid
	    public Integer getAmenityid() {
	        return amenityid;
	    }

	    public void setAmenityid(Integer amenityid) {
	        this.amenityid = amenityid;
	    }

	    // Getter and Setter for amenitytypeid
	    public Integer getAmenitytypeid() {
	        return amenitytypeid;
	    }

	    public void setAmenitytypeid(Integer amenitytypeid) {
	        this.amenitytypeid = amenitytypeid;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
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

	    // Getter and Setter for amount
	    public Double getAmount() {
	        return amount;
	    }

	    public void setAmount(Double amount) {
	        this.amount = amount;
	    }

	    // Getter and Setter for latecharge
	    public Double getLatecharge() {
	        return latecharge;
	    }

	    public void setLatecharge(Double latecharge) {
	        this.latecharge = latecharge;
	    }

		@Override
		public String toString() {
			return "AmenityDto [amenityid=" + amenityid + ", amenitytypeid=" + amenitytypeid + ", name=" + name
					+ ", communityid=" + communityid + ", createdbyid=" + createdbyid + ", modifiedbyid=" + modifiedbyid
					+ ", createddate=" + createddate + ", modifieddate=" + modifieddate + ", amount=" + amount
					+ ", latecharge=" + latecharge + "]";
		}

		public AmenityDTO(Integer amenityid, Integer amenitytypeid, String name, Integer communityid,
				Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate, Double amount,
				Double latecharge) {
			super();
			this.amenityid = amenityid;
			this.amenitytypeid = amenitytypeid;
			this.name = name;
			this.communityid = communityid;
			this.createdbyid = createdbyid;
			this.modifiedbyid = modifiedbyid;
			this.createddate = createddate;
			this.modifieddate = modifieddate;
			this.amount = amount;
			this.latecharge = latecharge;
		}

		public AmenityDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
