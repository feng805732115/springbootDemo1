package com.springboot.springbootDemo.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Slf4j
@Component
@Async
public class ScheduledService {
    Logger log=Logger.getLogger(ScheduledService.class.getName());
 /*   @Scheduled(cron = "0/5 * * * * *")
    public void scheduled() {
        log.info("当前线程："+Thread.currentThread().getName()+"=====>>>>>使用cron  {}"+System.currentTimeMillis());
    }

    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        log.info("当前线程："+Thread.currentThread().getName()+"=====>>>>>使用fixedRate{}"+System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 5000)
    public void scheduled2() {
        log.info("当前线程："+Thread.currentThread().getName()+"=====>>>>>fixedDelay{}"+System.currentTimeMillis());

    }*/

}
