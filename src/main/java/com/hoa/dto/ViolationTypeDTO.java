package com.hoa.dto;

import java.io.Serializable;
import java.util.List;

public class ViolationTypeDTO implements Serializable {

	    private static final long serialVersionUID = 1L;

	    private Integer violationtypeid;
	    private String name;
	    private Boolean activestatus;
	    private List<ViolationDTO> listOfViolation;
	    
	    public Integer getViolationtypeid() {
			return violationtypeid;
		}

		public void setViolationtypeid(Integer violationtypeid) {
			this.violationtypeid = violationtypeid;
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

		public List<ViolationDTO> getListOfViolation() {
			return listOfViolation;
		}

		public void setListOfViolation(List<ViolationDTO> listOfViolation) {
			this.listOfViolation = listOfViolation;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
	    public String toString() {
	        return "ViolationTypeDTO{" +
	                "violationtypeid=" + violationtypeid +
	                ", name='" + name + '\'' +
	                ", activestatus=" + activestatus +
	                '}';
	    }

		public ViolationTypeDTO(Integer violationtypeid, String name, Boolean activestatus,
				List<ViolationDTO> listOfViolation) {
			super();
			this.violationtypeid = violationtypeid;
			this.name = name;
			this.activestatus = activestatus;
			this.listOfViolation = listOfViolation;
		}

		public ViolationTypeDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

}
