package com.car.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.entity.user.OrderForm;
import com.car.entity.user.UserApply;
import com.car.service.AdminOrderFormService;

@Controller
@RequestMapping("adminOrderForm")
public class AdminOrderFormController {

	@Autowired
	private AdminOrderFormService orderService;
	/**
	 * 查询订单
	 * @param request
	 * @return
	 */
	@RequestMapping("toOrderForm")
	public String toOrderForm(HttpServletRequest request) {
		List<OrderForm> orderForm = orderService.getOrderFormList();
		request.setAttribute("orderForm", orderForm);
		return "admin/user/admin_orderfrom";
	}
	/**
	 * 删除订单
	 * @param orderId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("deleteOrderForm")
	public String delete(String orderId) {
		int i = orderService.deleteByPrimaryKey(orderId);
		return "i";
	}
	

	/**
	 * 支付
	 * @param orderId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("zhifu")
	public String updateZF(String orderId){
		OrderForm order = orderService.selectByPrimaryKey(orderId);
		if(order.getOrderStatus() == 1) {
			return "2";
		} else {
			orderService.updateZF(order);
		}
		return "2";
	}
	
	/**
	 * 试驾
	 * @param orderId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("shijia")
	public String updateSJ(String orderId){
		OrderForm order = orderService.selectByPrimaryKey(orderId);
		if(order.getOrderStatus() == 2) {
			return "1";
		} else {
			orderService.updateSJ(order);
		}
		return "1";
	}
	
	
}
