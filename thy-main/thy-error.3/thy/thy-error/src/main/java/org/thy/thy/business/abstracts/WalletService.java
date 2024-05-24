package org.thy.thy.business.abstracts;


import org.thy.thy.business.requests.CreatUserRequest;
import org.thy.thy.business.requests.CreateWalletRequest;
import org.thy.thy.model.Wallet;

import java.util.Optional;
public interface WalletService {
    Optional<Wallet> getByUserId(long userId);
    void add(CreateWalletRequest createWalletRequest);


}
