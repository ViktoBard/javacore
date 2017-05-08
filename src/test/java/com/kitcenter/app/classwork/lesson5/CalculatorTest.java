package com.kitcenter.app.classwork.lesson5;
import org.junit.*;

/**
 * Created by Viktor on 03.05.2017.
 */
public class CalculatorTest {
    int numberOne, numberTwo, expResultSum, expResultSub, expResultDiv, expResultMul, expResultSqr;

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
        expResultSum = 50;
        expResultSub = 30;
        expResultDiv = 4;
        expResultMul = 400;
        expResultSqr = 1600;
    }

    @Test
    public void substractTest () {
        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expResultSub, actualResult);
    }

    @Test
    public void sumTest (){
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne,numberTwo);
        Assert.assertEquals(expResultSum, actualResult);
        System.out.println(actualResult);
    }

    @Test
    public void division (){
        if (numberTwo == 0){
            System.out.println("You can not divide by 0");
        } else {
            Calculator calculator = new Calculator();
            int actualResult = calculator.division(numberOne, numberTwo);
            Assert.assertEquals(expResultDiv, actualResult);
        }
    }

    @Test
    public int multiplication () {
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(numberOne, numberTwo);
        Assert.assertEquals(expResultMul, actualResult);
        if (actualResult > 100) {
            return actualResult;
        }
        if (actualResult > 100) {
            System.out.println("Your result is more than 100");
        }
        if (actualResult < 10) {
            System.out.println("Your result is less than 10");
        } else return numberOne;
        return actualResult;
    }

    @Test
    public void sqr () {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sqr(numberOne);
        System.out.println(expResultSqr);
        Assert.assertEquals(expResultSqr, actualResult);
    }

    @After
    public void tearDown() {
        System.out.println("Postcondition for every test");
    }
}
//    @AfterClass
//    public void tearDownForClass(){
//        System.out.println("Postcondition for class test");
//    }