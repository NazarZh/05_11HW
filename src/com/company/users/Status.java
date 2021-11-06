package com.company.users;

public enum Status {
    DIRECTOR("Директор"),
    ADMINISTRATOR("Администратор"),
    MANAGER("Менеджер"),
    CLIENT("Клиент"),
    ANONYMOUS("Аноним");

    private String stat;

    Status(String stat) {
        this.stat = stat;
    }

    public String getStat() {
        return stat;
    }
}
