package com.jean.burda.purchase_service.service;

import com.jean.burda.purchase_service.entity.PurchaseTransaction;
import com.jean.burda.purchase_service.repository.PurchaseTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseTransactionService {
    private final PurchaseTransactionRepository transactionRepository;

    @Autowired
    public PurchaseTransactionService(PurchaseTransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public PurchaseTransaction saveTransaction(PurchaseTransaction transaction) {
        // Validate transaction fields here (description length, date format, positive amount)
        // Save the transaction
        return transactionRepository.save(transaction);
    }
}