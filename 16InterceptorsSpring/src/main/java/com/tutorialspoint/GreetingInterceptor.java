package com.tutorialspoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class GreetingInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String uri = request.getRequestURI();

		System.out.println("\n\n---------------------URI: " + uri);
		
		if (uri.indexOf("stop") >= 0) {
			System.out.println("/stop uri stopped by interceptor;");
			// redirect somewhere else before returning false;
			response.sendRedirect("/");
			return false;
		} else {
			System.out
					.println("GreetingInterceptor: REQUEST Intercepted for URI: "
							+ request.getRequestURI());
		}

		request.setAttribute("greeting", "Happy Diwali!");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
		System.out.println("Greetings : PostHandle executed.");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		System.out.println("Greetings: afterCompletion() executed." + response);
	}
	
	

}
