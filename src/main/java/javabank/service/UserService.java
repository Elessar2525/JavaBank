package javabank.service;

import javabank.db.UserRepository;
import javabank.model.User;

public class UserService{

    private UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public String getFullName(String name, String surname) {
        User user = userRepository.getUser(name + surname);
        return user.getFullName();
    }
}

