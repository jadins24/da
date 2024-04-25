package com.hoa.dto;

import java.util.Date;

public class AmenityBookingDTO {
	
	    private Integer amenitybookingid;
	    private Integer amenityid;
	    private Date bookingdate;
	    private Date bookingstart;
	    private Date bookingend;
	    private Integer communityid;
	    private Integer bookeduserid;
	    private Integer bookedforclientid;
	    private Integer createdbyid;
	    private Integer modifiedbyid;
	    private Date createddate;
	    private Date modifieddate;
	    private Double amount;
	    private String paymentstatus;
	    private Integer paymentdetailid;

	    // Getter and Setter for amenitybookingid
	    public Integer getAmenitybookingid() {
	        return amenitybookingid;
	    }

	    public void setAmenitybookingid(Integer amenitybookingid) {
	        this.amenitybookingid = amenitybookingid;
	    }

	    // Getter and Setter for amenityid
	    public Integer getAmenityid() {
	        return amenityid;
	    }

	    public void setAmenityid(Integer amenityid) {
	        this.amenityid = amenityid;
	    }

	    // Getter and Setter for bookingdate
	    public Date getBookingdate() {
	        return bookingdate;
	    }

	    public void setBookingdate(Date bookingdate) {
	        this.bookingdate = bookingdate;
	    }

	    // Getter and Setter for bookingstart
	    public Date getBookingstart() {
	        return bookingstart;
	    }

	    public void setBookingstart(Date bookingstart) {
	        this.bookingstart = bookingstart;
	    }

	    // Getter and Setter for bookingend
	    public Date getBookingend() {
	        return bookingend;
	    }

	    public void setBookingend(Date bookingend) {
	        this.bookingend = bookingend;
	    }

	    // Getter and Setter for communityid
	    public Integer getCommunityid() {
	        return communityid;
	    }

	    public void setCommunityid(Integer communityid) {
	        this.communityid = communityid;
	    }

	    // Getter and Setter for bookeduserid
	    public Integer getBookeduserid() {
	        return bookeduserid;
	    }

	    public void setBookeduserid(Integer bookeduserid) {
	        this.bookeduserid = bookeduserid;
	    }

	    // Getter and Setter for bookedforclientid
	    public Integer getBookedforclientid() {
	        return bookedforclientid;
	    }

	    public void setBookedforclientid(Integer bookedforclientid) {
	        this.bookedforclientid = bookedforclientid;
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

	    // Getter and Setter for paymentstatus
	    public String getPaymentstatus() {
	        return paymentstatus;
	    }

	    public void setPaymentstatus(String paymentstatus) {
	        this.paymentstatus = paymentstatus;
	    }

	    // Getter and Setter for paymentdetailid
	    public Integer getPaymentdetailid() {
	        return paymentdetailid;
	    }

	    public void setPaymentdetailid(Integer paymentdetailid) {
	        this.paymentdetailid = paymentdetailid;
	    }

		@Override
		public String toString() {
			return "AmenitybookingDto [amenitybookingid=" + amenitybookingid + ", amenityid=" + amenityid
					+ ", bookingdate=" + bookingdate + ", bookingstart=" + bookingstart + ", bookingend=" + bookingend
					+ ", communityid=" + communityid + ", bookeduserid=" + bookeduserid + ", bookedforclientid="
					+ bookedforclientid + ", createdbyid=" + createdbyid + ", modifiedbyid=" + modifiedbyid
					+ ", createddate=" + createddate + ", modifieddate=" + modifieddate + ", amount=" + amount
					+ ", paymentstatus=" + paymentstatus + ", paymentdetailid=" + paymentdetailid + "]";
		}

		public AmenityBookingDTO(Integer amenitybookingid, Integer amenityid, Date bookingdate, Date bookingstart,
				Date bookingend, Integer communityid, Integer bookeduserid, Integer bookedforclientid,
				Integer createdbyid, Integer modifiedbyid, Date createddate, Date modifieddate, Double amount,
				String paymentstatus, Integer paymentdetailid) {
			super();
			this.amenitybookingid = amenitybookingid;
			this.amenityid = amenityid;
			this.bookingdate = bookingdate;
			this.bookingstart = bookingstart;
			this.bookingend = bookingend;
			this.communityid = communityid;
			this.bookeduserid = bookeduserid;
			this.bookedforclientid = bookedforclientid;
			this.createdbyid = createdbyid;
			this.modifiedbyid = modifiedbyid;
			this.createddate = createddate;
			this.modifieddate = modifieddate;
			this.amount = amount;
			this.paymentstatus = paymentstatus;
			this.paymentdetailid = paymentdetailid;
		}

		public AmenityBookingDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	
}
