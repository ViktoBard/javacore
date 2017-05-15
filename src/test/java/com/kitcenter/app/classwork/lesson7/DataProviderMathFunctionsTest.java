package com.kitcenter.app.classwork.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Viktor on 13.05.2017.
 */

    @RunWith(JUnitParamsRunner.class)

public class DataProviderMathFunctionsTest {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, Math.multiplyExact(argA, argB));
    } //make sure that variables are in same order and types as in csv file
}
