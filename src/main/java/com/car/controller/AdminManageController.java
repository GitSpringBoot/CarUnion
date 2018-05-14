package com.car.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.car.entity.manager.ManageUser;
import com.car.entity.manager.ManagerRole;
import com.car.service.AdminManageRoleService;
import com.car.service.AdminManageService;
import com.car.utils.FilesUtils;
import com.car.utils.MD5Util;

@Controller
@RequestMapping("/adminManage/")
public class AdminManageController {

	@Autowired
	private AdminManageService adminManageService;
	@Autowired
	private AdminManageRoleService adminManageRoleService;
	
	
	@RequestMapping("findManageUserList")
	public String findManageUserList(HttpServletRequest request){
		List<ManageUser> manageUserList = adminManageService.findManageUserList();
		request.setAttribute("manageUserList", manageUserList);
		return "admin/manager/manageUser_list";
	}
	
	@RequestMapping("toManageInsert")
	public String toManageInsert(HttpServletRequest request){
		List<ManagerRole> mRoleList = adminManageRoleService.findManageRoleList();
		request.setAttribute("mRoleList",mRoleList);
		return "admin/manager/manageUser_insert";
		
	}
	@RequestMapping("insertManageUser")
	public String insertManageUser(ManageUser mUser,MultipartFile file,HttpServletRequest request){
		System.out.println("==========="+file);
		
		String filePath = FilesUtils.FilesUpload_xm(request, file, "/upload");
		String pwd=MD5Util.MD5(mUser.getLoginPwd());
		mUser.setLoginPwd(pwd);
		mUser.setManageImg(filePath);
		System.out.println("==========="+filePath);
		adminManageService.insertManageUser(mUser);
		// 自定义父页面跳转URL
		String redirectUrl = "adminManage/findManageUserList";
		request.setAttribute("redirectUrl", redirectUrl);	
		return "admin/closeLayer";
	}
	
	/*
	 * 韩涛
	 * 跳转员工修改页面
	 */
	
	@RequestMapping("toManageUserUpdate")
	public String toManageUserUpdate(Integer manageId, HttpServletRequest request){
		ManageUser mUser = adminManageService.getManageUserByUserId(manageId);
		
		request.setAttribute("mUser", mUser);
		return "admin/manager/manageUser_update";
	}

	/*
	 * ht
	 * 用户修改
	 */

	@RequestMapping("updateManageUser")
	public String updateManageUser(MultipartFile file,ManageUser mUser, HttpServletRequest reqeust){

		if(!"".equals(file.getOriginalFilename())){
			String filePath = FilesUtils.FilesUpload_xm(reqeust, file, "/upload");
			mUser.setManageImg(filePath);
		}
		String pwd=MD5Util.MD5(mUser.getLoginPwd());
		mUser.setLoginPwd(pwd);
		adminManageService.updateManageUser(mUser);
		
		// 自定义父页面跳转URL
		String redirectUrl = "adminManage/findManageUserList";
		reqeust.setAttribute("redirectUrl", redirectUrl);	
		return "admin/closeLayer";
	}
	
	@RequestMapping("updateManageUser2")
	public String updateManageUser2(MultipartFile file,ManageUser mUser, HttpServletRequest reqeust){

		if(!"".equals(file.getOriginalFilename())){
			String filePath = FilesUtils.FilesUpload_xm(reqeust, file, "/upload");
			mUser.setManageImg(filePath);
		}
		String pwd=MD5Util.MD5(mUser.getLoginPwd());
		mUser.setLoginPwd(pwd);
		adminManageService.updateManageUser(mUser);
		
		// 自定义父页面跳转URL
		String redirectUrl = "admin/toLogin";
		reqeust.setAttribute("redirectUrl", redirectUrl);	
		return "admin/closeLayer";
	}
	
	
	@RequestMapping("deleteManageUser")
	@ResponseBody
	public int deleteManageUser(Integer manageId){
		int result = adminManageService.deleteManageUser(manageId);
		return result;
	}
	@ResponseBody
	@RequestMapping("LoginPwdInit")
	public Integer LoginPwdInit(String ids){
		Integer result = adminManageService.LoginPwdInit(ids);
		return result;
	}
   @RequestMapping("toappointManageRole")
   public String toappointManageRole(HttpServletRequest request,String ids){
	   List<ManagerRole> mrList = adminManageRoleService.findManageRoleList();
	   request.setAttribute("ids",ids);
	   request.setAttribute("mrList",mrList);
	   return "admin/manager/manageUser_appoint";
   }
   @ResponseBody
   @RequestMapping("appointManageRole")
   public Integer appointManageRole(HttpServletRequest request,Integer manageId,String roleIds){
	   Integer result =adminManageService.appointManageRole(manageId,roleIds);
      return result;
   }
   @ResponseBody
   @RequestMapping("stopManageUser")
   public int stopManageUser(Integer manageId){
	   int result = adminManageService.stopManageUser(manageId);
	   return result;
   }
   @ResponseBody
   @RequestMapping("enableManageUser")
   public int enableManageUser(String ids){
	   int result = adminManageService.enableManageUser(ids);
	   return result;
   }
}
