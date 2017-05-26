package com.kitcenter.app.classwork.lesson6;

import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;
import org.junit.Test;

/**
 * Created by Viktor on 25.05.2017.
 */
public class CalculateEvenOrOddTest {

    @Test
    public void calculateEvenOrOddTest1 () {
        CalculateEvenOrOdd calculateEvenOrOdd = new CalculateEvenOrOdd();
        calculateEvenOrOdd.calculate(2);
    }
    @Test
    public void calculateEvenOrOddTest2 () {
        CalculateEvenOrOdd calculateEvenOrOdd = new CalculateEvenOrOdd();
        calculateEvenOrOdd.calculate(-53.3f);
    }
}
