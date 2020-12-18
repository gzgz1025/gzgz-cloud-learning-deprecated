package com.gzgz.learning.service;

import cn.hutool.json.JSONObject;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.gson.JsonObject;
import com.gzgz.learning.common.asserts.Result;
import com.gzgz.learning.dto.SmsParamDto;
import com.gzgz.learning.factory.SmsFactory;

/**
 * @ClassName: Sms1Service
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/17 15:21
 * @Version: 1.0
 */
public class Sms1Service extends SmsFactory {
    @Override
    public Result sendMsg(SmsParamDto dto) {

        return Result.success("短信1平台发送短信",dto);
    }
}
