package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        int amount = 1000;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}