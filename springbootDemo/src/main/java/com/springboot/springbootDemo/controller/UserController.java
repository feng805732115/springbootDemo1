package com.springboot.springbootDemo.controller;

import com.springboot.springbootDemo.pojo.SmbmsUser;
import com.springboot.springbootDemo.service.UserService;
import com.springboot.springbootDemo.util.AjaxResult;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
     private UserService userService;
    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
    @RequestMapping("/login1")
    @ResponseBody
    public AjaxResult login(Model model){
        List<SmbmsUser> userList=userService.getUserList();
        Map<String,Object> infoMap=new ConcurrentHashMap<String,Object>();
  /*      List<String>userNames=userList.stream().filter(smbmsUser -> smbmsUser.getGender()==1)
                .sorted(Comparator.comparing(SmbmsUser::getCreationDate))
                .map(SmbmsUser::getUserName).collect(Collectors.toList());*/
        Assert.notEmpty(userList,"集合不可以为空！");
        List<Object>userNames=userList.stream().filter(smbmsUser -> smbmsUser.getUserRole()==3)
                .map(SmbmsUser::getUserName).collect(Collectors.toList());
        model.addAttribute("userNames",userNames);
        model.addAttribute("userList",userList);
        infoMap.put("userNames",userNames);
        infoMap.put("userList",userList);
        return AjaxResult.success("用户角色为普通员工和所有用户信息",infoMap);
    }

    @RequestMapping("/login")
    public String login1(Model model){
        List<SmbmsUser> userList=userService.getUserList();
        Map<String,Object> infoMap=new ConcurrentHashMap<String,Object>();
  /*      List<String>userNames=userList.stream().filter(smbmsUser -> smbmsUser.getGender()==1)
                .sorted(Comparator.comparing(SmbmsUser::getCreationDate))
                .map(SmbmsUser::getUserName).collect(Collectors.toList());*/
        Assert.notEmpty(userList,"集合不可以为空！");
        List<String>userNames=userList.stream().filter(smbmsUser -> smbmsUser.getUserRole()==3)
                .map(SmbmsUser::getUserName).collect(Collectors.toList());
        model.addAttribute("userNames",userNames);
        model.addAttribute("userList",userList);
        infoMap.put("userNames",userNames);
        infoMap.put("userList",userList);
        return "login";
    }

 /*   @PostMapping("/startCron1")
    @Scheduled(cron = "0/10 * * * * *")
    public AjaxResult startCron1(){
        System.out.println("first DynamicTask，"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return AjaxResult.success();
    }*/


}
