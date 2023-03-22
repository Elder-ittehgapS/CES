package com.example.CES;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentCardRepository extends JpaRepository<Role, Integer> {
    PaymentCard findByCardNumber(int cardNumber);
}