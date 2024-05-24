package org.thy.thy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thy.thy.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
