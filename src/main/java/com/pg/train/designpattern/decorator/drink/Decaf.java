package com.pg.train.designpattern.decorator.drink;

import com.pg.train.designpattern.decorator.base.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .01;
	}

}
