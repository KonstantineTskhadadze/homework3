package com.homework.another.rectangle;

public class Rectangle implements IRectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	protected double getPerimeter() {
		return height * width;
	}
	@Override
	public int compareTo(Rectangle a, Rectangle b) {
		// TODO Auto-generated method stub
		return a.getPerimeter() > b.getPerimeter() ? 1
				:a.getPerimeter() < b.getPerimeter() ? -1
				: 0;
	}
}
