package ax3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ax2.MessageService;

@Component
public class MyLife {

	@Autowired
	@Resource(name="sms")
	
	private MessageService sms;

	public MyLife() {
		System.out.println("MyLife constructor");
	}

	@PostConstruct
	public void janam() {
		System.out.println("MyLife after birth");
	}

	@PreDestroy
	public void maran() {
		System.out.println("MyLife before death");
	}
}
