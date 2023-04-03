package com.fastcampus.ch2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/list")
	public String list(HttpServletRequest request) {
		if(!loginCheck(request))
			return "redirect:/login/login?toURL="+request.getRequestURL();  // �α����� �������� �α��� ȭ������ �̵�
		
		return "boardList"; // �α����� �� �����̸�, �Խ��� ȭ������ �̵�
	}
	//한글 되나
	private boolean loginCheck(HttpServletRequest request) {
		// 1. ������ ��
		HttpSession session = request.getSession();
		// 2. ���ǿ� id �ִ��� Ȯ��, ������ true�� ��ȯ
//		if(session.getAttribute("id")!=null)
//			return true;
//		else
//			return false;
		
		return session.getAttribute("id")!=null;
	}
}