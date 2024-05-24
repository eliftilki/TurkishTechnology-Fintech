package org.thy.thy.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thy.thy.business.abstracts.PaymentService;
import org.thy.thy.business.requests.CreatePaymentReaquest;
import org.thy.thy.core.utilities.mappers.ModelMapperService;
import org.thy.thy.dataAccess.abstracts.PaymentRepository;
import org.thy.thy.dataAccess.abstracts.WalletRepository;
import org.thy.thy.model.Payment;
import org.thy.thy.model.Wallet;

@Service
@AllArgsConstructor
public class PaymentManager implements PaymentService {
    private PaymentRepository paymentRepository;
    private ModelMapperService modelMapperService;
    @Override
    public void add(CreatePaymentReaquest createPaymentReaquest) {
        Payment payment=this.modelMapperService.forRequest().map(createPaymentReaquest,Payment.class);

        this.paymentRepository.save(payment);
    }
}
