package com.jiker.keju;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TaixTest {
    @Test
    public void taix_move(){
        AppRunner zeroTwo = new AppRunner();
        assertEquals(zeroTwo.getPrice(1,0),6);
        assertEquals(zeroTwo.getPrice(3,0),7);
        assertEquals(zeroTwo.getPrice(10,0),13);
        assertEquals(zeroTwo.getPrice(2,3),7);
    }
}
