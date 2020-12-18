package com.gzgz.learning.service;

import com.gzgz.learning.common.asserts.Result;
import com.gzgz.learning.dto.SmsParamDto;
import com.gzgz.learning.factory.SmsFactory;

/**
 * @ClassName: Sms2Service
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/17 15:22
 * @Version: 1.0
 */
public class Sms2Service extends SmsFactory {
    @Override
    public Result sendMsg(SmsParamDto dto) {
        return Result.success("短信2平台发送短信",dto);
    }
}
