package com.lesson.spring.boot.redis.distlock;

import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @author zhengshijun
 * @version created on 2019/9/7.
 */
public class RedisLockTemplate {

    private final StringRedisTemplate redisTemplate;

    public RedisLockTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
    public Lock getRedisLock(String name,long expire, TimeUnit unit) {

        return new DistributedLock(name,expire,unit,redisTemplate);
    }


}
