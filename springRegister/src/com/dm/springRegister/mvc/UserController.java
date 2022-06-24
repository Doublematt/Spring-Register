package com.dm.springRegister.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
	/*
	 * method used in validation
	 * it checks every field
	 * cuts spaces and form values without spaces to validate
	 */
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	//method for visualization register form
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("user", new User());
		
		//returns the name of the file to show
		return "register-form";
	}
	
	//method for visualization confirmation form
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("user") User user,
			BindingResult theBindingResult) {
		
		//check if there are no errors in the register form
		if(theBindingResult.hasErrors()) {
			
			//returning register form if errors
			return "register-form";
		}
		
		//returns the name of the file to show
		return "register-confirmation";
	}

}
