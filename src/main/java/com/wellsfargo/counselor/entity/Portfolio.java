package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    // Relationship annotation: Many Portfolios to One Client
    @ManyToOne
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(String creationDate)
    {
        this.creationDate = creationDate;
    }

    // getters
    public long getPortfolioId()
    {
        return this.portfolioId;
    }

    public long getClientId()
    {
        return this.clientId;
    }

    public String getCreationDate()
    {
        return this.creationDate;
    }

    // setters
    public void setClientId(long clientId)
    {
        this.clientId = clientId;
    }

    public void setCreationDate(String creationDate)
    {
        this.creationDate = creationDate;
    }
}
