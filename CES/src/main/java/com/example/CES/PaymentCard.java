package com.example.CES;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PaymentCards")
public class PaymentCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CardNumber")
    private int cardNumber;

//    TODO: user foreign key

//    TODO: make sure table is updated to use varchar(255) instead of int
    @Column(name = "expirationDate")
    private String expirationDate;

    @Column(name = "cardType")
    private String cardType;



}
