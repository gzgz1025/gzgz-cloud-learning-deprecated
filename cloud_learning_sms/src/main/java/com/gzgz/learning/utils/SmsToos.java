package com.gzgz.learning.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ServiceToos
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/17 15:40
 * @Version: 1.0
 */
public class SmsToos {
    public final static Map<String,String> map = new HashMap<String,String>() {{
        put("sms1", "com.gzgz.learning.service.Sms1Service");
        put("sms2", "com.gzgz.learning.service.Sms2Service");
    }};
}
