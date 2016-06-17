package com.cloud.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cloud.service.MyServices;

/**
 * Created by Administrator on 2016/6/16.
 */
@Service
public class MyServicesImpl implements MyServices {

    @Override
    public String first() {
        return "OOOOOOOOOOKKKKKKKKKKKKKKKK";
    }
}
