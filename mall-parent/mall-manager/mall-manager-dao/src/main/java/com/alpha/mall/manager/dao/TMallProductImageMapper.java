package com.alpha.mall.manager.dao;


import com.alpha.mall.manager.pojo.TMallProductImage;
import com.alpha.mall.manager.pojo.TMallProductImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallProductImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int countByExample(TMallProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int deleteByExample(TMallProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int insert(TMallProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int insertSelective(TMallProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    List<TMallProductImage> selectByExample(TMallProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    TMallProductImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") TMallProductImage record, @Param("example") TMallProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int updateByExample(@Param("record") TMallProductImage record, @Param("example") TMallProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int updateByPrimaryKeySelective(TMallProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_product_image
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int updateByPrimaryKey(TMallProductImage record);
}