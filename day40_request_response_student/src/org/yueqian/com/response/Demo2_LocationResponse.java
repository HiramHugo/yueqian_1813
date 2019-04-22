package org.yueqian.com.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

@WebServlet("Demo2_LocationResponse.action")//虚拟路径的动态资源
public class Demo2_LocationResponse extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//请求转发
		request.setAttribute("message", "需要另外一个servlet进行数据处理");
	    request.getRequestDispatcher("/Demo2_LocationResponse2").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
