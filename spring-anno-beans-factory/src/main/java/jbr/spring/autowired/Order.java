package jbr.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

	@Autowired
	private Product product;

	public void getProduct() {
		product.name();
	}

}
