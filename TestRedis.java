package com.example.redis;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestRedis {
    private Jedis jedis;

    @Before
    public  void setJedis() {
        jedis = new Jedis("127.0.0.1",6379);
        //jedis.auth("")
        System.out.println("连接服务成功");
    }

    @Test
    public void testString() {
        jedis.set("name","haha");
        System.out.println("拼接前:" + jedis.get("name"));
        jedis.append("name","is my name;");
        System.out.println("拼接后：" + jedis.get("name"));
        jedis.del("name");
        System.out.println("删除后：" + jedis.get("name"));
    }
}
