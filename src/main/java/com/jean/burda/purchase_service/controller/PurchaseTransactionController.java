package com.jean.burda.purchase_service.controller;

import com.jean.burda.purchase_service.entity.PurchaseTransaction;
import com.jean.burda.purchase_service.service.PurchaseTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class PurchaseTransactionController {
    private final PurchaseTransactionService transactionService;

    @Autowired
    public PurchaseTransactionController(PurchaseTransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/store")
    public ResponseEntity<PurchaseTransaction> storeTransaction(@RequestBody PurchaseTransaction transaction) {
        PurchaseTransaction savedTransaction = transactionService.saveTransaction(transaction);
        return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
    }
}