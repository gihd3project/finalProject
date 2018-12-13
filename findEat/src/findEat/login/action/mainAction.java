package findEat.login.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainAction {
	
	@RequestMapping("login.do")
	public String login() {
		return "/login/login";
	}

}
