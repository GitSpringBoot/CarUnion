package com.car.mapper.rep;

import java.util.List;

import com.car.entity.rep.RepDistrict;

public interface RepDistrictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_district
     *
     * @mbggenerated Sun Apr 15 14:32:07 CST 2018
     */
    int deleteByPrimaryKey(Integer disId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_district
     *
     * @mbggenerated Sun Apr 15 14:32:07 CST 2018
     */
    int insert(RepDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_district
     *
     * @mbggenerated Sun Apr 15 14:32:07 CST 2018
     */
    int insertSelective(RepDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_district
     *
     * @mbggenerated Sun Apr 15 14:32:07 CST 2018
     */
    RepDistrict selectByPrimaryKey(Integer disId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_district
     *
     * @mbggenerated Sun Apr 15 14:32:07 CST 2018
     */
    int updateByPrimaryKeySelective(RepDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_district
     *
     * @mbggenerated Sun Apr 15 14:32:07 CST 2018
     */
    int updateByPrimaryKey(RepDistrict record);

	List<RepDistrict> findDistrictList();
}