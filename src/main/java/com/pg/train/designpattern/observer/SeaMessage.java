package com.pg.train.designpattern.observer;

import com.pg.train.designpattern.observer.base.Observer;

public class SeaMessage implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("sea " + msg);
	}

}
