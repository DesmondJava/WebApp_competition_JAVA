package ua.com.pectorale;

import org.springframework.stereotype.Service;

@Service(value = "service")
public class ServiceBean {

	public String getName() {
		return "date " + System.nanoTime();
	}
}
