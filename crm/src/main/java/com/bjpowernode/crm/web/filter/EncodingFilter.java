package com.bjpowernode.crm.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 过滤post请求中的乱码
        servletRequest.setCharacterEncoding("UTF-8");
        // 过滤响应流响应的中文乱码
        servletResponse.setContentType("text/html;charset=utf-8");
        // 将请求放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
