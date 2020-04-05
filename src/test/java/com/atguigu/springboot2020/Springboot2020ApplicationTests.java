package com.atguigu.springboot2020;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot2020ApplicationTests {
    Logger logger = LoggerFactory.getLogger(Springboot2020ApplicationTests.class);
    @Test
    void contextLoads() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
