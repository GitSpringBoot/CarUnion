package com.car.mapper.car;

import com.car.entity.car.CarImgRel;

public interface CarImgRelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table car_img_rel
	 * @mbggenerated  Fri Apr 20 13:44:02 CST 2018
	 */
	int insert(CarImgRel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table car_img_rel
	 * @mbggenerated  Fri Apr 20 13:44:02 CST 2018
	 */
	int insertSelective(CarImgRel record);

	void deleteByImgId(Integer imgId);
}