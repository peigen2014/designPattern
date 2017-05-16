package com.pg.train.designpattern.decorator.condiment;

import com.pg.train.designpattern.decorator.base.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
