package ir.mohammadi.service.Transaction.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Transaction;
import ir.mohammadi.repository.Transaction.TransactionRepo;
import ir.mohammadi.service.Transaction.TransactionServ;

public class TransactionServImpl extends BaseServiceImpl<Transaction, TransactionRepo> implements TransactionServ {
    public TransactionServImpl(TransactionRepo repository) {
        super(repository);
    }
}
