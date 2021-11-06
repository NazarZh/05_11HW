package com.company.users;

public class User {
    public String login;
    public String password;
    public String name;
    public Status role = Status.ANONYMOUS;

    public User(String name, String password, Status role, String login) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public void setRole(Status role) {
        this.role = role;
    }
}
