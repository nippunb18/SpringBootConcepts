package com.springconcepts.examples;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleTest {


    @Test
    public void Test()

    {
        assertEquals(5,3+2);

    }
}
