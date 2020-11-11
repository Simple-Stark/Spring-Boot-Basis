package com.wrh.basis.controller;

import com.wrh.basis.common.Result;
import com.wrh.basis.common.ResultCodeEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 控制层测试
 * @author Simple
 * @date 2020-11-11
 */
@RestController
public class TestController {

    private static Logger log = LogManager.getLogger(TestController.class);

    @GetMapping("/testSuccess")
    public Result testSuccess() {
        log.info("this is info ");
        return Result.success().message("查询成功").data("test",new ArrayList<String>(0));
    }

    @GetMapping("/testUnknownError")
    public Result testUnknownError() {
        return Result.error();
    }

    @GetMapping("/testSetResult")
    public Result testSetResult() {
        return Result.setResult(ResultCodeEnum.PARAM_ERROR).data(new HashMap<String, Object>(0));
    }
}
