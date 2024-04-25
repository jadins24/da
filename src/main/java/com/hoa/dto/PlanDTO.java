package com.hoa.dto;

import java.util.Date;
import java.util.List;

public class PlanDTO {

	    private Integer planid;
	    private Integer planrangefrom;
	    private Integer planrangeto;
	    private String planperiod;
	    private String plantype;
	    private Double price;
	    private Boolean activestatus;
	    private Date createddate;
	    private List<PlanDetailDTO> listOfPlandetail;
	    private List<CommunityDTO> listOfCommunity;
	    private List<EnquiryDTO> listOfEnquiry;
	    private List<ContractDTO> listOfContract;

	    // Getters and Setters for all fields

	    public Integer getPlanid() {
	        return planid;
	    }

	    public void setPlanid(Integer planid) {
	        this.planid = planid;
	    }

	    public Integer getPlanrangefrom() {
	        return planrangefrom;
	    }

	    public void setPlanrangefrom(Integer planrangefrom) {
	        this.planrangefrom = planrangefrom;
	    }

	    public Integer getPlanrangeto() {
	        return planrangeto;
	    }

	    public void setPlanrangeto(Integer planrangeto) {
	        this.planrangeto = planrangeto;
	    }

	    public String getPlanperiod() {
	        return planperiod;
	    }

	    public void setPlanperiod(String planperiod) {
	        this.planperiod = planperiod;
	    }

	    public String getPlantype() {
	        return plantype;
	    }

	    public void setPlantype(String plantype) {
	        this.plantype = plantype;
	    }

	    public Double getPrice() {
	        return price;
	    }

	    public void setPrice(Double price) {
	        this.price = price;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	    public Date getCreateddate() {
	        return createddate;
	    }

	    public void setCreateddate(Date createddate) {
	        this.createddate = createddate;
	    }

	    public List<PlanDetailDTO> getListOfPlandetail() {
	        return listOfPlandetail;
	    }

	    public void setListOfPlandetail(List<PlanDetailDTO> listOfPlandetail) {
	        this.listOfPlandetail = listOfPlandetail;
	    }

	    public List<CommunityDTO> getListOfCommunity() {
	        return listOfCommunity;
	    }

	    public void setListOfCommunity(List<CommunityDTO> listOfCommunity) {
	        this.listOfCommunity = listOfCommunity;
	    }

	    public List<EnquiryDTO> getListOfEnquiry() {
	        return listOfEnquiry;
	    }

	    public void setListOfEnquiry(List<EnquiryDTO> listOfEnquiry) {
	        this.listOfEnquiry = listOfEnquiry;
	    }

	    public List<ContractDTO> getListOfContract() {
	        return listOfContract;
	    }

	    public void setListOfContract(List<ContractDTO> listOfContract) {
	        this.listOfContract = listOfContract;
	    }

		@Override
		public String toString() {
			return "PlanDto [planid=" + planid + ", planrangefrom=" + planrangefrom + ", planrangeto=" + planrangeto
					+ ", planperiod=" + planperiod + ", plantype=" + plantype + ", price=" + price + ", activestatus="
					+ activestatus + ", createddate=" + createddate + ", listOfPlandetail=" + listOfPlandetail
					+ ", listOfCommunity=" + listOfCommunity + ", listOfEnquiry=" + listOfEnquiry + ", listOfContract="
					+ listOfContract + "]";
		}

		public PlanDTO(Integer planid, Integer planrangefrom, Integer planrangeto, String planperiod, String plantype,
				Double price, Boolean activestatus, Date createddate, List<PlanDetailDTO> listOfPlandetail,
				List<CommunityDTO> listOfCommunity, List<EnquiryDTO> listOfEnquiry, List<ContractDTO> listOfContract) {
			super();
			this.planid = planid;
			this.planrangefrom = planrangefrom;
			this.planrangeto = planrangeto;
			this.planperiod = planperiod;
			this.plantype = plantype;
			this.price = price;
			this.activestatus = activestatus;
			this.createddate = createddate;
			this.listOfPlandetail = listOfPlandetail;
			this.listOfCommunity = listOfCommunity;
			this.listOfEnquiry = listOfEnquiry;
			this.listOfContract = listOfContract;
		}

		public PlanDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
