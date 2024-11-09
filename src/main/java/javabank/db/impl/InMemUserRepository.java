package javabank.db.impl;

import javabank.db.UserRepository;
import javabank.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemUserRepository implements UserRepository {
    private final Map<Integer, User> userMap = new HashMap<>();
    public InMemUserRepository(){
        userMap.put(101,new User(101, "Marian", "Bobek", "Polska, Lublin, Różana 9", List.of(1, 101)));
        userMap.put(102,new User(102, "Barian", "Kobek", "Polska, Lublin, Różana 3", List.of(2)));
        userMap.put(103,new User(103, "Karian", "Lobek", "Polska, Lublin, Różana 5", List.of(3)));
        userMap.put(104,new User(104, "Larian", "Nobek", "Polska, Lublin, Różana 6", List.of(4)));
        userMap.put(105,new User(105, "Oarian", "Mobek", "Polska, Lublin, Różana 7", List.of(5)));
        userMap.put(106,new User(106, "Darian", "Bobek", "Polska, Lublin, Różana 4", List.of(6)));
        userMap.put(107,new User(107, "Jarian", "Cobek", "Polska, Lublin, Różana 6", List.of(7)));
        userMap.put(108,new User(108, "Barian", "Zobek", "Polska, Lublin, Różana 4", List.of(8)));
        userMap.put(109,new User(109, "Carian", "Sobek", "Polska, Lublin, Różana 6", List.of(9)));
        userMap.put(1010,new User(1010, "Rarian", "Gobek", "Polska, Lublin, Różana 11", List.of(10)));
        userMap.put(1011,new User(1011, "Parian", "Tobek", "Polska, Lublin, Różana 19", List.of(11)));
    }
    @Override
    public User getUser(int userID) {
        return null;
    }

    @Override
    public boolean exists(int userID) {
        return false;
    }

    @Override
    public User getUser(String s) {
        return null;
    }
}
