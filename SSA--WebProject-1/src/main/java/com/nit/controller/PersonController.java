package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.entity.PersonEntity;
import com.nit.model.PersonModel;
import com.nit.service.SSARegistrationService;

@Controller
public class PersonController {

	@Autowired
	private SSARegistrationService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String lunchFormPage(Model model) {
		PersonModel pmodel = new PersonModel();
		model.addAttribute("pmodel", pmodel);

		List<String> allStates = service.getAllStates();
		model.addAttribute("allstates", allStates);

		return "Person_Details";
	}

	@RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
	public String handleSubmitButton(@ModelAttribute("pmodel") PersonModel pmodel,RedirectAttributes attributes) {
	 PersonEntity save = service.savePersonDetails(pmodel);
	if(save!=null)
		attributes.addFlashAttribute("smsg", "Registration Successfull Your SSA Number Is " + save.getSsNumber());
	else
		attributes.addFlashAttribute("emsg", "Registration Faield ");
	return "redirect:/";
	}

}
