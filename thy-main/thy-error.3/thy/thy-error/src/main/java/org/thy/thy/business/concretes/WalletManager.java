package org.thy.thy.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import org.thy.thy.business.abstracts.WalletService;
import org.thy.thy.business.requests.CreateWalletRequest;
import org.thy.thy.core.utilities.mappers.ModelMapperService;
import org.thy.thy.dataAccess.abstracts.WalletRepository;
import org.thy.thy.model.User;
import org.thy.thy.model.Wallet;

import java.util.Optional;

@Service
@AllArgsConstructor
public class WalletManager implements WalletService {
    private WalletRepository walletRepository;
    private ModelMapperService modelMapperService;


    @Override
    public Optional<Wallet> getByUserId(long userId) {
        return walletRepository.findByUserId(userId);
    }

    @Override
    public void add(CreateWalletRequest createWalletRequest) {
        Wallet wallet=this.modelMapperService.forRequest().map(createWalletRequest,Wallet.class);

        this.walletRepository.save(wallet);
    }
}
