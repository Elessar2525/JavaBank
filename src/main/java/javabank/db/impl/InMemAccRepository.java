package javabank.db.impl;

import javabank.db.AccRepository;
import javabank.model.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemAccRepository implements AccRepository {
    private final Map<Integer, Account> accMap = new HashMap<>();

    public InMemAccRepository() {
        accMap.put(1, new Account(1, 6788, "Marian Bobek", "history"));
        accMap.put(101, new Account(101, 222, "Marian Bobek", "history"));
        accMap.put(2, new Account(2, 245, "Barian Kobek", "history"));
        accMap.put(3, new Account(3, 255, "Karian Lobek", "history"));
        accMap.put(4, new Account(4, 525, "Larian Nobek", "history"));
        accMap.put(5, new Account(5, 2553, "Oarian Mobek", "history"));
        accMap.put(6, new Account(6, 2551, "Darian Bobek", "history"));
        accMap.put(7, new Account(7, 2515, "Jarian Cobek", "history"));
        accMap.put(8, new Account(8, 21552, "Barian zobek", "history"));
        accMap.put(9, new Account(9, 25115, "Carian Sobek", "history"));
        accMap.put(10, new Account(10, 2511115, "Rarian Gobek", "history"));
        accMap.put(11, new Account(11, 2222255, "Parian Tobek", "history"));
    }

    @Override
    public Account getAcc(int accID) {
        return accMap.get(accID);
    }

    @Override
    public boolean accExists(int accID) {
        return accMap.containsKey(accID);
    }

    @Override
    public String getUser(String user) { return String.valueOf(accMap.get(user)); }

    @Override
    public boolean userExists(String user) {
        return accMap.containsKey(user);
    }

    @Override
    public void save(Account account) {
        accMap.put(account.getAccId(), account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accMap.values());
    }
}
