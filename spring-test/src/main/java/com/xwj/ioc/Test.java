package com.xwj.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@ComponentScan({"com.xwj.ioc","com.xwj.postconstruct"})
@Configuration
@Import(value = { MyImportBeanDefinitionRegistrar.class})
public class Test {
	public static void main(String[] args) {
		ApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Test.class);
		A c = annotationConfigApplicationContext.getBean(A.class);
		System.out.println(c);
	/*	//
		D bean = annotationConfigApplicationContext.getBean(D.class);

		Object customerFactoryBean = annotationConfigApplicationContext.getBean("customerFactoryBean");*/



		//关闭bean
		//annotationConfigApplicationContext.close();


 	/*	ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring-bean.xml","classpath:/META-INF/spring-bean-look-up.xml");
		Object a = classPathXmlApplicationContext.getBean("a");*/
//		BeanFactory beanFactory=new AnnotationConfigApplicationContext(Test.class);

//		A bean = beanFactory.getBean(A.class);
//		System.out.println(bean);

		/*AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Test.class);
		annotationConfigApplicationContext.getBean(A.class);*/


		/*ApplicationContext classPathXmlApplicationContext = new MyClassPathXmlApplicationContext("classpath:/META-INF/spring-bean.xml","classpath:/META-INF/spring-bean-look-up.xml");
		Object a = classPathXmlApplicationContext.getBean("a");
		System.out.println(a);*/

	}
}