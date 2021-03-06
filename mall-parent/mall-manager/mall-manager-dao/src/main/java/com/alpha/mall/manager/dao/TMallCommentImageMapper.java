package com.alpha.mall.manager.dao;

import com.alpha.mall.manager.pojo.TMallCommentImage;
import com.alpha.mall.manager.pojo.TMallCommentImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallCommentImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int countByExample(TMallCommentImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int deleteByExample(TMallCommentImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int insert(TMallCommentImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int insertSelective(TMallCommentImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    List<TMallCommentImage> selectByExample(TMallCommentImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    TMallCommentImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") TMallCommentImage record, @Param("example") TMallCommentImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByExample(@Param("record") TMallCommentImage record, @Param("example") TMallCommentImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByPrimaryKeySelective(TMallCommentImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_comment_image
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByPrimaryKey(TMallCommentImage record);
}