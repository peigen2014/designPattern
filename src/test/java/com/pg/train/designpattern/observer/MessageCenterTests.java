package com.pg.train.designpattern.observer;

import org.junit.Test;

public class MessageCenterTests {

	@Test
	public void test_01() {
		MessageCenter messageCenter = new MessageCenter();
		messageCenter.setMessage("hello");
		SeaMessage seaMessage = new SeaMessage();
		WeatherMessage weatherMessage = new WeatherMessage();
		messageCenter.registerObserver(seaMessage);
		messageCenter.registerObserver(weatherMessage);
		messageCenter.notifyObservers();
	}
}
