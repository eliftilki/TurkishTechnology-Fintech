package org.thy.thy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thy.thy.model.Currency;


public interface CurrencyRepository extends JpaRepository<Currency,Short> {
}
