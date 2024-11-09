package javabank.service;

import javabank.db.AccRepository;
import javabank.model.Account;
import javabank.model.exception.InsufficientFoundsException;

public class AccountService {

    private AccRepository accRepository;

    public AccountService(AccRepository accRepository) {
        this.accRepository = accRepository;
    }

    public Account getAcc(int accID) {
        return accRepository.getAcc(accID);
    }

    public boolean accExists(int accId) {
        return accRepository.accExists(accId);
    }
    public String getUser(String user) {
        return accRepository.getUser(user);
    }

    public boolean userExists(String user) {
        return accRepository.userExists(user);
    }

    public void save(Account sourceAcc) {
    }

    public double getBalance(int accId) {
        Account acc = accRepository.getAcc(accId);
        return acc.balance;
    }

    public void deposit(int accId, double amount) {
        Account acc = accRepository.getAcc(accId);
        acc.balance = getBalance(accId);
        double balance = acc.balance + amount;
        acc.setBalance(balance);
        accRepository.save(acc);
    }

    public void withdraw(int accId, double amount) {
        // TODO getBalance woła repozytorium, w l. 53 znowu wołasz bazę danych, może żeby uniknąć gwałtu na bazie za każdym
        //  razem jak chcesz zobaczyć balance o lepiej by było usunąć metoę
        //  getBalance(String accid)  i wołać get na obiekcie account
        if (amount > getBalance(accId)) {
            throw new InsufficientFoundsException("Insufficient funds.");
        }
        Account acc = accRepository.getAcc(accId);
        double balance = acc.balance - amount;
        acc.setBalance(balance);
        accRepository.save(acc);
        System.out.println("Withdrawn was made from your account.");

    }

}


