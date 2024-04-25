package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Violation"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Violation", schema="public" )
public class Violation implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="violationId", nullable=false)
    private Integer    violationid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="violationTypeID", nullable=false)
    private Integer    violationtypeid ;

    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="amount", nullable=false)
    private Double     amount ;

    @Column(name="lateCharge")
    private Double     latecharge ;

    @Column(name="communityID", nullable=false)
    private Integer    communityid ;

    @Column(name="createdByID", nullable=false)
    private Integer    createdbyid ;

    @Column(name="modifiedByID")
    private Integer    modifiedbyid ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdDate", nullable=false)
    private Date       createddate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modifiedDate")
    private Date       modifieddate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="violationTypeID", referencedColumnName="violationTypeId", insertable=false, updatable=false)
    private ViolationType violationtype ; 

    @OneToMany(mappedBy="violation")
    private List<ViolationDetail> listOfViolationdetail ; 

    @ManyToOne
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public Violation() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setViolationid( Integer violationid ) {
        this.violationid = violationid ;
    }
    public Integer getViolationid() {
        return this.violationid;
    }

    public void setViolationtypeid( Integer violationtypeid ) {
        this.violationtypeid = violationtypeid ;
    }
    public Integer getViolationtypeid() {
        return this.violationtypeid;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setAmount( Double amount ) {
        this.amount = amount ;
    }
    public Double getAmount() {
        return this.amount;
    }

    public void setLatecharge( Double latecharge ) {
        this.latecharge = latecharge ;
    }
    public Double getLatecharge() {
        return this.latecharge;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setCreatedbyid( Integer createdbyid ) {
        this.createdbyid = createdbyid ;
    }
    public Integer getCreatedbyid() {
        return this.createdbyid;
    }

    public void setModifiedbyid( Integer modifiedbyid ) {
        this.modifiedbyid = modifiedbyid ;
    }
    public Integer getModifiedbyid() {
        return this.modifiedbyid;
    }

    public void setCreateddate( Date createddate ) {
        this.createddate = createddate ;
    }
    public Date getCreateddate() {
        return this.createddate;
    }

    public void setModifieddate( Date modifieddate ) {
        this.modifieddate = modifieddate ;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }

    //--- GETTERS FOR LINKS
    public ViolationType getViolationtype() {
        return this.violationtype;
    } 

    public List<ViolationDetail> getListOfViolationdetail() {
        return this.listOfViolationdetail;
    } 

    public User getUser2() {
        return this.user2;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public User getUser() {
        return this.user;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(violationid);
        sb.append("|");
        sb.append(violationtypeid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(amount);
        sb.append("|");
        sb.append(latecharge);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(createdbyid);
        sb.append("|");
        sb.append(modifiedbyid);
        sb.append("|");
        sb.append(createddate);
        sb.append("|");
        sb.append(modifieddate);
        return sb.toString(); 
    } 

}
