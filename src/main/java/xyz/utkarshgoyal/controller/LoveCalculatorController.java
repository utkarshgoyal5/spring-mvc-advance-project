package xyz.utkarshgoyal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import xyz.utkarshgoyal.dto.Communication;
import xyz.utkarshgoyal.dto.Phone;
import xyz.utkarshgoyal.dto.UserInfoDto;
import xyz.utkarshgoyal.dto.UserRegisterDto;

@Controller
public class LoveCalculatorController {
	
//	@RequestMapping("/")
//	public String showHomePage() {
//		return "home-page";
//	}
	
//	@RequestMapping("/")
//	public String showHomePage(Model model) {
//		UserInfoDto userInfoDto = new UserInfoDto();
//		model.addAttribute("userInfo", userInfoDto);
//		return "home-page";
//	}
	
	//using @ModelAttribute to make code short
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDto  userInfoDto) {

		return "home-page";
	}
	
//	@RequestMapping("/process-homepage")
//	public String showResultPage(@RequestParam("userName") String userName, @RequestParam("crushName") String crushName, Model model) {
//		model.addAttribute("userName", userName);
//		model.addAttribute("crushName", crushName);
//		
//		return "result-page";
//	}
	
//	@RequestMapping("/process-homepage")
//	public String showResultPage(UserInfoDto userInfiDto, Model model) {
//		model.addAttribute("userInfo", userInfiDto);
//		
//		return "result-page";
//	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDto  userInfoDto, BindingResult result) {
		
		if(result.hasErrors()) {
			return "home-page";
		}
		
		return "result-page";
	}
	
	@RequestMapping("/register-user")
	public String showRegistrationPage(@ModelAttribute("userRegister") UserRegisterDto userRegisterDto) {
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setNumber("2233445566");
		Communication communication = new Communication();
		userRegisterDto.setCommunication(communication);
		userRegisterDto.getCommunication().setPhone(phone);
		
		return "registration-page";
	}
	
	@RequestMapping("/process-user-registration")
	public String showResultPage(@Valid @ModelAttribute("userRegister") UserRegisterDto userRegisterDto, BindingResult result ) {
		
		System.out.println(userRegisterDto);
		if(result.hasErrors()) {
			return "registration-page";
		}
		return "registration-result-page";
	}

}
