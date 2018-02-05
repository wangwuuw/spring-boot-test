package net.cowfish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @classDesc： 功能描述：（）
 * @author：王武
 * @createTime 2018/2/5
 * @verson: v1.0
 * @copyright: 上海江豚教育科技有限公司
 * @qq:834667820
 */
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createUser(String name, Integer age) {
        System.out.println("createUser");
        jdbcTemplate.update("insert into users values(null,?,?);", name, age);
        System.out.println("创建用户成功...");
    }

}
