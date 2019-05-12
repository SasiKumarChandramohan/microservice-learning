/**
 * 
 */
package com.bootlearning.learninga;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sasik
 *
 */
@RestController
@RequestMapping("/learninga")
public class LearningAController {

	@RequestMapping("testa")
	public String learning() {
		System.out.println("into learninga method ");
		return "Success from learning a project";
	}
}
