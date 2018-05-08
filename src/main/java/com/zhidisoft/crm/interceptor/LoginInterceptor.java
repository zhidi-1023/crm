package com.zhidisoft.crm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	//进入Handle方法前执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String username = (String) request.getSession().getAttribute("username");
		String ctxPath  = request.getContextPath(); 
		if(username!=null){  
            //登陆成功的用户  
            return true;  
        }else{  
           // 重定向没有登陆，转向登陆界面  
       	 response.sendRedirect(ctxPath+"/login");
          return false;  
        }
	}

	//进入Handle方法时执行
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	//进入Handle方法后执行
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
