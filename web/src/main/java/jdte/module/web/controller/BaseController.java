package jdte.module.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	/**
	 * µÇÂ¼ÇëÇó
	 * @return
	 */
	@RequestMapping(value = {"/", "login"})
	public String login() {
		return "login";
	}
	
}
