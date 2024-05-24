package org.thy.thy.business.abstracts;


import org.thy.thy.business.requests.CreatePaymentReaquest;

public interface PaymentService {

    void add(CreatePaymentReaquest createPaymentReaquest);
}
