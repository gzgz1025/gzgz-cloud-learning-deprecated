package com.gzgz.learning.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gzgz.learning.common.asserts.Result;

/**
 * 全局自定义限流处理
 */
public class CustomerBlockHandler {

    public static Result handlerException(BlockException exception) {
        return  Result.success("4444", "按客户自定义,global handlerException----------1");
    }

    public static Result handlerException2(BlockException exception) {
        return  Result.success("4444",  "按客户自定义2,global handlerException----------2");
    }
}
