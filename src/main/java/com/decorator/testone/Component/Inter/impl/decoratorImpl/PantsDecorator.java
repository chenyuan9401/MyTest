package com.decorator.testone.Component.Inter.impl.decoratorImpl;

import com.decorator.testone.Component.Inter.Component;

public class PantsDecorator extends AbstractDecorator {

	public PantsDecorator(Component component) {
		super(component);
	}

	public void operator() {
		System.out.println("裤子装饰");
		super.operator();
	}
}
