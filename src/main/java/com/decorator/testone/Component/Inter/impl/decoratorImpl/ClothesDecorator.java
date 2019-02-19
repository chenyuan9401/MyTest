package com.decorator.testone.Component.Inter.impl.decoratorImpl;

import com.decorator.testone.Component.Inter.Component;

public class ClothesDecorator extends AbstractDecorator {

	public ClothesDecorator(Component component) {
		super(component);
	}

	public void operator() {
		System.out.println("装饰衣服");
		super.operator();
	}
}
