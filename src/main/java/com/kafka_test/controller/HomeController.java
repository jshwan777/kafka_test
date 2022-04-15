package com.kafka_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kafka_test.dto.MemberDto;
import com.kafka_test.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
    private MemberService memberService;
	
	@RequestMapping(value="/main")
	public ModelAndView getMain() {
		
		ModelAndView mv = new ModelAndView();

		List<MemberDto> memberList = memberService.getMemberList();
		
		mv.addObject("memberList", memberList);
		mv.setViewName("home/main");
		
		return mv;
	}
}
