package com.decorator.testone.Component.Inter.impl;

import com.decorator.testone.Component.Inter.Component;

/**
 * 具体的需要被装饰的类
 */
public class ConComponent extends Component {

	public void operator() {
		System.out.println("这下好看了");
	}
}
