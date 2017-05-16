package com.pg.train.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

import com.pg.train.designpattern.observer.base.Observer;
import com.pg.train.designpattern.observer.base.Subject;

public class MessageCenter implements Subject {

	private List<Observer> observers;

	private String commonMsg;

	public MessageCenter() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(observer -> observer.update(commonMsg));
	}

	public void messageUpdate() {
		this.notifyObservers();
	}

	public void setMessage(String message) {
		this.commonMsg = message;
	}
}
