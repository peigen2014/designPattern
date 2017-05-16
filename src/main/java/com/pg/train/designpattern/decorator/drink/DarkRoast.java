package com.pg.train.designpattern.decorator.drink;

import com.pg.train.designpattern.decorator.base.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
