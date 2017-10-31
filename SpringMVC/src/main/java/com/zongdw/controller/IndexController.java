/**
 * 
 */
package com.zongdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author david.zong
 *
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
