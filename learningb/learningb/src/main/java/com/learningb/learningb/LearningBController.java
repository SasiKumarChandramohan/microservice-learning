package com.learningb.learningb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learningb")
public class LearningBController {

	@RequestMapping("/testb")
	public String learningbMethod(){
		return "From learning B project";
	}
}
