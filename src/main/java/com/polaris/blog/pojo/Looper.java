package com.polaris.blog.pojo;

import java.util.Date;

public class Looper {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.id
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.title
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.order
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private Integer order = 0;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.state
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private String state = "1";

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.target_url
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private String targetUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.image_url
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private String imageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.create_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_looper.update_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.id
     *
     * @return the value of tb_looper.id
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.id
     *
     * @param id the value for tb_looper.id
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.title
     *
     * @return the value of tb_looper.title
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.title
     *
     * @param title the value for tb_looper.title
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.order
     *
     * @return the value of tb_looper.order
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.order
     *
     * @param order the value for tb_looper.order
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.state
     *
     * @return the value of tb_looper.state
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.state
     *
     * @param state the value for tb_looper.state
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.target_url
     *
     * @return the value of tb_looper.target_url
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.target_url
     *
     * @param targetUrl the value for tb_looper.target_url
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.image_url
     *
     * @return the value of tb_looper.image_url
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.image_url
     *
     * @param imageUrl the value for tb_looper.image_url
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.create_time
     *
     * @return the value of tb_looper.create_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.create_time
     *
     * @param createTime the value for tb_looper.create_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_looper.update_time
     *
     * @return the value of tb_looper.update_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_looper.update_time
     *
     * @param updateTime the value for tb_looper.update_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}