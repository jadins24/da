package com.hoa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Vendor"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Vendor", schema="public" )
public class Vendor implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="vendorId", nullable=false)
    private Integer    vendorid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=128)
    private String     name ;

    @Column(name="emailId", nullable=false, length=128)
    private String     emailid ;

    @Column(name="phone", nullable=false, length=128)
    private String     phone ;

    @Column(name="zipCode", nullable=false, length=128)
    private String     zipcode ;

    @Column(name="serviceTypeID", nullable=false)
    private Integer    servicetypeid ;

    @Column(name="communityID", nullable=false)
    private Integer    communityid ;

    @Temporal(TemporalType.DATE)
    @Column(name="licenseExpiryDate")
    private Date       licenseexpirydate ;

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
    @JoinColumn(name="modifiedByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user2 ; 

    @ManyToOne
    @JoinColumn(name="serviceTypeID", referencedColumnName="id", insertable=false, updatable=false)
    private ServiceType servicetype ; 

    @ManyToOne
    @JoinColumn(name="communityID", referencedColumnName="communityID", insertable=false, updatable=false)
    private Community  community ; 

    @OneToMany(mappedBy="vendor")
    private List<ServiceRequest> listOfServicerequest ; 

    @ManyToOne
    @JoinColumn(name="createdByID", referencedColumnName="userId", insertable=false, updatable=false)
    private User       user ; 


    /**
     * Constructor
     */
    public Vendor() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setVendorid( Integer vendorid ) {
        this.vendorid = vendorid ;
    }
    public Integer getVendorid() {
        return this.vendorid;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setEmailid( String emailid ) {
        this.emailid = emailid ;
    }
    public String getEmailid() {
        return this.emailid;
    }

    public void setPhone( String phone ) {
        this.phone = phone ;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setZipcode( String zipcode ) {
        this.zipcode = zipcode ;
    }
    public String getZipcode() {
        return this.zipcode;
    }

    public void setServicetypeid( Integer servicetypeid ) {
        this.servicetypeid = servicetypeid ;
    }
    public Integer getServicetypeid() {
        return this.servicetypeid;
    }

    public void setCommunityid( Integer communityid ) {
        this.communityid = communityid ;
    }
    public Integer getCommunityid() {
        return this.communityid;
    }

    public void setLicenseexpirydate( Date licenseexpirydate ) {
        this.licenseexpirydate = licenseexpirydate ;
    }
    public Date getLicenseexpirydate() {
        return this.licenseexpirydate;
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
    public User getUser2() {
        return this.user2;
    } 

    public ServiceType getServicetype() {
        return this.servicetype;
    } 

    public Community getCommunity() {
        return this.community;
    } 

    public List<ServiceRequest> getListOfServicerequest() {
        return this.listOfServicerequest;
    } 

    public User getUser() {
        return this.user;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(vendorid);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(emailid);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(zipcode);
        sb.append("|");
        sb.append(servicetypeid);
        sb.append("|");
        sb.append(communityid);
        sb.append("|");
        sb.append(licenseexpirydate);
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
