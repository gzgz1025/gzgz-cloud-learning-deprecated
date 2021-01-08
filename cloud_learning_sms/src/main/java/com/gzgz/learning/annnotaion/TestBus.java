package com.gzgz.learning.annnotaion;

import com.gzgz.learning.event.EventHandler;
import net.engio.mbassy.listener.Handler;

/**
 * @ClassName: TestBus
 * @Description:
 * @Author: pzl
 * @CreateDate: 2021/1/8 15:04
 * @Version: 1.0
 */
@EventHandler
public class TestBus {

    @Handler
    public void handle(String code){
        System.out.println(code);
    }
}
