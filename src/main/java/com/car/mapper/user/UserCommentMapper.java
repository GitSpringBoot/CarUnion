package com.car.mapper.user;

import java.util.List;

import com.car.entity.user.User;
import com.car.entity.user.UserComment;

public interface UserCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Sun Apr 15 14:37:56 CST 2018
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Sun Apr 15 14:37:56 CST 2018
     */
    int insert(UserComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Sun Apr 15 14:37:56 CST 2018
     */
    int insertSelective(UserComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Sun Apr 15 14:37:56 CST 2018
     */
    UserComment selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Sun Apr 15 14:37:56 CST 2018
     */
    int updateByPrimaryKeySelective(UserComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Sun Apr 15 14:37:56 CST 2018
     */
    int updateByPrimaryKey(UserComment record);

	List<UserComment> selectUserComment(User user);

	/**
	 * @param parseInt
	 * @return
	 */
	List<UserComment> findCarComment(int carId);
}