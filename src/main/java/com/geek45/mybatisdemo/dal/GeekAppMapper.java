package com.geek45.mybatisdemo.dal;

import com.geek45.mybatisdemo.dal.model.GeekApp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.geek45.mybatisdemo.dal.GeekAppDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface GeekAppMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    BasicColumn[] selectList = BasicColumn.columnList(id, appName, appKey, appId, note, createTime, modifyTime, status, deleted);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<GeekApp> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @Insert({
        "${insertStatement}"
    })
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<GeekApp> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int insertMultiple(MultiRowInsertStatementProvider<GeekApp> multipleInsertStatement) {
        return insertMultiple(multipleInsertStatement.getInsertStatement(), multipleInsertStatement.getRecords());
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GeekAppResult")
    Optional<GeekApp> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GeekAppResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="app_name", property="appName", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_key", property="appKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.INTEGER)
    })
    List<GeekApp> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, geekApp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, geekApp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int insert(GeekApp record) {
        return MyBatis3Utils.insert(this::insert, record, geekApp, c ->
            c.map(appName).toProperty("appName")
            .map(appKey).toProperty("appKey")
            .map(appId).toProperty("appId")
            .map(note).toProperty("note")
            .map(createTime).toProperty("createTime")
            .map(modifyTime).toProperty("modifyTime")
            .map(status).toProperty("status")
            .map(deleted).toProperty("deleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int insertMultiple(Collection<GeekApp> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, geekApp, c ->
            c.map(appName).toProperty("appName")
            .map(appKey).toProperty("appKey")
            .map(appId).toProperty("appId")
            .map(note).toProperty("note")
            .map(createTime).toProperty("createTime")
            .map(modifyTime).toProperty("modifyTime")
            .map(status).toProperty("status")
            .map(deleted).toProperty("deleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int insertSelective(GeekApp record) {
        return MyBatis3Utils.insert(this::insert, record, geekApp, c ->
            c.map(appName).toPropertyWhenPresent("appName", record::getAppName)
            .map(appKey).toPropertyWhenPresent("appKey", record::getAppKey)
            .map(appId).toPropertyWhenPresent("appId", record::getAppId)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default Optional<GeekApp> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, geekApp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default List<GeekApp> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, geekApp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default List<GeekApp> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, geekApp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default Optional<GeekApp> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, geekApp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    static UpdateDSL<UpdateModel> updateAllColumns(GeekApp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(appName).equalTo(record::getAppName)
                .set(appKey).equalTo(record::getAppKey)
                .set(appId).equalTo(record::getAppId)
                .set(note).equalTo(record::getNote)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(status).equalTo(record::getStatus)
                .set(deleted).equalTo(record::getDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GeekApp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(appName).equalToWhenPresent(record::getAppName)
                .set(appKey).equalToWhenPresent(record::getAppKey)
                .set(appId).equalToWhenPresent(record::getAppId)
                .set(note).equalToWhenPresent(record::getNote)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(deleted).equalToWhenPresent(record::getDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int updateByPrimaryKey(GeekApp record) {
        return update(c ->
            c.set(appName).equalTo(record::getAppName)
            .set(appKey).equalTo(record::getAppKey)
            .set(appId).equalTo(record::getAppId)
            .set(note).equalTo(record::getNote)
            .set(createTime).equalTo(record::getCreateTime)
            .set(modifyTime).equalTo(record::getModifyTime)
            .set(status).equalTo(record::getStatus)
            .set(deleted).equalTo(record::getDeleted)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    default int updateByPrimaryKeySelective(GeekApp record) {
        return update(c ->
            c.set(appName).equalToWhenPresent(record::getAppName)
            .set(appKey).equalToWhenPresent(record::getAppKey)
            .set(appId).equalToWhenPresent(record::getAppId)
            .set(note).equalToWhenPresent(record::getNote)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(modifyTime).equalToWhenPresent(record::getModifyTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .where(id, isEqualTo(record::getId))
        );
    }
}