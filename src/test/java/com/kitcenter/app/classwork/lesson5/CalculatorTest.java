package com.kitcenter.app.classwork.lesson5;

import org.junit.*;

/**
 * Created by Viktor on 03.05.2017.
 */
public class CalculatorTest {
    int numberOne, numberTwo;

    /*
    Initialize test for Calculator functionality
     */
    @BeforeClass
    public static void setBeforeClassSetUp() {

    }

    @Before
    public void setUp() {
        numberOne = 40;
        numberTwo = 10;
    }

    @Test
    public void sumTest(){
    int expectedResult = 50;
    Calculator calculator = new Calculator();
    int actualResult = calculator.substract(numberOne,numberTwo);
    Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown(){
        System.out.println("Postcondition for every test");
    }
    @AfterClass
    public void tearDownForClass(){
        System.out.println("Postcondition for class test");
    }
}