package com.car.mapper.manager;

import com.car.entity.manager.ManagerFunction;

public interface ManagerFunctionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_function
     *
     * @mbggenerated Sun Apr 15 14:34:18 CST 2018
     */
    int deleteByPrimaryKey(Integer funId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_function
     *
     * @mbggenerated Sun Apr 15 14:34:18 CST 2018
     */
    int insert(ManagerFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_function
     *
     * @mbggenerated Sun Apr 15 14:34:18 CST 2018
     */
    int insertSelective(ManagerFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_function
     *
     * @mbggenerated Sun Apr 15 14:34:18 CST 2018
     */
    ManagerFunction selectByPrimaryKey(Integer funId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_function
     *
     * @mbggenerated Sun Apr 15 14:34:18 CST 2018
     */
    int updateByPrimaryKeySelective(ManagerFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_function
     *
     * @mbggenerated Sun Apr 15 14:34:18 CST 2018
     */
    int updateByPrimaryKey(ManagerFunction record);
}