package com.cydeo.entity;

import com.cydeo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Stack;

@Entity
@Table(name="payments")
@Data
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition="DATE")
    private LocalDate createdDate;
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

    //@OneToOne(cascade = CascadeType.ALL)
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="payment_detail_id")
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;
    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
