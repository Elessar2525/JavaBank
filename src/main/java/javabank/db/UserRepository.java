package javabank.db;

import javabank.model.User;

public interface UserRepository {
    User getUser(int userID);
    boolean exists(int userID);

    User getUser(String s);
}
