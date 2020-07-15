package com.mycompany.app;

import org.junit.Test;

public class AppTest {

    @Test
    public void testBug() {
        for(int i = 0;  i < 100000; i++){
            System.out.println("Some output longer than 10 character");
        }
        throw new NullPointerException();
    }


}
