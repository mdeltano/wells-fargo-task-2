package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class Client {
    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable=false)
    private long advisorId;

    protected Client() {

    }

    public Client(long advisor) {
        this.advisorId = advisor;
    }

    public long getClientId() {
        return this.clientId;
    }

    public long getAdvisorId() {
        return this.advisorId;
    }

    public void setAdvisorId(long advisor) {
        this.advisorId = advisor;
    }
    
}
