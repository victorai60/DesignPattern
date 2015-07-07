package com.visp.designpattern.observer;

public class Observer1 extends Observer {
	private String name;
	private Subject subject;
	
	public Observer1(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println("观察者：" + name + "，主题状态：" + subject.getSubjectState());
	}
}
