package model;

import java.time.LocalDateTime;

/**
 * generated at 2020-05-22 15:36:35
 */
public class AlarmRule {
    /**
     *   主键id
     */
    private Long id;

    /**
     *   商户id
     */
    private Long tenantId;

    /**
     *   警报类型：1-合作前项目x天未记事提醒 2-合作中项目x天未记事提醒
     */
    private Integer alarmType;

    /**
     *   警报值
     */
    private Integer alarmValue;

    /**
     *   是否删除：0-否 1-是
     */
    private Integer isDeleted;

    /**
     *   创建时间
     */
    private LocalDateTime createTime;

    /**
     *   系统时间
     */
    private LocalDateTime sysTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(Integer alarmValue) {
        this.alarmValue = alarmValue;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getSysTime() {
        return sysTime;
    }

    public void setSysTime(LocalDateTime sysTime) {
        this.sysTime = sysTime;
    }
}