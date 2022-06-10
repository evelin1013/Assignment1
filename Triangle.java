package com.first.one;

public class Triangle extends Shape
{
	
	double l=5.5;
	double b=10.1;
	
	public Triangle()
	{
		l=5.5;
		b=10.1;
	}

	@Override
	public double getAreaInt() 
	{
		area=(l*b)/2;
		return area;
	}

	@Override
	public void printInfoInt() 
	{
		System.out.println("Area of Triangle:"+area);
	}
	public static void main(String[] args) 
	{
		Shape tri=new Triangle();
		tri.getAreaInt();
		tri.printInfoInt();
	}
	
}
