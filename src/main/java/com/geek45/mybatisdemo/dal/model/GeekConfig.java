package com.geek45.mybatisdemo.dal.model;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table geek_config
 */
public class GeekConfig implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.id")
    private Integer id;

    /**
     * Database Column Remarks:
     *   配置名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_name")
    private String configName;

    /**
     * Database Column Remarks:
     *   值
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_value")
    private String configValue;

    /**
     * Database Column Remarks:
     *   备注
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.note")
    private String note;

    /**
     * Database Column Remarks:
     *   所属app
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.app_id")
    private Integer appId;

    /**
     * Database Column Remarks:
     *   分组
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.data_id")
    private String dataId;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.create_time")
    private Date createTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.modify_time")
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   状态
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.status")
    private String status;

    /**
     * Database Column Remarks:
     *   环境
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.env")
    private String env;

    /**
     * Database Column Remarks:
     *   删除逻辑字段
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.deleted")
    private Integer deleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_name")
    public String getConfigName() {
        return configName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_name")
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_value")
    public String getConfigValue() {
        return configValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.config_value")
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.note")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.app_id")
    public Integer getAppId() {
        return appId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.app_id")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.data_id")
    public String getDataId() {
        return dataId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.data_id")
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.modify_time")
    public Date getModifyTime() {
        return modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.modify_time")
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.env")
    public String getEnv() {
        return env;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.env")
    public void setEnv(String env) {
        this.env = env;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.deleted")
    public Integer getDeleted() {
        return deleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: geek_config.deleted")
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: geek_config")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", configName=").append(configName);
        sb.append(", configValue=").append(configValue);
        sb.append(", note=").append(note);
        sb.append(", appId=").append(appId);
        sb.append(", dataId=").append(dataId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", status=").append(status);
        sb.append(", env=").append(env);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}