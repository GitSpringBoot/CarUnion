package com.car.mapper.manager;

import java.util.List;
import java.util.Map;

import com.car.entity.manager.UserRole;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_user_role
     *
     * @mbggenerated Sun Apr 15 14:36:36 CST 2018
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_user_role
     *
     * @mbggenerated Sun Apr 15 14:36:36 CST 2018
     */
    int insertSelective(UserRole record);

	void deleteByManageId(Integer manageId);

	List<UserRole> findRoleByManageId(Integer manageId);

	void deleteByRoleId(Integer roleId);


}