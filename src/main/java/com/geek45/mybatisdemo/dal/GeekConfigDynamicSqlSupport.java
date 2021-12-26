package com.geek45.mybatisdemo.dal;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class GeekConfigDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    public static final GeekConfig geekConfig = new GeekConfig();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.id")
    public static final SqlColumn<Integer> id = geekConfig.id;

    /**
     * Database Column Remarks:
     *   配置名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_name")
    public static final SqlColumn<String> configName = geekConfig.configName;

    /**
     * Database Column Remarks:
     *   值
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_value")
    public static final SqlColumn<String> configValue = geekConfig.configValue;

    /**
     * Database Column Remarks:
     *   备注
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.note")
    public static final SqlColumn<String> note = geekConfig.note;

    /**
     * Database Column Remarks:
     *   所属app
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.app_id")
    public static final SqlColumn<Integer> appId = geekConfig.appId;

    /**
     * Database Column Remarks:
     *   分组
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.data_id")
    public static final SqlColumn<String> dataId = geekConfig.dataId;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.create_time")
    public static final SqlColumn<Date> createTime = geekConfig.createTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.modify_time")
    public static final SqlColumn<Date> modifyTime = geekConfig.modifyTime;

    /**
     * Database Column Remarks:
     *   状态
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.status")
    public static final SqlColumn<String> status = geekConfig.status;

    /**
     * Database Column Remarks:
     *   环境
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.env")
    public static final SqlColumn<String> env = geekConfig.env;

    /**
     * Database Column Remarks:
     *   删除逻辑字段
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.deleted")
    public static final SqlColumn<Integer> deleted = geekConfig.deleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    public static final class GeekConfig extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> configName = column("config_name", JDBCType.VARCHAR);

        public final SqlColumn<String> configValue = column("config_value", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> appId = column("app_id", JDBCType.INTEGER);

        public final SqlColumn<String> dataId = column("data_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyTime = column("modify_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<String> env = column("env", JDBCType.VARCHAR);

        public final SqlColumn<Integer> deleted = column("deleted", JDBCType.INTEGER);

        public GeekConfig() {
            super("geek_config");
        }
    }
}