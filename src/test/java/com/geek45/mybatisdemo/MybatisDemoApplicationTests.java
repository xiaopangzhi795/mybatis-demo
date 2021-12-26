package com.geek45.mybatisdemo;

import com.geek45.mybatisdemo.inner.TestGeekConfigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ComponentScan({"com.geek45"})
public class MybatisDemoApplicationTests {

    @Autowired
    private TestGeekConfigService testGeekConfigService;

    @Test
    public void contextLoads() {
        System.err.println("hello");
    }

    @Test
    public void testMybatis() {
        testGeekConfigService.test();
    }

}
