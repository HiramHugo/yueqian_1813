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
		String browser=request.getHeader("User-Agent");//��ȡ������汾
		if (browser.contains("chrome")) {
			System.out.println("��ǰ������ǹȸ�");
		} else if(browser.contains("Firefox")){
			System.out.println("��ǰ������ǻ��");
		}else{
			System.out.println("��ǰ�������IE");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
