package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class LoggerTestSuite {
    @Test
    void testGetLastLog(){
        Logger.INSTANCE.log("Hello");
        Assertions.assertEquals(Logger.INSTANCE.getLastLog(), "Hello");
        Logger.INSTANCE.log("Siema");
        Assertions.assertEquals("Siema", Logger.INSTANCE.getLastLog());
    }
}
