/**
 * 
 */
package com.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author david.zong
 *
 */
@RestController
@EnableAutoConfiguration
public class BootTestApplication {
	@RequestMapping("/aa")
	String home() {
		return "hello world aa";
	}
	@RequestMapping("/bb")
	String com() {
		return "hello world bb";
	}
	@RequestMapping("/")
	String index() {
		return "hello world index";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(BootTestApplication.class, args);
	}

}
