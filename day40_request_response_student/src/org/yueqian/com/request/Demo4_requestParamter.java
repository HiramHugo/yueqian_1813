package org.yueqian.com.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo4_requestParamter")
public class Demo4_requestParamter extends HttpServlet{


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		byte[] buf=userName.getBytes("iso8859-1");
		//使用utf-8码表对字节码进行编码
		userName=new String (buf,"utf-8");
		System.out.println("get方式用户名："+userName);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//根据请求参数名字获取请求参数值
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println("post方式用户名："+userName+" 密码："+password);
	}

}
