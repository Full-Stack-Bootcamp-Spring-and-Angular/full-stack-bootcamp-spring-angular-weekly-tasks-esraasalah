package com.inversionofcontrol;

public class Circle implements Shape {

	@Override
	public Double getArea(Double x) {
		
		return    3.14 * x * x   ;
	}

}
