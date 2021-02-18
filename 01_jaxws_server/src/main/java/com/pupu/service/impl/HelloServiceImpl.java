package com.pupu.service.impl;

import com.pupu.service.HelloService;

/**
 *
 * @author lp
 * @since  2021/2/18 23:24
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + ",Welcome to My home!";
    }
}
