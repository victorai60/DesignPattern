package com.visp.designpattern.adapter;

public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specialRequest();
	}
}
