package com.uniksoft.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue
    private int id;
    
    @Column(name="firstname")
    private String firstName;
    
    @Column(name="lastname")
    private String lastName;
    
    @Column(name="email_id")
    private String emailId;
    
    @Column(name="cell_no")
    private String cellNo;
    
    @Column(name="website")
    private String website;
    
    @Column(name="birthdate")
    private Date birthDate;
    
    @Column(name="created")
    private Date created;

    public Contact() {}

    public Contact(String firstName, String lastName, String emailId,
            String cellNo, String website, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.cellNo = cellNo;
        this.website = website;
        this.birthDate = birthDate;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
}
