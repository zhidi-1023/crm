package com.zhidisoft.crm.interceptor;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.zhidisoft.crm.entity.TbSystemFunction;

/**
 * 权限拦截器 先拦截登录,在拦截权限
 * 
 * @author Administrator
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		List<TbSystemFunction> functions = (List<TbSystemFunction>) session.getAttribute("functions");
		String urlPath = request.getServletPath().substring(1);
		System.out.println(urlPath);
		for (TbSystemFunction item : functions) {
			if (urlPath.equalsIgnoreCase(item.getFuncurl())) {
				return true;
			}
		}

		// 默认不往下面执行了
		response.sendRedirect("https://www.baidu.com");
		return false;
	}

}
