package com.example.mp.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mp.pojo.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testBaseMapper(){
        // 1. 单条查询
        UserDO user1  = userMapper.selectById(1);
        log.info("---单条查询---");
        log.info("user1={}", user1);

        // 2. 列表查询
        List<UserDO> userList = userMapper.selectList(new QueryWrapper<>());
        log.info("---列表查询---");
        userList.stream().forEach(user -> log.info("user{}={}", user.getId(), user));
    }
}