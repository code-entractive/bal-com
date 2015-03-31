/**
 *
 */
package com.balco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author harjeet.s
 *
 */
@Controller

public class LoginController {

	public LoginController() {
		System.out.println("Default constructor of LoginController?????????????????????????????????????????????????????????????");
	}

  @RequestMapping(value="/login")
  public ModelAndView login (){
	  System.out.println("login method of LoginController");
	  return new ModelAndView("loginSuccess");

  }
  @RequestMapping("/balco-ecom-main")
  public ModelAndView loginBalco (){
	  System.out.println("loginBalco method of LoginController");
	  return new ModelAndView("login");

  }

}
