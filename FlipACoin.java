package com.first.one;

import java.util.Scanner;

public class FlipACoin 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter No Of flips");
		int flip=scn.nextInt();
		 if (Math.random() < 0.5)
             System.out.println("Heads");
		 else
             System.out.println("Tails");
	}
}
