package io.adsz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    public void testWithFailing() {
         assertEquals(101,App.square(10));
   }

    public void testSquare() {
        assertEquals(49,App.square(7));
    }

}
