/**
 * 
 */
package com.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author david.zong
 *
 */
public class MainController {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "hello world";
	}
}
