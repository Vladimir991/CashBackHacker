package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectlyCountUp1000() {
        int amount = 1400;
        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainZero() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}


