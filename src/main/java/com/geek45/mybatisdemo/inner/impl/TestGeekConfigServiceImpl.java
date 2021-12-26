/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.mybatisdemo.inner.impl;

import com.geek45.mybatisdemo.dal.GeekConfigMapper;
import com.geek45.mybatisdemo.inner.TestGeekConfigService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestGeekConfigServiceImpl
 * @Decription:
 * @Author: rubik
 *  rubik create TestGeekConfigServiceImpl.java of 2021/12/26 5:01 下午
 */
@Service
public class TestGeekConfigServiceImpl implements TestGeekConfigService {

    public TestGeekConfigServiceImpl(GeekConfigMapper geekConfigMapper) {
        this.geekConfigMapper = geekConfigMapper;
    }
    private GeekConfigMapper geekConfigMapper;
    @Override
    public void test() {
        geekConfigMapper.select(SelectDSLCompleter.allRows());
    }
}
