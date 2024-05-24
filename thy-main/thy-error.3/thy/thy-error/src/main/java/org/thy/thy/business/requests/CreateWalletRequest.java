package org.thy.thy.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thy.thy.model.Currency;
import org.thy.thy.model.User;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateWalletRequest {
    private Long userId;
    private short currencyId;
    private BigDecimal balance;
}
