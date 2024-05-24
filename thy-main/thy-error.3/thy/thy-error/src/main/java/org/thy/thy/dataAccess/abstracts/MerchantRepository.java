package org.thy.thy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thy.thy.model.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
