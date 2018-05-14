package com.car.mapper.manager;

import java.util.List;

import com.car.entity.manager.Push;
import com.car.entity.user.User;

public interface PushMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table push
     *
     * @mbggenerated Sun Apr 15 14:36:49 CST 2018
     */
    int deleteByPrimaryKey(Integer pushId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table push
     *
     * @mbggenerated Sun Apr 15 14:36:49 CST 2018
     */
    int insert(Push record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table push
     *
     * @mbggenerated Sun Apr 15 14:36:49 CST 2018
     */
    int insertSelective(Push record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table push
     *
     * @mbggenerated Sun Apr 15 14:36:49 CST 2018
     */
    Push selectByPrimaryKey(Integer pushId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table push
     *
     * @mbggenerated Sun Apr 15 14:36:49 CST 2018
     */
    int updateByPrimaryKeySelective(Push record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table push
     *
     * @mbggenerated Sun Apr 15 14:36:49 CST 2018
     */
    int updateByPrimaryKey(Push record);

	List<Push> toPushList();

	void insertNewPush(Push push);
	
	List<Push> selectPuthTb(User user);
}