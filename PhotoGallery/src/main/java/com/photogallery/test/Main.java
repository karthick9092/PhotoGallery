package com.photogallery.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.photogallery.model.UserAccountModel;

public class Main {

	public static void main (String args []) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			UserAccountModel userAccountModel = new UserAccountModel();
			String json = mapper.writeValueAsString(userAccountModel);
			System.out.println("User Account Json >>>>>" + json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
