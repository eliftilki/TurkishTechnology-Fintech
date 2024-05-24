package org.thy.thy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "payments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;

        @ManyToOne
        @JoinColumn(name = "wallet_id")
        private Wallet wallet;

        @Column(name = "amount")
        private BigDecimal amount;

        @ManyToOne
        @JoinColumn(name = "merchant_id")
        private Merchant merchant;

        @Column(name = "transaction_time")
        private Date transactionTime;

    @Column(name = "unix_time")
    private Long unixTime;

    @Column(name = "trans_num")
    private String transNum;
}
