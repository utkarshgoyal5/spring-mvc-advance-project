package xyz.utkarshgoyal.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class LoveCalculatorInitializer //implements WebApplicationInitializer
{

//	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		//Adding the path of configuration file so that we can provide it to dispactcher servlet object
		//XML Config
		/*
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:beans.xml");
		*/
		//Class Config
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		//Creating the dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
	
		/*
		 * Here ServletRegistration and Dynamic are both interfaces where Dynamic is an inner interface inside ServletRegistration interface.
		 */
		
		//Registering the dispatcher servlet with servlet context

		ServletRegistration.Dynamic myCustomDispatcherServletDynamic = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		//for initializing dispatcher servlet at startup only rather when first request comes.
		myCustomDispatcherServletDynamic.setLoadOnStartup(1);
		//adding end point where all requests land.
		myCustomDispatcherServletDynamic.addMapping("/mywebsite.com/*");
		
		
		
		
	}

}
