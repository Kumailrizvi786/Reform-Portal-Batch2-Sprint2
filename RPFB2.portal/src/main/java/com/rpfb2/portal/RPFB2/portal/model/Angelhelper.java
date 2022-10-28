package com.rpfb2.portal.RPFB2.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Angelhelper {
    @Id
    @GeneratedValue
    private Long id;
    
    private String Name;
    
    private Integer Contact;
    
    private String Area_of_Interest;
    
    private String Address;
    
    private Integer Pincode;
    
    private String Email;
    
    public Long getId() {	
    	return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public Integer getContact() {
        return Contact;
    }

    public void setContact(Integer Contact) {
        this.Contact = Contact;
    }
    
    public String getArea_of_Interest() {
    	return Area_of_Interest;
    }
    
    public void setArea_of_Interest(String Area_of_Interest) {
    	this.Area_of_Interest = Area_of_Interest;
    }
    
    public String getAddress() {
    	return Address;
    }
    
    public void setAddress(String Address) {
    	this.Address = Address;
    }
    
    public Integer getPincode() {
        return Pincode;
    }

    public void setPincode(Integer Pincode) {
        this.Pincode = Pincode;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
