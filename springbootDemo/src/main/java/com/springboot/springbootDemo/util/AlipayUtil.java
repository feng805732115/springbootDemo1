package com.springboot.springbootDemo.util;
import com.springboot.springbootDemo.config.PropertiesConfig;
import com.springboot.springbootDemo.pojo.AlipayBean;
import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class AlipayUtil {
    public static String connect(AlipayBean alipayBean) throws AlipayApiException, UnsupportedEncodingException {
        //1、获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(
                PropertiesConfig.getKey("gatewayUrl"),//支付宝网关
                PropertiesConfig.getKey("app_id"),//appid
                PropertiesConfig.getKey("merchant_private_key"),//商户私钥
                "json",
                PropertiesConfig.getKey("charset"),//字符编码格式
                PropertiesConfig.getKey("alipay_public_key"),//支付宝公钥
                PropertiesConfig.getKey("sign_type")//签名方式
        );
        System.out.println(PropertiesConfig.getKey("merchant_private_key"));
        System.out.println(PropertiesConfig.getKey("charset"));
        //2、设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        //页面跳转同步通知页面路径
        alipayRequest.setReturnUrl(PropertiesConfig.getKey("return_url"));
        // 服务器异步通知页面路径
        alipayRequest.setNotifyUrl(PropertiesConfig.getKey("notify_url"));
        //封装参数alipayRequest.setBizContent(JSON.toJSONString(orders))​ ;;;;;;
        String str=JSON.toJSONString(alipayBean);
        String str1=new String(str.getBytes("gbk"),"UTF-8");
        System.out.println(str1);
        alipayRequest.setBizContent(str);
        // 3、请求支付宝进行付款，并获取支付结果
        String result1 = alipayClient.pageExecute(alipayRequest).getBody();
        //返回付款信息
        return result1;
    }

}
