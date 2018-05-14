package com.car.entity.car;

public class CarBrandModel {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column car_brand_model_rel.car_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	private Integer carId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column car_brand_model_rel.brand_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	private Integer brandId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column car_brand_model_rel.model_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	private Integer modelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column car_brand_model_rel.producer_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	private Integer producerId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column car_brand_model_rel.car_id
	 * @return  the value of car_brand_model_rel.car_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public Integer getCarId() {
		return carId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column car_brand_model_rel.car_id
	 * @param carId  the value for car_brand_model_rel.car_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column car_brand_model_rel.brand_id
	 * @return  the value of car_brand_model_rel.brand_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public Integer getBrandId() {
		return brandId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column car_brand_model_rel.brand_id
	 * @param brandId  the value for car_brand_model_rel.brand_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column car_brand_model_rel.model_id
	 * @return  the value of car_brand_model_rel.model_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public Integer getModelId() {
		return modelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column car_brand_model_rel.model_id
	 * @param modelId  the value for car_brand_model_rel.model_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column car_brand_model_rel.producer_id
	 * @return  the value of car_brand_model_rel.producer_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public Integer getProducerId() {
		return producerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column car_brand_model_rel.producer_id
	 * @param producerId  the value for car_brand_model_rel.producer_id
	 * @mbggenerated  Wed Apr 18 08:28:40 CST 2018
	 */
	public void setProducerId(Integer producerId) {
		this.producerId = producerId;
	}
	private String carName;
	private String brandName;
	private String proName;
    private String modelName;
    
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}
	
}