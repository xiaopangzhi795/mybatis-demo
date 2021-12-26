/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.mybatisdemo.inner.impl;

import com.geek45.mybatisdemo.dal.GeekAppDynamicSqlSupport;
import com.geek45.mybatisdemo.dal.GeekConfigDynamicSqlSupport;
import com.geek45.mybatisdemo.dal.GeekConfigMapper;
import com.geek45.mybatisdemo.inner.TestGeekConfigService;
import com.github.pagehelper.PageHelper;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
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

    @Override
    public void testSql() {
        PageHelper.startPage(1, 10);
        //普通sql查询
        SelectStatementProvider selectStatement =
                SqlBuilder.select(GeekConfigMapper.selectList)
                        .from(GeekConfigDynamicSqlSupport.geekConfig)
                        .where(GeekConfigDynamicSqlSupport.appId, SqlBuilder.isEqualTo(1))
                        .and(GeekConfigDynamicSqlSupport.deleted, SqlBuilder.isEqualTo(1))
                        .orderBy(GeekConfigDynamicSqlSupport.id.descending())
                        .build()
                        .render(RenderingStrategies.MYBATIS3);
        geekConfigMapper.selectMany(selectStatement);

        //lambda表达式
        geekConfigMapper.select(c -> c
                        .where(GeekConfigDynamicSqlSupport.id, SqlBuilder.isIn(1))
                        .and(GeekConfigDynamicSqlSupport.deleted, SqlBuilder.isEqualTo(1))
                        .orderBy(GeekConfigDynamicSqlSupport.id.descending()));

        //子查询
        SelectStatementProvider provider = SqlBuilder.select(GeekConfigMapper.selectList)
                .from(GeekConfigDynamicSqlSupport.geekConfig)
                .where(GeekConfigDynamicSqlSupport.appId, SqlBuilder.isIn(SqlBuilder
                        .select(GeekAppDynamicSqlSupport.id)
                        .from(GeekAppDynamicSqlSupport.geekApp)
                        .where(GeekAppDynamicSqlSupport.appName, SqlBuilder.isEqualTo("geek45"))
                        .orderBy(GeekAppDynamicSqlSupport.id.descending())
                        .limit(0).offset(1)))
                .orderBy(GeekConfigDynamicSqlSupport.id.descending())
                .limit(0).offset(10)
                .build()
                .render(RenderingStrategies.MYBATIS3);
        geekConfigMapper.selectMany(provider);

        //TODO 参考文档：https://cloud.tencent.com/developer/article/1769767
    }
}
