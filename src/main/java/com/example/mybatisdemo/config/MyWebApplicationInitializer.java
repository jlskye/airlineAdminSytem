package  com.example.mybatisdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * RootConfig配置类加载的是驱动应用后端的中间层和数据层组件，是父上下文
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {  com.example.mybatisdemo.config.RootConfig.class };
	}

	/**
	 * WebConfig配置类中主要是内容是启用组件扫描，配置视图解析器，配置静态资源的处理。
	 * 其实就是使用配置在WebConfig配置类中的bean
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { com.example.mybatisdemo.config.WebConfig.class };
	}
	/**
	 *  为DispatcherServlet指定servlet 映射.映射的是"/"，这表示他会是应用的Servlet。他会从处理进入应用的所有请求。
	 *  (其实就相当于<servlet-mapping>的子元素<url-pattern>用于指定应用于Servlet的URL路径)
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
