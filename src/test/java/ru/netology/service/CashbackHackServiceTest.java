package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {

    @Test
    void remain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}