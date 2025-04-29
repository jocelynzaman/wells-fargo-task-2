package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {
    
    @Id
    @GeneratedValue()
    private long clientId;

    // Relationship annotation: Many Clients to One Advisor
    @ManyToOne
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;


    public Client(String firstName, String lastName, String address, String phone, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // getters

    public long getClientId()
    {
        return this.clientId;
    }

    public long getAdvisorId()
    {
        return this.advisorId;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public String getEmail()
    {
        return this.email;
    }

    // setters

    public void setAdvisorId(long advisorId)
    {
        this.advisorId = advisorId;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
