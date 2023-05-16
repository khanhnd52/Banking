package com.khanhnd.Banking.entities;

import javax.persistence.*;

@Entity
@Table(name = "Bank_Account")
public class BankAccount {


    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Full_Name", length = 45, nullable = true)
    private String fullName;

    @Column(name = "Balance", nullable = true)
    private double balance;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
