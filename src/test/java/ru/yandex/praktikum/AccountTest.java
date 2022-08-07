package ru.yandex.praktikum;

import org.junit.*;

public class AccountTest {
    @Test
    public void correctName() {
        Account account = new Account("Ivan Nikolaev");
        boolean expectedResult = true;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameWithoutSpace() {
        Account account = new Account("IvanNikolaev");
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameWithStartSpace() {
        Account account = new Account(" Ivan Nikolaev");
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameWithEndSpace() {
        Account account = new Account("Ivan Nikolaev ");
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameWithTwoSpaces() {
        Account account = new Account("Ivan  Nikolaev");
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameLengthLessThree() {
        Account account = new Account("Ni");
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameLengthMore19() {
        Account account = new Account("Konstantin Stanislavskii");
        boolean expectedResult = false;
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
