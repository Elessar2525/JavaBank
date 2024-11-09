package javabank.service;

import javabank.model.Account;
import javabank.db.impl.InMemTransRepository;


public class TransferService {
    private final AccountService accountService;

    public TransferService(AccountService accountService, InMemTransRepository inMemUserRepository) {
        this.accountService = accountService;
    }

    public void transfer(int sourceAccId, int targetAccId, double amount) {
        Account sourceAcc = accountService.getAcc(sourceAccId);
        if (amount > sourceAcc.getBalance()) {
            // todo: Do dodania domenowy exception zamiast wbudowanego
            throw new IllegalStateException("Insufficient funds.");
        }
        double sourceBalance = sourceAcc.getBalance() - amount;
        sourceAcc.setBalance(sourceBalance);
        accountService.save(sourceAcc);

        Account targetAcc = accountService.getAcc(targetAccId);
        double targetBalance = targetAcc.balance + amount;
        targetAcc.setBalance(targetBalance);
        accountService.save(targetAcc);
    }

}
