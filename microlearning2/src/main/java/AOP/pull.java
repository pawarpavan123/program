package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext context= new ClassPathXmlApplicationContext("AOP/BEFORE.xml");
Payment p=(Payment)context.getBean("pay");
p.SMS();
p.Email();

	}

}
