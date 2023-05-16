package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class LoggerTestSuite {
    @Test
    void testGetLastLog(){
        Logger.log("Hello");
        Logger.log("Goodbye");
        Assertions.assertNotEquals(Logger.getLastLog(), "Hello");
        Assertions.assertEquals(Logger.getLastLog(),"Goodbye");
    }
}
