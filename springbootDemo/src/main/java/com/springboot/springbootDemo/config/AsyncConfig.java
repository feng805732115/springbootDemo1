package com.springboot.springbootDemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {
    /*
此处成员变量应该使用@Value从配置中读取
 */
    @Value("${task-executor.core_pool_size}")
    private int corePoolSize ;
    @Value("${task-executor.max_pool_size}")
    private int maxPoolSize ;
    @Value("${task-executor.queue_capacity}")
    private int queueCapacity ;
    @Value("${task-executor.name-prefix}")
    private String namePrefix;

    @Bean("asyncServiceExecutor")
    public Executor asyncServiceExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(corePoolSize);//线程池核心线程数
        taskExecutor.setMaxPoolSize(maxPoolSize);//线程池最大线程数
        taskExecutor.setQueueCapacity(queueCapacity);//缓冲队列
        taskExecutor.setThreadNamePrefix(namePrefix);//线程名称前缀
        taskExecutor.setKeepAliveSeconds(60);//线程空闲后的最大存活时间
        //rejection-policy：当pool已经达到max size的时候，如何处理新任务
        //CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行
        //对拒绝task的处理策略
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        taskExecutor.initialize();
        return taskExecutor;
    }
}
