package com.polaris.blog.dao;

import com.polaris.blog.pojo.Looper;
import java.util.List;

public interface LooperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_looper
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_looper
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    int insert(Looper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_looper
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    Looper selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_looper
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    List<Looper> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_looper
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    int updateByPrimaryKey(Looper record);

    List<Looper> selectAllByStatus();
}