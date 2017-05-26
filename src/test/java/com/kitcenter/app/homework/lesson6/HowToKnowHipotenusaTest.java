package com.kitcenter.app.homework.lesson6;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by user on 12.05.2017.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HowToKnowHipotenusaTest {

    @Test
    public void hipotenusaPositiveTest() {
        HowToKnowHipotenusa howToKnowHipotenusa = new HowToKnowHipotenusa();
        howToKnowHipotenusa.howToKnowHipotenusa(4,4);
    }

    @Test
    public void hipotenusaNegativeTest() {
        HowToKnowHipotenusa howToKnowHipotenusa = new HowToKnowHipotenusa();
        howToKnowHipotenusa.howToKnowHipotenusa(-456615,-1561816861);
    }
}