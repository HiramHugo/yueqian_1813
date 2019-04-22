package org.yueqian.com.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo1_request")//����·��
public class Demo1_request  extends HttpServlet {

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����ʽ
		String method=request.getMethod();
		//��ȡ��Դ
		String uri=request.getRequestURI().toString();
		//��ȡЭ��汾
		String protocol=request.getProtocol();
		System.out.println("����ʽ��"+method+" �������Դ��"+uri+" Э��汾��"+protocol);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
