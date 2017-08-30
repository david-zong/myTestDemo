/**   
 * Project Name: mvc_test <br>
 * File Name: JsonController.java <br>
 * Package Name: springmvc.controller <br>  
 * Description: 文件的功能说明  <br>
 * Date 2016年12月13日 下午5:19:23 <br>
 * @author: david.zong <br>
 * @version：版本号 
 * Copyright (c) 2010-2015 99Bill Corporation. All rights reserved.   
 */
package springmvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.model.User;

/** 
 * Type Name: JsonController <br> 
 * Description: TODO <br>
 * Date: 2016年12月13日 下午5:19:23 <br> 
 * @author author
 * @since JDK 1.6
 */
@Controller
@RequestMapping("/json")
public class JsonController {
	@ResponseBody
	@RequestMapping("/user")
	public User get(){
		User u = new User();
		u.setId(1);
		u.setName("jayjay");
		u.setBirth(new Date());
		return u;
	}
}
