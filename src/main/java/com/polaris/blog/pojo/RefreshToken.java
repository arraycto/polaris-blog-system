package com.polaris.blog.pojo;

import java.util.Date;

public class RefreshToken {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.id
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.refresh_token
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private String refreshToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.user_id
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.token_key
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private String tokenKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.mobile_token_key
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private String mobileTokenKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.create_time
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_refresh_token.update_time
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.id
     *
     * @return the value of tb_refresh_token.id
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.id
     *
     * @param id the value for tb_refresh_token.id
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.refresh_token
     *
     * @return the value of tb_refresh_token.refresh_token
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.refresh_token
     *
     * @param refreshToken the value for tb_refresh_token.refresh_token
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.user_id
     *
     * @return the value of tb_refresh_token.user_id
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.user_id
     *
     * @param userId the value for tb_refresh_token.user_id
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.token_key
     *
     * @return the value of tb_refresh_token.token_key
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public String getTokenKey() {
        return tokenKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.token_key
     *
     * @param tokenKey the value for tb_refresh_token.token_key
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey == null ? null : tokenKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.mobile_token_key
     *
     * @return the value of tb_refresh_token.mobile_token_key
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public String getMobileTokenKey() {
        return mobileTokenKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.mobile_token_key
     *
     * @param mobileTokenKey the value for tb_refresh_token.mobile_token_key
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setMobileTokenKey(String mobileTokenKey) {
        this.mobileTokenKey = mobileTokenKey == null ? null : mobileTokenKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.create_time
     *
     * @return the value of tb_refresh_token.create_time
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.create_time
     *
     * @param createTime the value for tb_refresh_token.create_time
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_refresh_token.update_time
     *
     * @return the value of tb_refresh_token.update_time
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_refresh_token.update_time
     *
     * @param updateTime the value for tb_refresh_token.update_time
     *
     * @mbg.generated Mon Oct 12 11:43:31 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}