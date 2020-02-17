package com.openwis.helloworld.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldServiceTest
{
    @InjectMocks
    private HelloWorldService helloWorldService;
    private int theSum;

    @Test
    public void getSumTest()
    {
        theSum = helloWorldService.sumNumbers(1,1);
        assertEquals(2,theSum);
    }
}
