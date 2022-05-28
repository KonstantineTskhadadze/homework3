package com.homework.main;


public class Main {
	public static void main(String[] args) {
		{
			com.homework.rectangle.Rectangle rectangle1 = new com.homework.rectangle.Rectangle(10, 20);
			com.homework.rectangle.Rectangle rectangle2 = new com.homework.rectangle.Rectangle(20, 25);
			System.out.println(rectangle1.compareTo(rectangle2));
		}
		{
			com.homework.another.rectangle.Rectangle rectangle1 = new com.homework.another.rectangle.Rectangle(10, 20);
			com.homework.another.rectangle.Rectangle rectangle2 = new com.homework.another.rectangle.Rectangle(20, 25);
			System.out.println(rectangle1.compareTo(rectangle1, rectangle2));
		}
	}
}
