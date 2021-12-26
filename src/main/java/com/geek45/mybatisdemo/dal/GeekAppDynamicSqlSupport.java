package com.geek45.mybatisdemo.dal;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class GeekAppDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    public static final GeekApp geekApp = new GeekApp();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.id")
    public static final SqlColumn<Integer> id = geekApp.id;

    /**
     * Database Column Remarks:
     *   应用名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.app_name")
    public static final SqlColumn<String> appName = geekApp.appName;

    /**
     * Database Column Remarks:
     *   app秘钥
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.app_key")
    public static final SqlColumn<String> appKey = geekApp.appKey;

    /**
     * Database Column Remarks:
     *   appId
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.app_id")
    public static final SqlColumn<String> appId = geekApp.appId;

    /**
     * Database Column Remarks:
     *   应用说明
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.note")
    public static final SqlColumn<String> note = geekApp.note;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.create_time")
    public static final SqlColumn<Date> createTime = geekApp.createTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.modify_time")
    public static final SqlColumn<Date> modifyTime = geekApp.modifyTime;

    /**
     * Database Column Remarks:
     *   状态
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.status")
    public static final SqlColumn<String> status = geekApp.status;

    /**
     * Database Column Remarks:
     *   删除标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_app.deleted")
    public static final SqlColumn<Integer> deleted = geekApp.deleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_app")
    public static final class GeekApp extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> appName = column("app_name", JDBCType.VARCHAR);

        public final SqlColumn<String> appKey = column("app_key", JDBCType.VARCHAR);

        public final SqlColumn<String> appId = column("app_id", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyTime = column("modify_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Integer> deleted = column("deleted", JDBCType.INTEGER);

        public GeekApp() {
            super("geek_app");
        }
    }
}