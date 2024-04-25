package com.hoa.dto;

public class PlanDetailDTO {

	    private Integer plandetailid;
	    private Integer planid;
	    private String name;
	    private Integer displayorder;
	    private Boolean activestatus;
	    private PlanDTO plan;

	    // Getters and Setters for all fields

	    public Integer getPlandetailid() {
	        return plandetailid;
	    }

	    public void setPlandetailid(Integer plandetailid) {
	        this.plandetailid = plandetailid;
	    }

	    public Integer getPlanid() {
	        return planid;
	    }

	    public void setPlanid(Integer planid) {
	        this.planid = planid;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Integer getDisplayorder() {
	        return displayorder;
	    }

	    public void setDisplayorder(Integer displayorder) {
	        this.displayorder = displayorder;
	    }

	    public Boolean getActivestatus() {
	        return activestatus;
	    }

	    public void setActivestatus(Boolean activestatus) {
	        this.activestatus = activestatus;
	    }

	    public PlanDTO getPlan() {
	        return plan;
	    }

	    public void setPlan(PlanDTO plan) {
	        this.plan = plan;
	    }

		@Override
		public String toString() {
			return "PlandetailDto [plandetailid=" + plandetailid + ", planid=" + planid + ", name=" + name
					+ ", displayorder=" + displayorder + ", activestatus=" + activestatus + ", plan=" + plan + "]";
		}

		public PlanDetailDTO(Integer plandetailid, Integer planid, String name, Integer displayorder,
				Boolean activestatus, PlanDTO plan) {
			super();
			this.plandetailid = plandetailid;
			this.planid = planid;
			this.name = name;
			this.displayorder = displayorder;
			this.activestatus = activestatus;
			this.plan = plan;
		}

		public PlanDetailDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
