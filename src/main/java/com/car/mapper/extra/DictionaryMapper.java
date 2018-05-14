package com.car.mapper.extra;

import java.util.List;

import com.car.entity.extra.Dictionary;

public interface DictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_dictionary
     *
     * @mbggenerated Sun Apr 15 14:43:07 CST 2018
     */
    int deleteByPrimaryKey(Integer dicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_dictionary
     *
     * @mbggenerated Sun Apr 15 14:43:07 CST 2018
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_dictionary
     *
     * @mbggenerated Sun Apr 15 14:43:07 CST 2018
     */
    int insertSelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_dictionary
     *
     * @mbggenerated Sun Apr 15 14:43:07 CST 2018
     */
    Dictionary selectByPrimaryKey(Integer dicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_dictionary
     *
     * @mbggenerated Sun Apr 15 14:43:07 CST 2018
     */
    int updateByPrimaryKeySelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_dictionary
     *
     * @mbggenerated Sun Apr 15 14:43:07 CST 2018
     */
    int updateByPrimaryKey(Dictionary record);
    
    
    List<Dictionary> getDictionaryList();
    
}