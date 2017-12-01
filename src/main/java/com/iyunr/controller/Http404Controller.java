package com.iyunr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iyunr.resultJson.ResultJson;

/**
 * 
    * @ClassName: Http404Controller  
    * @Description: TODO 因为404错误是不经过controller的，所以无法通过上述办法处理。但是 SpringBoot 默认提供了一个全局的 handler 来处理所有的 HTTP 错误, 并把它映射为 /error。当发生一个 HTTP 错误, 例如 404 错误时, SpringBoot 内部的机制会将页面重定向到 /error 中。
所以我们只要实现一个 /error 映射的 Controller 即可来处理它即可
    * @author Administrator  
    * @date 2017年10月30日  
    *
 */
@Controller
public class Http404Controller implements ErrorController{
	private static final String ERROR_PATH = "/error";
	
	/**
	 * 
	 * @Title: errorHtml  
	 * @Description: TODO Supports the HTML Error View
	 * @param @param request
	 * @param @return    参数  
	 * @return String    返回类型  
	 * @throws
	 */
	@RequestMapping(value=ERROR_PATH, produces="text/html")
	public String errorHtml(HttpServletRequest request){
		return "404";
	}
	
	/**
	 * @Title: error  
	 * @Description: TODO Supports other formats like JSON, XML
	 * @param @param request
	 * @param @return    参数  
	 * @return ResultJson    返回类型  
	 * @throws
	 */
	@RequestMapping(value="ERROR_PATH")
	@ResponseBody
	public ResultJson error(HttpServletRequest request){
		return new ResultJson().failure("404 error");
	}
	
	/**
	 * Returns the path of the error page.
	 */
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error/error.html";
	}
	
	
}
