package com.homework.rectangle;

public class Rectangle implements IRectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
	double getArea() {
		return height * width;
	}

	@Override
	public int compareTo(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return this.getArea() > rectangle.getArea() ? 1
				:this.getArea() < rectangle.getArea() ? -1
				:0;
	}
	
}
