package com.alpha.mall.manager.dao;


import com.alpha.mall.manager.pojo.TMallAct;
import com.alpha.mall.manager.pojo.TMallActExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallActMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int countByExample(TMallActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int deleteByExample(TMallActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int insert(TMallAct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int insertSelective(TMallAct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    List<TMallAct> selectByExample(TMallActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") TMallAct record, @Param("example") TMallActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_act
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    int updateByExample(@Param("record") TMallAct record, @Param("example") TMallActExample example);
}