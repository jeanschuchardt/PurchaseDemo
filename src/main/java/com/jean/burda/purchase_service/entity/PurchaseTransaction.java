package com.jean.burda.purchase_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;



@Entity
@Data
public class PurchaseTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(max = 50) // Enforces max length of 50 characters for description
    @Column(length = 50)
    private String description;

    @Column
    private LocalDate transactionDate;

    @Column
    private BigDecimal purchaseAmount;


}