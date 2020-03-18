package com.spring.jdbc.init;

import com.spring.jdbc.dao.BatchFooDao;
import com.spring.jdbc.dao.FooDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName JdbcOperateInit
 * @Description
 * @Author wangss
 * @date 2020.03.19 00:42
 * @Version 1.0
 */
@Slf4j
@Component
public class JdbcOperateInit implements CommandLineRunner {

    @Autowired
    private FooDao fooDao;

    @Autowired
    private BatchFooDao batchFooDao;

    @Override
    public void run(String... args) throws Exception {
        fooDao.insertData();
        batchFooDao.batchInsert();
        fooDao.listData();
    }
}
