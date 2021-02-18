package com.pupu;

import com.pupu.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


/**
 * 发布服务
 * JaxWs：Java API For XML-WebService
 *
 * @author lp
 * @since 2021/2/18 23:27
 */
public class Server {
    public static void main(String[] args) {
        //1.  发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        //2.  设置服务地址；想查看说明书的话，需要加?wsdl
        factory.setAddress("http://localhost:8000/ws/hello");

        //3.  设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        //4.  添加日志输入、输出拦截器，观察soap请求、soap响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //5.  发布服务
        factory.create();

        System.out.println("发布服务成功，端口8000.....");

    }
}
