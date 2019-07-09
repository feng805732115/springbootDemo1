package com.springboot.springbootDemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.springboot.springbootDemo.config.AlipayConfig;
import com.springboot.springbootDemo.pojo.AlipayBean;
import com.springboot.springbootDemo.util.AlipayUtil;

@Controller
@RequestMapping("/user/alipay")
public class AlipayController {
	@RequestMapping(value = "/goAlipay", method = RequestMethod.POST)
    public String goAlipay(@RequestParam String orderNumber,
            @RequestParam Integer txnAmt,
            @RequestParam String goodsName
            ,ModelMap map,
            HttpServletRequest request, 
            HttpServletRequest response) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient client = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY,AlipayConfig.SIGNTYPE);
        AlipayTradeWapPayRequest alipay_request=new AlipayTradeWapPayRequest();

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = orderNumber;
        //付款金额，必填
        String total_amount = txnAmt.toString();
        //订单名称，必填
        String subject = goodsName;
        //商品描述，可空
        String body = "buycount:一双贵人鸟男鞋";
        String product_code="BILL2016_001";
        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        String timeout_express = "1c";
        AlipayBean alipayBean=new AlipayBean();
        alipayBean.setOut_trade_no(out_trade_no);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(new StringBuffer(total_amount));
        alipayBean.setBody(body);
        String payhtml = AlipayUtil.connect(alipayBean);
        map.addAttribute("Alipay", payhtml);
        return "unionpay/Alipay";
    }
}
