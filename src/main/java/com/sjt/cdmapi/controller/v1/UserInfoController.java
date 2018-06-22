/*
 *  ClassName UserInfoController
 * 
 *  Version   环境搭建-测试用例
 *
 *  Date      20180329
 * 
 *  Copyright notice
 */

package com.sjt.cdmapi.controller.v1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjt.cdmapi.domain.v1.UserInfo;
import com.sjt.cdmapi.service.v1.UserInfoService;


@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@ResponseBody
	@RequestMapping(value = "/getUserInfo", method = { RequestMethod.GET, RequestMethod.POST })
	public  Object getUserInfo(HttpServletRequest request){
		
		String userId = request.getParameter("userId");
		
		UserInfo userInfo = userInfoService.getUserInfo(Integer.valueOf(userId));
		
		Map testMap=new HashMap();
		
		/*		
		testMap.put("num1","valuenumq");
		testMap.put("num2","valuenumq2");
		testMap.put("user", userInfo);*/
		
		return userInfo;
	}
	
}
