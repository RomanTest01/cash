package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void SeeAmountLess1000() {
        CashbackHackService cashback = new CashbackHackService();

        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);


    }

    @Test
    public void SeeAmountMore1000() {
        CashbackHackService cashback = new CashbackHackService();

        int amount = 1500;

        int actual = cashback.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void SeeAmountEqual1000() {
        CashbackHackService cashback = new CashbackHackService();

        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
}
