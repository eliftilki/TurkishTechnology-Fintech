package org.thy.thy.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thy.thy.business.abstracts.WalletService;

import org.thy.thy.business.requests.CreateWalletRequest;


@RestController
@RequestMapping("api/wallets")
@AllArgsConstructor
public class WalletController {

    private WalletService walletService;

    @PostMapping("/add")
    public void add(@RequestBody() CreateWalletRequest createWalletRequest){
        this.walletService.add(createWalletRequest);

    }
}
