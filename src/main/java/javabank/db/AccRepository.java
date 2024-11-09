package javabank.db;

import javabank.model.Account;

public interface AccRepository {
    Account getAcc(int accID);

    boolean accExists(int accID);

    String getUser(String user);

    boolean userExists(String user);

    void save(Account account);
}