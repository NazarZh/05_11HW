package com.company;

import com.company.users.Status;
import com.company.users.Store;
import com.company.users.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("1", "1", Status.DIRECTOR, "dir");
        User user2 = new User("2", "2", Status.ADMINISTRATOR, "adm");
        User user3 = new User("3", "3", Status.MANAGER, "man");
        User user4 = new User("4", "4", Status.CLIENT, "cli");
        User user5 = new User("5", "5", Status.ANONYMOUS, "ano");

        User[] users = {user1, user2, user3, user4, user5};

        User nowUser = new User("1", "1", Status.DIRECTOR, "dir");

        Store store = new Store("Amstor", "urexxxxxxxx", users, nowUser);

        while (true) {
            tryLogin(store);
        }


    }

    public static void tryLogin(Store store) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = sc1.nextLine();
        //Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = sc1.nextLine();

        if (store.login(login, password)) {
            store.gerCurrentUserRights();
            store.logout();
        } else {
            System.out.println("Неверный логин и\\или пароль");
        }
    }
}
