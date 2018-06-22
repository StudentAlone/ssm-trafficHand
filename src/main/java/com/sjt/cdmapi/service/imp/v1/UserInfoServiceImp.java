package com.sjt.cdmapi.service.imp.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjt.cdmapi.dao.v1.UserInfoServiceDao;
import com.sjt.cdmapi.domain.v1.UserInfo;
import com.sjt.cdmapi.service.v1.UserInfoService;

@Service
public class UserInfoServiceImp implements UserInfoService {
	
	@Autowired
	private UserInfoServiceDao userInfoServiceDao;
	
	@Override
	public UserInfo getUserInfo(int userId) {
		UserInfo userInfoById = userInfoServiceDao.getUserInfoById(userId);
		return userInfoById;
	}

}
