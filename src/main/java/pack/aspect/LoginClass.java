package pack.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

@Component
public class LoginClass {
	public boolean loginCheck(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//세션이 있으면 읽고 없으면 x
		HttpSession session = request.getSession();
		
		if(session.getAttribute("name")==null) {
			response.sendRedirect("login");
			return true;
		}else {
			return false;
		}
	}
}
