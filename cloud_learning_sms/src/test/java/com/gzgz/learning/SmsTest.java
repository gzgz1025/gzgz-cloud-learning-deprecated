package com.gzgz.learning;

import com.gzgz.learning.dto.SmsParamDto;
import com.gzgz.learning.event.EventBus;
import com.gzgz.learning.utils.SmsToos;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: SmsService
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/17 15:22
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SmsTest {
    //SmsUtils.fdddf("","",duanxin);
    static {
        System.setProperty("spring.profiles.active", "local");
    }
    @Autowired
    private EventBus eventBus;
    @Test
    public void smsTest(){
        Class<?> clazz;
        try {
            clazz = Class.forName(SmsToos.map.get("sms2"));
            Method method= clazz.getMethod("sendMsg", SmsParamDto.class);
            SmsParamDto smsParamDto=new SmsParamDto();
            smsParamDto.setAppId("111111");
            smsParamDto.setAppKey("3242134dsfasf");
            smsParamDto.setMobile("15896622356");
            Object obj1 = method.invoke(clazz.newInstance(),smsParamDto);
            System.out.println(" ："+obj1);
            //保存返回
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testEvent(){
        eventBus.publish("12");
    }
}
