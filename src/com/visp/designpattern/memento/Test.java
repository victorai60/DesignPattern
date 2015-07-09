package com.visp.designpattern.memento;

public class Test {

	// 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
	// 这样以后就可将该对象恢复到原先保存的状态。
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("Off");
		originator.show();

		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());

		originator.setState("On");
		originator.show();

		originator.setMemento(caretaker.getMemento());
		originator.show();
	}
}
