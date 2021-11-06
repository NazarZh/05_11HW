package com.company.users;

public class Store {
    public String name;
    public String URL;
    public User[] customers;
    public User currentUser;

    public Store(String name, String URL, User[] customers, User currentUser) {
        this.name = name;
        this.URL = URL;
        this.customers = customers;
        this.currentUser = currentUser;
    }

    public boolean login(String login, String password) {
        if (login == null || null == password) {
            return false;
        } else {
            int c = 0;
            for (int i = 0; i < customers.length; i++) {
                if (login.equals(customers[i].login) && password.equals(customers[i].password)){
                    c = 1;
                    currentUser = customers[i];
                }
            }
            if (c == 1){
                return true;
            } else {
                return false;
            }
        }
    }
    public void gerCurrentUserRights(){
        switch (currentUser.role.getStat().toLowerCase()) {
            case "директор" -> System.out.println("Директор магазина, может управлять кадрами, и ценами");
            case "администратор" -> System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
            case "менеджер" -> System.out.println("Менеджер магазина, может общаться с клиентами");
            case "клиент" -> System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
            default -> System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");
        }
    }
    public void logout(){
        currentUser = null;
        System.out.println("Пользователь вышел из системы");
    }
}
