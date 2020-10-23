package com.polaris.blog.dao;

import com.polaris.blog.pojo.Comment;
import java.util.List;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    Comment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    List<Comment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_comment
     *
     * @mbg.generated Sun Oct 04 17:25:41 CST 2020
     */
    int updateByPrimaryKey(Comment record);

    List<Comment> selectAllByArticleId(String articleId);

    int deleteAllByArticleId(String articleId);

    int updateStateOfAllCommentByArticleId(String articleId);
}