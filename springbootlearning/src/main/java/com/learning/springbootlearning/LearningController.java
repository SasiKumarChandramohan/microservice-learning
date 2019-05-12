/**
 * 
 */
package com.learning.springbootlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author sasik
 *
 */
@RestController
@RequestMapping("/learning")
public class LearningController {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping("test")
	public String learning() {
		System.out.println("into learning method ");
		
			String responseFromLearninga = template.getForObject("http://learninga-service/learninga/testa", String.class);
			
			String responseFromLearningb = template.getForObject("http://learningb-service/learningb/testb", String.class);
			return responseFromLearninga + " " + responseFromLearningb;
		
		/*RestTemplate tenplate = new RestTemplate();
		System.out.println("into learning method ");
		for(int i=0 ; i<2;i++) {
			String response = tenplate.getForObject("http://localhost:8084/learninga/testa", String.class);
			System.out.println(response);
		}
		return "Success";*/
	}
}
