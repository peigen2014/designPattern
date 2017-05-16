package com.pg.train.designpattern.decorator.base;

public abstract class Beverage {
	public String description = "un know";

	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
