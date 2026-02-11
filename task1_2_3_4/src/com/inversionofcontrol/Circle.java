package com.inversionofcontrol;

public class Circle implements Shape {

	@Override
	public Double getArea(Double x) {
		
		return    Math.PI* x * x   ;
	}

}
