package com.uniksoft.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.uniksoft.dao.ContactDAO;
import com.uniksoft.model.Contact;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ContactAction extends ActionSupport {
    private String id;
    private String firstName;
    private String lastName;
    private String cellNo;
    private String emailId;
    private String website;
    private Date birthDate;
    private Date created;
    
    List<Contact> contacts = new ArrayList<Contact>();
    Contact contact = new Contact();

    public String execute() throws Exception {
        Contact contact = new Contact(firstName, lastName, emailId,
                cellNo, website, birthDate);
        ContactDAO dao = new ContactDAO();
        if (dao.addContact(contact))
            return SUCCESS;
        else
            return ERROR;
        
    }
    
    public String listContacts() throws Exception {
        ContactDAO dao = new ContactDAO();
        contacts = dao.getContacts();
        return SUCCESS;
    }
    
    public String delete() throws Exception {
        ContactDAO dao = new ContactDAO();
        dao.delete(id);
        return SUCCESS;
    }
    
    public String getContactObj() throws Exception {
        ContactDAO dao = new ContactDAO();
        contact = dao.getContact(id);
        return SUCCESS;
    }
    
    public String updateContact() throws Exception {
        ContactDAO dao = new ContactDAO();
        dao.updateContact(contact);
        return SUCCESS;
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

    public List<Contact> getContacts() {
        return contacts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
}
