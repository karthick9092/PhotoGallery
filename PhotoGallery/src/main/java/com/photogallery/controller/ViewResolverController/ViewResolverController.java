package com.photogallery.controller.ViewResolverController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewResolverController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectToLogin() {
		return "redirect:/home.html";
	}
}
