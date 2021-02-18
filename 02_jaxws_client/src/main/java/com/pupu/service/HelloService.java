package com.pupu.service;

import javax.jws.WebService;

/**
 * 对外发布服务的接口
 * @author lp
 * @since  2021/2/18 23:40
 */
@WebService
public interface HelloService {
    /**
     * 对外发布服务的接口的方法
     */
    public String sayHello(String name);
}
