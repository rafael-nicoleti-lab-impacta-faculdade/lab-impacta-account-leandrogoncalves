package br.com.lab.impacta.account.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private Long number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    protected Person customer;

    private Double balance;

    public boolean debit(Double valueOfDebit) {
        if (this.getBalance() < valueOfDebit) {
            return false;
        }

        Double debittedAmount = this.getBalance() - valueOfDebit;

        return true;
    }
}
