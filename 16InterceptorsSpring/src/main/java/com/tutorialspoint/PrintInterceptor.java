package com.tutorialspoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class PrintInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String uri = request.getRequestURI();

		System.out.println("URI: " + uri);

		System.out.println("PrintInterceptor: REQUEST Intercepted for URI: "
				+ request.getRequestURI());

		request.setAttribute("interceptor", "Happy Diwali!");
		return true;
	}

}
