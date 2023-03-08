package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    
    @Test
    public void testAddition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result, "2 + 2 should equal 4");
    }
    
    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        Assertions.assertEquals(2, result, "5 - 3 should equal 2");
    }
    
}
