package com.kitcenter.app.homework.lesson6;

import org.junit.Test;

/**
 * Created by Viktor on 25.05.2017.
 */
public class DefineBiggerOrEqualNumberTest {

    @Test
    public void defineBiggerPositiveTest(){
        DefineBiggerOrEqualNumber defineBiggerOrEqualNumber = new DefineBiggerOrEqualNumber();
        defineBiggerOrEqualNumber.defineBiggerOrEqualNumber(515615.1545,5815151.151515);
    }
    @Test
    public void defineBiggerEquelTest(){
        DefineBiggerOrEqualNumber defineBiggerOrEqualNumber = new DefineBiggerOrEqualNumber();
        defineBiggerOrEqualNumber.defineBiggerOrEqualNumber(1,1);
    }
    @Test
    public void defineBiggerNegativeTest(){
        DefineBiggerOrEqualNumber defineBiggerOrEqualNumber = new DefineBiggerOrEqualNumber();
        defineBiggerOrEqualNumber.defineBiggerOrEqualNumber(-151616.541,-15.4151515154);
    }
}
