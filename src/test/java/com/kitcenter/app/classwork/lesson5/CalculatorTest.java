package com.kitcenter.app.classwork.lesson5;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.awt.datatransfer.DataFlavor;
import java.util.Random;

/**
 * Created by Viktor on 03.05.2017.
 */
public class CalculatorTest {
    int numberOne, numberTwo, numberThree, numberFour, expResultSum, expResultSub, expResultDiv, expResultMul, numberFive;
    double dblOne, dblTwo, dblThree, dblFour, expResultDivDbl, expResultSqr;
    float flOne, flTwo;


    /*
    Initialize test for Calculator functionality
     */

//    @BeforeClass
//    public static void setBeforeClassSetUp() {
//            Result result = JUnitCore.runClasses(CalculatorTest.class);
//            for (Failure failure : result.getFailures()) {
//                System.out.println("Проблема была прямо ТУТ " + failure.toString());
//            }
//       System.out.println(result.wasSuccessful());
//    }

    @Before
    public void setUp()
 {
        numberOne = 40;
        numberTwo = 10;
        numberThree = -55;
        numberFour = -345;
        numberFive = 0;
        dblOne = 43.3d;
        dblTwo = 3.24d;
        dblThree = -4.0d;
        dblFour = 3.24d;
        flOne = 343.12344f;
        flTwo = 453.5434f;
    }



    @Test
    //отнимание положительных чисел
    public void substractTest() {
        System.out.println("Сейчас ты отнимешь " + numberOne + " от " + numberTwo);
        expResultSub = 30;
        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expResultSub, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //отнимание не целых чисел
    public void SubstractTest2() {
        expResultDivDbl = 40.059999999999995;
        System.out.println("Сейчас ты отнимешь " + dblOne + " от " + dblTwo);
        Calculator calculator = new Calculator();
        double actualResult = calculator.doubleSubstract(dblOne, dblTwo);
        Assert.assertEquals(expResultDivDbl, actualResult, 0.0);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //отнимание отрицательных чисел
    public void SubstractTest3() {
        expResultSub = 290;
        System.out.println("Сейчас ты отнимешь " + numberThree + " от " + numberFour);
        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberThree, numberFour);
        Assert.assertEquals(expResultSub, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //суммирование чисел
    public void sumTest() {
        expResultSum = 50;
        System.out.println("Сейчас ты сложишь " + numberOne + " и " + numberTwo);
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expResultSum, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //деление чисел
    public void divisionTest() {
        expResultDiv = 4;
        System.out.println("Сейчас ты разделишь " + numberOne + " на " + numberTwo);
        Calculator calculator = new Calculator();
        int actualResult = calculator.division(numberOne, numberTwo);
        Assert.assertEquals(expResultDiv, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //деление чисел где есть отрицательное число
    public void divisionTest2() {
        expResultDiv = 0;
        System.out.println("Сейчас ты разделишь " + numberThree + " на " + numberFour);
        Calculator calculator = new Calculator();
        int actualResult = calculator.division(numberThree, numberFour);
        Assert.assertEquals(expResultDiv, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //деление на ноль
    public void divisionTest3() {
        expResultDiv = 0;
        System.out.println("Сейчас ты разделишь " + numberThree + " на " + numberFive);
        Calculator calculator = new Calculator();
        int actualResult = calculator.division(numberThree, numberFive);
        Assert.assertEquals(expResultDiv, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //умножение положительных чисел
    public void multiplication() {
        expResultMul = 400;
        System.out.println("Сейчас ты умножишь " + numberOne + " на " + numberTwo);
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(numberOne, numberTwo);
        Assert.assertEquals(expResultMul, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    //умножение отрицательных чисел
    public void multiplication2() {
        expResultMul = 18975;
        System.out.println("Сейчас ты умножишь " + numberThree + " на " + numberFour);
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(numberThree, numberFour);
        Assert.assertEquals(expResultMul, actualResult);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    public void mathPowTest() {
        expResultSqr = 200549.1308641415;
        System.out.println("Сейчас ты возведёшь в степень " + dblTwo + " число " + dblOne);
        Calculator calculator = new Calculator();
        double actualResult = calculator.mathPow(dblOne, dblTwo);
        Assert.assertEquals(expResultSqr, actualResult,0.0);
        System.out.println("Результат = " + actualResult);
    }

    @Test
    public void mathPowTest2() {
        expResultSqr = 0;
        System.out.println("Сейчас ты возведёшь число " + dblThree + " в степень " + dblFour);
        Calculator calculator = new Calculator();
        double actualResult = calculator.mathPow2(dblThree, dblFour);
        Assert.assertEquals(expResultSqr, actualResult,0.0);
        System.out.println("Результат = " + actualResult);
    }


    @After
    public void tearDown() {
        System.out.println("...........Чёт прошло, идем дальше...........");
    }

    @AfterClass
    public static void tearDownForClass() {
        System.out.println("Всё, закончили.");
    }
}