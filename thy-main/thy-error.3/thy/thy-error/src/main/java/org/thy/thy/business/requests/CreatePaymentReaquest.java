package org.thy.thy.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thy.thy.model.Merchant;
import org.thy.thy.model.Wallet;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentReaquest {
    private Long walletId;
    private BigDecimal amount;
    private Long merchantId;
    private Date transactionTime;
    private Long unixTime;
    private String transNum;
}
