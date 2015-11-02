package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiating XmlBean Implementation of the BeanFactory.
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Getting triangle object from spring bean factory. 
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
