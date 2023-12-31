package kz.temirbayev.silkpay.service;

import kz.temirbayev.silkpay.model.Account;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public interface AccountService {
    List<Account> allAccount();
    Account createAccount(Account account);
    Optional<Account> getAccountById(Long accountId);

    BigDecimal getAccountBalanceByNumber(String accountNumber);
    void transferFunds(Long sourceAccountId, Long targetAccountId, BigDecimal amount);
}
