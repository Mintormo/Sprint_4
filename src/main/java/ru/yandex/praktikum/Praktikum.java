package ru.yandex.praktikum;

public class Praktikum {
    public static void main(String[] args) {
        Account account = new Account("Andrey Petrovsky");
        if (account.checkNameToEmboss()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
