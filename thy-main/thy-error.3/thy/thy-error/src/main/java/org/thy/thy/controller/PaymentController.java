package org.thy.thy.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thy.thy.business.abstracts.PaymentService;
import org.thy.thy.business.abstracts.WalletService;
import org.thy.thy.business.requests.CreatePaymentReaquest;
import org.thy.thy.business.requests.CreateWalletRequest;

@RestController
@RequestMapping("api/payments")
@AllArgsConstructor
public class PaymentController {
    private PaymentService paymentService;

    @PostMapping("/add")
    public void add(@RequestBody() CreatePaymentReaquest createPaymentReaquest){
        this.paymentService.add(createPaymentReaquest);

    }
}