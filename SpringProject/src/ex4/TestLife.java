package ex4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

	@Test
	public void lafda() {
		ConfigurableApplicationContext kuchbhi = new ClassPathXmlApplicationContext("ex4/appcxt.xml");

		MyLife dukh = kuchbhi.getBean(MyLife.class);
		
		kuchbhi.close();
	}
}
