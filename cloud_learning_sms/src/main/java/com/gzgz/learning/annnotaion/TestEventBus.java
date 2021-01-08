package com.gzgz.learning.annnotaion;

import com.gzgz.learning.event.EventBus;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @ClassName: TestEventBus
 * @Description:
 * @Author: pzl
 * @CreateDate: 2021/1/8 15:05
 * @Version: 1.0
 */
public class TestEventBus {
    @Autowired
    private  EventBus eventBus;

    private static EventBus ss;

    @PostConstruct
    public void a(){
        ss=eventBus;
    }
    public static void main(String[] args) {
        ss.publish("222222");
    }
}
