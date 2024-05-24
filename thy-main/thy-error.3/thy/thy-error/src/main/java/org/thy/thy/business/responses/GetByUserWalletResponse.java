package org.thy.thy.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByUserWalletResponse {
    private String firstName;
    private String lastName;
    private BigDecimal balance;
}
