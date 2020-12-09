package com.gzgz.learning.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gzgz.learning.common.asserts.Result;
import com.gzgz.learning.model.Payment;
import com.gzgz.learning.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public Result byResource() {
        return  Result.success("200",  new Payment(2020L, BigDecimal.ONE));
    }

    public Result handleException(BlockException exception) {
        return  Result.success("444", exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException")
    public Result byUrl() {
        return  Result.success("200",  new Payment(2020L, BigDecimal.ONE));
    }

    /**
     * 自定义限流处理
     * @return
     */
    //CustomerBlockHandler
    @GetMapping("/rateLimit/CustomerBlockHandler")
    @SentinelResource(value = "customerBlockHandler", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public Result CustomerBlockHandler() {
        return  Result.success("200"+"自定义限流OK",  new Payment(2020L, BigDecimal.ONE));
    }

}
