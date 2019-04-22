package org.yueqian.com.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Demo3_requestHeader")
public class Demo3_requestHeader extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> e=request.getHeaderNames();
		while(e.hasMoreElements()){
			//��ȡkeyֵ
			String key=e.nextElement();
			String value=request.getHeader(key);//���ݼ���ȡֵ
			System.out.println(key+" : "+value);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
