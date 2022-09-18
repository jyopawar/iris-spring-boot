package com.jyoti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jyoti.model.User;
import com.jyoti.service.UserService;

@Controller
//@RestController
public class userController {

	@Autowired
	UserService userService;
	
	
	  @RequestMapping(value = "/welcome")
	  public String welcome() {
	  System.out.println("hi");
	  return "welcome";
	  
	  }
	
	  @RequestMapping(value = "/registration") public String register() {
	  System.out.println("hi");
	  return "registration";
	  
	  }
	  
	 
	/*
	 * @GetMapping("/hello") public @ResponseBody String hello() { return
	 * "hello user"; }
	 */
	/*
	 * @RequestMapping("/user-detail") //public ModelAndView userdetail( User user)
	 * { // ModelMap model=new ModelMap(); //
	 * model.addAttribute("Firstname",user.getFirstname()); //
	 * model.addAttribute("Lastname",user.getLastname()); //
	 * model.addAttribute("Mobile",user.getMobile()); // ModelAndView mv=new
	 * ModelAndView("index");
	 * 
	 * mv.addObject("regobj",user); return mv; //System.out.println("details"+
	 * user.getFirstname()); //return "index"; }
	 */
	@GetMapping("/user/{id}")
	public @ResponseBody User getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);

	}

	@PostMapping(path="/user")

	public @ResponseBody User addUser( User user) {
		return userService.addUser(user);

	}

	@DeleteMapping("/delete")
	public @ResponseBody String deleteUser(@RequestParam("id")Long id) {
		return userService.deleteUser(id);

	}

}
