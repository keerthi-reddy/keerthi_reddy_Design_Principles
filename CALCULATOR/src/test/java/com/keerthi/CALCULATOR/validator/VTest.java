package com.keerthi.CALCULATOR.validator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import com.keerthi.CALCULATOR.expressionn.Expression;
import com.keerthi.CALCULATOR.expressionn.Operator;
import com.keerthi.CALCULATOR.expressionn.VALID;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;




@RunWith(Parameterized.class)
public class VTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new Expression()
                        .setFirst(new BigDecimal(3))
                        .setSecond(new BigDecimal(2))
                        .setSign(Operator.PLUS)},
                {false, new Expression()
                        .setFirst(new BigDecimal(-3))
                        .setSign(Operator.PLUS)},
                {false, new Expression()
                        .setFirst(new BigDecimal(5))
                        .setSecond(new BigDecimal(-2))},
                {false, new Expression()
                        .setSecond(new BigDecimal(2))
                        .setSign(Operator.MUL)},
                {false, null}
        });
    }

    @Parameter
    public Boolean expected;

    @Parameter(1)
    public Expression input;

    @Test
    public void test() {
        Assert.assertEquals(expected, VALID.validateExp(input));
    }
}

