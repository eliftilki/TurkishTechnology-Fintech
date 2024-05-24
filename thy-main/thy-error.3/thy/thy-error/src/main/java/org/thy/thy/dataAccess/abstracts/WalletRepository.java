package org.thy.thy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thy.thy.model.Wallet;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
    Optional<Wallet> findByUserId(long userId);
}
