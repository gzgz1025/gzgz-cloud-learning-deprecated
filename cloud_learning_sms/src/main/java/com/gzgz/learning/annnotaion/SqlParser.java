package com.gzgz.learning.annnotaion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * @ClassName: SqlParser
 * @Description: 负责解析注解
 * @Author: pzl
 * @CreateDate: 2021/1/8 14:41
 * @Version: 1.0
 */
public class SqlParser {
    public static void inject(Object obj){
        try {
            //获得sql字段
            Field sqlField = obj.getClass().getDeclaredField("sql");
            //设置私有的属性可以被访问
            sqlField.setAccessible(true);

            //获取所有的方法
            Method[] allMethod = obj.getClass().getDeclaredMethods();

            //遍历方法
            for (Method method : allMethod) {
                //从方法上获取@Insert注解
                Insert insertAnnotation = method.getAnnotation(Insert.class);
                if(insertAnnotation == null){
                    continue;
                }

                //获得注解的内容
                String[] value = insertAnnotation.value();

                //将注解中注入的内容设置到sql这个字段上
                sqlField.set(obj, value[0]);
            }

        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
