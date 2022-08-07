package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean length = (name.length() >= 3 && name.length() <= 19);
        boolean spaceExist = name.indexOf(' ') != -1;
        boolean spaceIsOne = name.indexOf(' ') == name.lastIndexOf(' ');
        boolean spaceIsInMiddle = name.indexOf(' ') != 0 && name.indexOf(' ') != (name.length() - 1);

        return length && spaceExist && spaceIsOne && spaceIsInMiddle;
    }
}
