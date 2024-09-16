package com.AbhiSpringbody.AbhiSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Dell implements Laptop1 {
	
	@Autowired
	private Price price;
	
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void disp()
	{
		System.out.println("Laptop is Dell...and its price is "+price);
	}

}
