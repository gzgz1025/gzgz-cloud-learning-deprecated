package com.gzgz.learning.factory;

import com.gzgz.learning.common.asserts.Result;
import com.gzgz.learning.dto.SmsParamDto;

/**
 * @ClassName: SmsFactory
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/17 15:11
 * @Version: 1.0
 */
public abstract class SmsFactory {
    public abstract Result sendMsg(SmsParamDto dto);
}
