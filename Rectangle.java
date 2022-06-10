package com.first.one;

public class Rectangle extends Shape
{
	double length;
	double width;
	public Rectangle()
	{
		length=5;
		width=10;
	}
	public void RectangleBehaviour()
	{
		area=length*width;
		System.out.println("Area of Rectangle:"+area);
	}
}
