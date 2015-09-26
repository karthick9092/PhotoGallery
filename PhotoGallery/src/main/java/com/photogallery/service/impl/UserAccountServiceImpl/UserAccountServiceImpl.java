package com.photogallery.service.impl.UserAccountServiceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.photogallery.entity.UserAccount;
import com.photogallery.model.UserAccountModel;
import com.photogallery.repo.UserAccountRepository;
import com.photogallery.service.UserAccountService.UserAccountService;

@Service
@Transactional
public class UserAccountServiceImpl implements UserAccountService {
	
	@Autowired
	UserAccountRepository userAccountRepository; 

	@Override
	public void saveUserAccount(UserAccountModel userAccountModel) {
		// TODO Auto-generated method stub
		try {
			UserAccount userAccount = new UserAccount();
			BeanUtils.copyProperties(userAccountModel, userAccount);
			userAccountRepository.saveAndFlush(userAccount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
