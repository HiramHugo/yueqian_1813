package org.yueqian.com.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;


@WebServlet("/Demo_requestBrowser")
public class Demo2_requestBrowser extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String browser=request.getHeader("User-Agent");//获取浏览器版本
		if (browser.contains("chrome")) {
			System.out.println("当前浏览器是谷歌");
		} else if(browser.contains("Firefox")){
			System.out.println("当前浏览器是火狐");
		}else{
			System.out.println("当前浏览器是IE");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
