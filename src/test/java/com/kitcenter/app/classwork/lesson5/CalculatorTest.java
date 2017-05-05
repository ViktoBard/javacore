package com.kitcenter.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Viktor on 03.05.2017.
 */
public class CalculatorTest {

    @Test
    public void substractTest() {
        int numberOne=40;
        int numberTwo=10;
        int expectedResult=30;

        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne,numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }
}