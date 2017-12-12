package jdte.friendmatch.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	/**
	 * ��¼����
	 * @return
	 */
	@RequestMapping(value = {"/", "login"})
	public String login() {
		return "login";
	}
	
}
