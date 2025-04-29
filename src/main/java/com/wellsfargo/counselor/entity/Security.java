package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    
    // Relationship annotation: Many Securities to One Portfolio
    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private float quantity;

    protected Security()
    {

    }

    public Security(Portfolio portfolio, String name, String category, float purchasePrice, String purchaseDate, float quantity)
    {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    // getters
    public long getSecurityId()
    {
        return this.securityId;
    }

    public Portfolio getPortfolio()
    {
        return this.portfolio;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCategory()
    {
        return this.category;
    }

    public float getPurchasePrice()
    {
        return this.purchasePrice;
    }

    public String getPurchaseDate()
    {
        return this.purchaseDate;
    }

    public float getQuantity()
    {
        return this.quantity;
    }

    // setters
    public void setPortfolio(Portfolio portfolio)
    {
        this.portfolio = portfolio;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setPurchasePrice(float purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(float quantity)
    {
        this.quantity = quantity;
    }
}
