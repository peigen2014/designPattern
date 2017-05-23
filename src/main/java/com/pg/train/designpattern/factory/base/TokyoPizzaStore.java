package com.pg.train.designpattern.factory.base;

public class TokyoPizzaStore implements PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		switch (item) {
		case "JapAPizza":
			return new JapAPizza();
		case "JapBPizza":
			return new JapBPizza();
		default:
			break;
		}
		return null;
	}

}
