package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getMax() {

        int[] testCaseOne = {0, 1};
        int[] testCaseTwo = {907, 26, 900};
        int[] testCaseThree = {20, 20, 20, 20};
        int[] testCaseFour = {2};
        int[] testCaseFive = {-1, -2, -3};
        int[] testCaseSix = {10, 0, -2, 6, -4};

        assertAll(() -> assertEquals(1, Main.getMax(testCaseOne)),
                () -> assertEquals(907, Main.getMax(testCaseTwo)),
                () -> assertEquals(20, Main.getMax(testCaseThree)),
                () -> assertEquals(2, Main.getMax(testCaseFour)),
                () -> assertEquals(-1, Main.getMax(testCaseFive)),
                () -> assertEquals(10, Main.getMax(testCaseSix)));
    }
}