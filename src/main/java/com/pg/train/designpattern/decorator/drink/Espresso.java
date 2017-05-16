package com.pg.train.designpattern.decorator.drink;

import com.pg.train.designpattern.decorator.base.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.1;
	}

}
