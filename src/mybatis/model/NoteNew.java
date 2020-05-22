package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * generated at 2020-05-22 15:36:35
 */
public class NoteNew {
    /**
     *   自增主键id
     */
    private Long id;

    /**
     *   模板id
     */
    private Long templateId;

    /**
     *   模板编号
     */
    private String templateCode;

    /**
     *   模版名称
     */
    private String templateName;

    /**
     *   商户id
     */
    private Long tenantId;

    /**
     *   使用场景
     */
    private Integer scene;

    /**
     *   业务id
     */
    private Long bizId;

    /**
     *   记事地点
     */
    private String address;

    /**
     *   经度
     */
    private BigDecimal longitude;

    /**
     *   纬度
     */
    private BigDecimal latitude;

    /**
     *   删除标记
     */
    private Integer isDeleted;

    /**
     *   创建人userToken
     */
    private String createUserToken;

    /**
     *   创建时间
     */
    private LocalDateTime createTime;

    /**
     *   更新人usertToken
     */
    private String updateUserToken;

    /**
     *   更新时间
     */
    private LocalDateTime updateTime;

    /**
     *   老记事表ID，老项目记事表ID，按scene类型区分
     */
    private Long oldNoteId;

    /**
     *   创建人ID link库的tb_user表ID，非oauth表的ID
     */
    private Long linkUserId;

    /**
     *   记事内容（json块集合）
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUserToken() {
        return createUserToken;
    }

    public void setCreateUserToken(String createUserToken) {
        this.createUserToken = createUserToken == null ? null : createUserToken.trim();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserToken() {
        return updateUserToken;
    }

    public void setUpdateUserToken(String updateUserToken) {
        this.updateUserToken = updateUserToken == null ? null : updateUserToken.trim();
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOldNoteId() {
        return oldNoteId;
    }

    public void setOldNoteId(Long oldNoteId) {
        this.oldNoteId = oldNoteId;
    }

    public Long getLinkUserId() {
        return linkUserId;
    }

    public void setLinkUserId(Long linkUserId) {
        this.linkUserId = linkUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}