package com.springboot.springbootDemo.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesConfig {
    //保存支付宝加载配置参数
    private static Map<String, String> aliPropertiesMap = new HashMap<String, String>();

    /*获取配置参数值*/
    public static String getKey(String key) {
        return aliPropertiesMap.get(key);
    }

    /*监听启动完成，执行配置加载到aliPropertiesMap*/
 /*   public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicatinReadyEvent) {
            this.init(aliPropertiesMap);//应用启动加载
        }
    }*/
    /*初始化加载aliPropertiesMap*/
         static {
// 获得PathMatchingResourcePatternResolver对象
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
//加载resource文件(也可以加载resources)
            Resource resources = resolver.getResource("classpath:alipay.properties");
            PropertiesFactoryBean config = new PropertiesFactoryBean();
            config.setLocation(resources);
            config.afterPropertiesSet();
            Properties prop = config.getObject();
            //循环遍历所有得键值对并且存入集合
            aliPropertiesMap.put("app_id", (String) prop.get("app_id"));
            aliPropertiesMap.put("merchant_private_key", (String) prop.get("merchant_private_key"));
            aliPropertiesMap.put("alipay_public_key", (String) prop.get("alipay_public_key"));
            aliPropertiesMap.put("notify_url", (String) prop.get("notify_url"));
            aliPropertiesMap.put("return_url", (String) prop.get("return_url"));
            aliPropertiesMap.put("sign_type", (String) prop.get("sign_type"));
            aliPropertiesMap.put("charset", (String) prop.get("charset"));
            aliPropertiesMap.put("gatewayUrl", (String) prop.get("gatewayUrl"));
            aliPropertiesMap.put("log_path", (String) prop.get("log_path"));
            aliPropertiesMap.put("format", (String) prop.get("format"));
        } catch (Exception e) {
            new Exception("配置文件加载失败");
        }
    }

}
