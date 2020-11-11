package com.wrh.basis.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层测试
 * @author Simple
 * @date 2020-11-11
 */
@RestController
public class TestController {

    private static Logger log = LogManager.getLogger(TestController.class);

    @GetMapping("/test")
    public String test() {
        log.trace("trace level log");
        log.debug("debug level log");
        log.info("info level log");
        log.error("error level log");
        log.fatal("fatal level log");
        return "hello test";
    }
}
