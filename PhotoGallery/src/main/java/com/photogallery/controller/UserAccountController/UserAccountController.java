package com.photogallery.controller.UserAccountController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.photogallery.model.UserAccountModel;
import com.photogallery.service.UserAccountService.UserAccountService;

@Controller
public class UserAccountController {
	
	@Autowired
	UserAccountService userAccountService;

	@RequestMapping(value = "/useraccount", method = RequestMethod.POST)
	public void saveUserAccount (UserAccountModel userAccountModel) {
		try {
			userAccountService.saveUserAccount(userAccountModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
