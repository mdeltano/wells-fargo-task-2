package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable=false)
    private long clientId;

    protected Portfolio() {

    }

    public Portfolio(long client) {
        this.clientId = client;
    }

    public long getClientId() {
        return this.clientId;
    }

    public long getPortfolioId() {
        return this.portfolioId;
    }

    public void setClientId(long client) {
        this.clientId = client;
    }
    
}
