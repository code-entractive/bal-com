/**
 *
 */
package com.balco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.balco.bean.User;


/**
 * @author harjeet.s
 *
 */
@Controller


public class LoginController {

	public LoginController() {
		System.out.println("Default constructor of LoginController");
	}

  @RequestMapping(value="/")
  public ModelAndView login (ModelMap model ){
	  System.out.println("login method of LoginController");
	  
	  model.addAttribute("user",new User());
	  return new ModelAndView("loginPage");

  }
  
  @RequestMapping("/loginAction")
  public ModelAndView loginAction (@ModelAttribute("user")User user ,BindingResult result    ){
	  System.out.println("loginAction method of LoginController");
	  return new ModelAndView("loginSuccess");

  }

}
