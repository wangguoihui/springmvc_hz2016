package com.cn.hnust.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *@类名称：ContextListener.java
 *@文件路径：com.dm.dmserver.main.web.listener
 *@author：email: <a href="xwh@ewppay.com"> 伟宏 </a> 
 *@Date 2015-8-1 上午9:35:55 
 * @since 1.0
 */
public class ContextListener implements ServletContextListener {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	public void contextDestroyed(ServletContextEvent arg0) {
	}
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		logger.info("start contextInitialized.....");
		try {
			
			/*获取spring容器,维护手动管理*/
//			ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
//			SpringBeanUtils.setApplicationContext(ctx);
			
			/*全局相对路径*/
			String contextPath = event.getServletContext().getContextPath();
			event.getServletContext().setAttribute("ctx", contextPath);
	
			System.err.println("--------springmvc_hz2016 is ready!-----");
			
		} catch (Exception e) {
			logger.error("{}", e);
		}
		logger.info("contextInitialized ended.....");
	}
}









