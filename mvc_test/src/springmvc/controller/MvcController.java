package springmvc.controller;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.Person;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	/**自动匹配参数*/
	//match automatically 
	@RequestMapping("/person")
	public String toPerson(String name, double age) {
		System.out.println(name + " " + age);
		return "hello";
	}

	/**自动装箱*/
	//boxing automatically 
	@RequestMapping("/person1")
	public String toPerson(Person p) {
		System.out.println(p.getName() + " " + p.getAge());
		return "hello";
	}

	/**使用InitBinder来处理Date类型的参数*/
	//the parameter was converted in initBinder 
	@RequestMapping("/date")
	public String date(Date date) {
		System.out.println(date);
		return "hello";
	}

	//At the time of initialization,convert the type "String" to type "date"
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	/**向前台传递参数*/
	//pass the parameters to front-end 
	@RequestMapping("/show")
	public String showPerson(Map<String, Object> map) {
		Person p = new Person();
		map.put("p", p);
		p.setAge(20);
		p.setName("jayjay");
		return "show";
	}

	/**使用Ajax调用*/
	//pass the parameters to front-end using ajax 
	@RequestMapping("/getPerson")
	public void getPerson(String name, PrintWriter pw) {
		pw.write("hello," + name);
	}

	@RequestMapping("/name")
	public String sayHello() {
		return "name";
	}
	/*前台用下面的Jquery代码调用
	$(function(){
	    $("#btn").click(function(){
	       $.post("mvc/getPerson",{name:$("#name").val()},function(data){
	            alert(data);
	        });
	    });
	});
	*/

	/**在Controller中使用redirect方式处理请求*/
	//redirect 
	@RequestMapping("/redirect")
	public String redirect() {
		return "redirect:hello";
	}

	/**文件上传:需要导入两个jar包:commons-fileupload.jar commons-io.jar*/
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(HttpServletRequest req) throws Exception {
		MultipartHttpServletRequest mreq = (MultipartHttpServletRequest) req;
		MultipartFile file = mreq.getFile("file");
		String fileName = file.getOriginalFilename();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		FileOutputStream fos = new FileOutputStream(req.getSession().getServletContext().getRealPath("/") + "upload/"
				+ sdf.format(new Date()) + fileName.substring(fileName.lastIndexOf('.')));
		fos.write(file.getBytes());
		fos.flush();
		fos.close();

		return "hello";
	}

	/**处理局部异常*/
	@ExceptionHandler
	public ModelAndView exceptionHandler(Exception ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		System.out.println("in testExceptionHandler");
		return mv;
	}

	@RequestMapping("/error")
	public String error() {
		int i = 5 / 0;
		return "hello";
	}
}
