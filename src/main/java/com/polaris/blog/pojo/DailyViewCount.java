package com.polaris.blog.pojo;

import java.util.Date;

public class DailyViewCount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_daily_view_count.id
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_daily_view_count.view_count
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_daily_view_count.create_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_daily_view_count.update_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_daily_view_count.id
     *
     * @return the value of tb_daily_view_count.id
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_daily_view_count.id
     *
     * @param id the value for tb_daily_view_count.id
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_daily_view_count.view_count
     *
     * @return the value of tb_daily_view_count.view_count
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_daily_view_count.view_count
     *
     * @param viewCount the value for tb_daily_view_count.view_count
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_daily_view_count.create_time
     *
     * @return the value of tb_daily_view_count.create_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_daily_view_count.create_time
     *
     * @param createTime the value for tb_daily_view_count.create_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_daily_view_count.update_time
     *
     * @return the value of tb_daily_view_count.update_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_daily_view_count.update_time
     *
     * @param updateTime the value for tb_daily_view_count.update_time
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}