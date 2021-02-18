package com.pupu;

import com.pupu.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * 远程调用webservice
 *
 * @author lp
 * @since 2021/2/18 23:41
 */
public class Client {
    public static void main(String[] args) {

        //  服务接口访问地址：http://localhost:8000/ws/hello

        //1. 创建cxf代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        //2. 设置远程访问服务端地址
        factory.setAddress("http://localhost:8000/ws/hello");

        //3.  设置接口类型
        factory.setServiceClass(HelloService.class);

        //4.  对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);

        //5.  代理对象对象  class com.sun.proxy.$Proxy34       [Java代理： 1. 静态代理；  2.动态代理（jdk接口代理、cglib子类代理）]    $CGLIB123
        System.out.println(helloService.getClass());

        //6. 远程访问服务端方法
        String content = helloService.sayHello("Jet");
        System.out.println(content);
    }
}
