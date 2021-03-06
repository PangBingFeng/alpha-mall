package com.alpha.mall.manager.dao;

import com.alpha.mall.manager.pojo.TMallValue;
import com.alpha.mall.manager.pojo.TMallValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int countByExample(TMallValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int deleteByExample(TMallValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int insert(TMallValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int insertSelective(TMallValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    List<TMallValue> selectByExample(TMallValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    TMallValue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") TMallValue record, @Param("example") TMallValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByExample(@Param("record") TMallValue record, @Param("example") TMallValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByPrimaryKeySelective(TMallValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_value
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByPrimaryKey(TMallValue record);
}