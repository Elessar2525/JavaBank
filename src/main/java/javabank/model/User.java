package javabank.model;

import java.util.List;

public class User {
    private int userId;
    private String name;
    private String surname;
    private String address;
    private List<Integer> accountsId;

    public User(int userId, String name, String surname, String address, List<Integer> accountsId) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.accountsId = accountsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Integer> getAccountsId() {
        return accountsId;
    }

    public void setAccountsId(List<Integer> accountsId) {
        this.accountsId = accountsId;
    }

    @Override
    public String toString() {
        return ("Użytkownik: " + name + surname + "Adres: " + address);
    }

    public String getFullName() {
        return name + surname;
    }
}
