package ru.netology.authorizationservice.model;

import ru.netology.authorizationservice.enums.Authorities;
import java.util.List;

public class User {
    String name;
    String password;

    List<Authorities> authoritiesList;

    public User(String name, String password, List<Authorities> authoritiesList) {
        this.name = name;
        this.password = password;
        this.authoritiesList = authoritiesList;

    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthoritiesList() {
        return authoritiesList;
    }
}
