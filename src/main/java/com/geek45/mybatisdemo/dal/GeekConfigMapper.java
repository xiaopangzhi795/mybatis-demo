package com.geek45.mybatisdemo.dal;

import com.geek45.mybatisdemo.dal.model.GeekConfig;
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

import static com.geek45.mybatisdemo.dal.GeekConfigDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface GeekConfigMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    BasicColumn[] selectList = BasicColumn.columnList(id, configName, configValue, note, appId, dataId, createTime, modifyTime, status, env, deleted);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<GeekConfig> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @Insert({
        "${insertStatement}"
    })
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<GeekConfig> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int insertMultiple(MultiRowInsertStatementProvider<GeekConfig> multipleInsertStatement) {
        return insertMultiple(multipleInsertStatement.getInsertStatement(), multipleInsertStatement.getRecords());
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GeekConfigResult")
    Optional<GeekConfig> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GeekConfigResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="config_name", property="configName", jdbcType=JdbcType.VARCHAR),
        @Result(column="config_value", property="configValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.INTEGER),
        @Result(column="data_id", property="dataId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="env", property="env", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.INTEGER)
    })
    List<GeekConfig> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, geekConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, geekConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int insert(GeekConfig record) {
        return MyBatis3Utils.insert(this::insert, record, geekConfig, c ->
            c.map(configName).toProperty("configName")
            .map(configValue).toProperty("configValue")
            .map(note).toProperty("note")
            .map(appId).toProperty("appId")
            .map(dataId).toProperty("dataId")
            .map(createTime).toProperty("createTime")
            .map(modifyTime).toProperty("modifyTime")
            .map(status).toProperty("status")
            .map(env).toProperty("env")
            .map(deleted).toProperty("deleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int insertMultiple(Collection<GeekConfig> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, geekConfig, c ->
            c.map(configName).toProperty("configName")
            .map(configValue).toProperty("configValue")
            .map(note).toProperty("note")
            .map(appId).toProperty("appId")
            .map(dataId).toProperty("dataId")
            .map(createTime).toProperty("createTime")
            .map(modifyTime).toProperty("modifyTime")
            .map(status).toProperty("status")
            .map(env).toProperty("env")
            .map(deleted).toProperty("deleted")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int insertSelective(GeekConfig record) {
        return MyBatis3Utils.insert(this::insert, record, geekConfig, c ->
            c.map(configName).toPropertyWhenPresent("configName", record::getConfigName)
            .map(configValue).toPropertyWhenPresent("configValue", record::getConfigValue)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(appId).toPropertyWhenPresent("appId", record::getAppId)
            .map(dataId).toPropertyWhenPresent("dataId", record::getDataId)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(modifyTime).toPropertyWhenPresent("modifyTime", record::getModifyTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(env).toPropertyWhenPresent("env", record::getEnv)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default Optional<GeekConfig> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, geekConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default List<GeekConfig> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, geekConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default List<GeekConfig> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, geekConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default Optional<GeekConfig> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, geekConfig, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    static UpdateDSL<UpdateModel> updateAllColumns(GeekConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(configName).equalTo(record::getConfigName)
                .set(configValue).equalTo(record::getConfigValue)
                .set(note).equalTo(record::getNote)
                .set(appId).equalTo(record::getAppId)
                .set(dataId).equalTo(record::getDataId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(modifyTime).equalTo(record::getModifyTime)
                .set(status).equalTo(record::getStatus)
                .set(env).equalTo(record::getEnv)
                .set(deleted).equalTo(record::getDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GeekConfig record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(configName).equalToWhenPresent(record::getConfigName)
                .set(configValue).equalToWhenPresent(record::getConfigValue)
                .set(note).equalToWhenPresent(record::getNote)
                .set(appId).equalToWhenPresent(record::getAppId)
                .set(dataId).equalToWhenPresent(record::getDataId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(modifyTime).equalToWhenPresent(record::getModifyTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(env).equalToWhenPresent(record::getEnv)
                .set(deleted).equalToWhenPresent(record::getDeleted);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int updateByPrimaryKey(GeekConfig record) {
        return update(c ->
            c.set(configName).equalTo(record::getConfigName)
            .set(configValue).equalTo(record::getConfigValue)
            .set(note).equalTo(record::getNote)
            .set(appId).equalTo(record::getAppId)
            .set(dataId).equalTo(record::getDataId)
            .set(createTime).equalTo(record::getCreateTime)
            .set(modifyTime).equalTo(record::getModifyTime)
            .set(status).equalTo(record::getStatus)
            .set(env).equalTo(record::getEnv)
            .set(deleted).equalTo(record::getDeleted)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    default int updateByPrimaryKeySelective(GeekConfig record) {
        return update(c ->
            c.set(configName).equalToWhenPresent(record::getConfigName)
            .set(configValue).equalToWhenPresent(record::getConfigValue)
            .set(note).equalToWhenPresent(record::getNote)
            .set(appId).equalToWhenPresent(record::getAppId)
            .set(dataId).equalToWhenPresent(record::getDataId)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(modifyTime).equalToWhenPresent(record::getModifyTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(env).equalToWhenPresent(record::getEnv)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .where(id, isEqualTo(record::getId))
        );
    }
}