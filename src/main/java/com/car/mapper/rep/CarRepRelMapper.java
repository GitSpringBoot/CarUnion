package com.car.mapper.rep;

import java.util.List;

import com.car.entity.rep.CarRepRel;
import com.car.entity.rep.CarRepositoryRel;

public interface CarRepRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_rep_rel
     *
     * @mbggenerated Wed Apr 25 20:46:38 CST 2018
     */
    int deleteByPrimaryKey(Integer traId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_rep_rel
     *
     * @mbggenerated Wed Apr 25 20:46:38 CST 2018
     */
    int insert(CarRepRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_rep_rel
     *
     * @mbggenerated Wed Apr 25 20:46:38 CST 2018
     */
    int insertSelective(CarRepRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_rep_rel
     *
     * @mbggenerated Wed Apr 25 20:46:38 CST 2018
     */
    CarRepRel selectByPrimaryKey(Integer traId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_rep_rel
     *
     * @mbggenerated Wed Apr 25 20:46:38 CST 2018
     */
    int updateByPrimaryKeySelective(CarRepRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_rep_rel
     *
     * @mbggenerated Wed Apr 25 20:46:38 CST 2018
     */
    int updateByPrimaryKey(CarRepRel record);

	CarRepRel findcarRepRel(CarRepositoryRel carRep);

	void insertCarRepRel(CarRepositoryRel carRep);

	void updateCarNum(CarRepRel carRepRel);

	List<CarRepRel> findCarRepRelList(Integer repId);

	
}