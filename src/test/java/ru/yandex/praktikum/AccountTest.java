package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {
    String name;
    boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Name - {0}, expected result - {1}")
    public static Object[][] getData() {
        return new Object[][] {
                {"Ivan Nikolaev", true},
                {"IvanNikolaev", false},
                {" Ivan Nikolaev", false},
                {"Ivan Nikolaev ", false},
                {"Ivan  Nikolaev", false},
                {"Ni", false},
                {"Konstantin Stanislavskii", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void testName() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
