package ru.netology.service;

import org.testng.Assert;

import org.testng.annotations.Test;


public class CashbackHackServiceTest {


    @Test
    public void SeeAmountLess1000() {
        CashbackHackService cashback = new CashbackHackService();

        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void SeeAmountMore1000() {
        CashbackHackService cashback = new CashbackHackService();

        int amount = 1500;

        int actual = cashback.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void SeeAmountEqual1000() {
        CashbackHackService cashback = new CashbackHackService();

        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);

    }
}
