package com.decorator.testone.Component.Inter.impl.decoratorImpl;

import com.decorator.testone.Component.Inter.Component;

public class AbstractDecorator extends Component {
	//需要装饰的主对象
	protected Component component;

	public AbstractDecorator(Component component){
		this.component = component;
	}

	public void operator() {
		component.operator();
	}
}
