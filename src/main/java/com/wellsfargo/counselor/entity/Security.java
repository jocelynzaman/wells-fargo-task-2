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
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private int quantity;

    public Security(String name, String category, double purchasePrice, String purchaseDate, int quantity)
    {
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

    public long getPortfolioId()
    {
        return this.portfolioId;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCategory()
    {
        return this.category;
    }

    public double getPurchasePrice()
    {
        return this.purchasePrice;
    }

    public String getPurchaseDate()
    {
        return this.purchaseDate;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    // setters
    public void setPortfolioId(long portfolioId)
    {
        this.portfolioId = portfolioId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
