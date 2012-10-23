package org.jpa.example;

import java.util.List;

import org.jpa.orm.Contact;
import org.jpa.orm.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJPAExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ContactService service = (ContactService)ctx.getBean("jpaContactService",ContactService.class);
		
		List<Contact> contact = service.findAll();
		
		for(Contact c : contact){
			System.out.println("First Name is "+c.getFname());
		}

	}

}
