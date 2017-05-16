package com.pg.train.designpattern.decorator;

import org.junit.Test;

import com.pg.train.designpattern.decorator.base.Beverage;
import com.pg.train.designpattern.decorator.condiment.Mocha;
import com.pg.train.designpattern.decorator.drink.DarkRoast;
import com.pg.train.designpattern.decorator.drink.Espresso;

public class CoffeeTests {

	@Test
	public void test_01() {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();

		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);

		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
