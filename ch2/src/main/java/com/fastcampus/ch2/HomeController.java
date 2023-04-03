package com.fastcampus.ch2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // 1. ���� ȣ�� ������ ���α׷����� ���
public class HomeController {
	// 2. URL�� �޼��� ����(����, mapping)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
}