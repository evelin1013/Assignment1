package com.first.one;

public abstract class Shape implements ShapeBehaviour
{
	double area;
	@Override
	public double getAreaInt()
	{
		return area;
	}

	@Override
	public void printInfoInt() 
	{
		
	}
	
}
