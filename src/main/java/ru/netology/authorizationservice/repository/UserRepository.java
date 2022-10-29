package ru.netology.authorizationservice.repository;

import ru.netology.authorizationservice.enums.Authorities;
import ru.netology.authorizationservice.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<>();
    public UserRepository () {
        users.put("Ivan", new User("Ivan", "111111", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE)));
        users.put("Petr", new User("Petr", "222222", List.of(Authorities.READ, Authorities.DELETE)));
        users.put("Maxim", new User("Maxim", "333333", new ArrayList<>()));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!users.containsKey(user))
            return  null;
        if(!users.get(user).getPassword().equals(password))
            return null;
        return users.get(user).getAuthoritiesList();
    }
}
