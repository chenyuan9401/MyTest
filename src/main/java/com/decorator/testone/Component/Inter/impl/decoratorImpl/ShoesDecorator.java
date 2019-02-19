package com.decorator.testone.Component.Inter.impl.decoratorImpl;

import com.decorator.testone.Component.Inter.Component;

public class ShoesDecorator extends AbstractDecorator {

	public ShoesDecorator(Component component) {
		super(component);
	}

	@Override
	public void operator(){
		System.out.println("装饰鞋子");
		super.operator();
	}
}
