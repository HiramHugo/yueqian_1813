package org.yueqian.com.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo1_request")//虚拟路径
public class Demo1_request  extends HttpServlet {

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//请求方式
		String method=request.getMethod();
		//获取资源
		String uri=request.getRequestURI().toString();
		//获取协议版本
		String protocol=request.getProtocol();
		System.out.println("请求方式："+method+" 请求的资源："+uri+" 协议版本："+protocol);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
