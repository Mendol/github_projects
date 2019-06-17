package com.wmd.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by xuhongchuan on 2015/7/18.
 */
public class MathTest {

    @Test
    public void testFactorial() throws Exception {

        assertEquals(120, new Math().factorial(5));

    }

}
