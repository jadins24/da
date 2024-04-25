package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Plan"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Plan", schema="public" )
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="planId", nullable=false)
    private Integer    planid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="planRangeFrom")
    private Integer    planrangefrom ;

    @Column(name="planRangeTo")
    private Integer    planrangeto ;

    @Column(name="planPeriod", length=128)
    private String     planperiod ;

    @Column(name="planType", length=128)
    private String     plantype ;

    @Column(name="price")
    private Double     price ;

    @Column(name="activeStatus")
    private Boolean    activestatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate")
    private Date       createddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="plan")
    private List<PlanDetail> listOfPlandetail ; 

    @OneToMany(mappedBy="plan")
    private List<Community> listOfCommunity ; 

    @OneToMany(mappedBy="plan")
    private List<Enquiry> listOfEnquiry ; 

    @OneToMany(mappedBy="plan")
    private List<Contract> listOfContract ; 


    /**
     * Constructor
     */
    public Plan() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPlanid( Integer planid ) {
        this.planid = planid ;
    }
    public Integer getPlanid() {
        return this.planid;
    }

    public void setPlanrangefrom( Integer planrangefrom ) {
        this.planrangefrom = planrangefrom ;
    }
    public Integer getPlanrangefrom() {
        return this.planrangefrom;
    }

    public void setPlanrangeto( Integer planrangeto ) {
        this.planrangeto = planrangeto ;
    }
    public Integer getPlanrangeto() {
        return this.planrangeto;
    }

    public void setPlanperiod( String planperiod ) {
        this.planperiod = planperiod ;
    }
    public String getPlanperiod() {
        return this.planperiod;
    }

    public void setPlantype( String plantype ) {
        this.plantype = plantype ;
    }
    public String getPlantype() {
        return this.plantype;
    }

    public void setPrice( Double price ) {
        this.price = price ;
    }
    public Double getPrice() {
        return this.price;
    }

    public void setActivestatus( Boolean activestatus ) {
        this.activestatus = activestatus ;
    }
    public Boolean getActivestatus() {
        return this.activestatus;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    //--- GETTERS FOR LINKS
    public List<PlanDetail> getListOfPlandetail() {
        return this.listOfPlandetail;
    } 

    public List<Community> getListOfCommunity() {
        return this.listOfCommunity;
    } 

    public List<Enquiry> getListOfEnquiry() {
        return this.listOfEnquiry;
    } 

    public List<Contract> getListOfContract() {
        return this.listOfContract;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(planid);
        sb.append("|");
        sb.append(planrangefrom);
        sb.append("|");
        sb.append(planrangeto);
        sb.append("|");
        sb.append(planperiod);
        sb.append("|");
        sb.append(plantype);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(activestatus);
        sb.append("|");
        sb.append(createddate);
        return sb.toString(); 
    } 

}
