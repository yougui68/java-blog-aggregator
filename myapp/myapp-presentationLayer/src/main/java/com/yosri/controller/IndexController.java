/**
 * 
 */
package com.yosri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Line
 *
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	private String index() {
		return "index";
	}
}
