package com.khanhnd.Banking.dao;


import com.khanhnd.Banking.entities.BankAccount;
import com.khanhnd.Banking.model.BankAccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BankAccountDAO {

    private final EntityManager entityManager;

    public BankAccountDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public BankAccount findById (Long id) {
        return this.entityManager.find(BankAccount.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<BankAccountInfo> listBankAccountInfo() {
        String sql = "SELECT NEW " + BankAccountInfo.class.getName() + "(e.id, e.fullName, e.balance) " +
                "FROM " + BankAccount.class.getName() + " e";
        Query query = entityManager.createQuery(sql, BankAccountInfo.class);
        return query.getResultList();
    }
}
