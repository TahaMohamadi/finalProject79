package ir.mohammadi.repository.Transaction.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Transaction;
import ir.mohammadi.repository.Transaction.TransactionRepo;
import jakarta.persistence.EntityManager;

public class TransactionRepoImpl extends BaseRepositoryImpl<Transaction> implements TransactionRepo {
    public TransactionRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Transaction> getEntityClass() {
        return Transaction.class;
    }
}
