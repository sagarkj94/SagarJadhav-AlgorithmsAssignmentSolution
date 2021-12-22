package com.sortingassignment.model;

public class Operatecompany {
	public void displayasc(double price[],int size)
	{
		System.out.println("Stock prices in ascending order are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(price[i]+"  ");
		}
		System.out.println();
	}
	public void displaydsc(double price[],int size)
	{
		System.out.println("Stock prices in descending order are :");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(price[i]+"  ");
		}
		System.out.println();
	}
	public void displayrise(boolean rise[],int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(rise[i]==true)
				count=count+1;
		}
		System.out.println("Total no of companies whose stock price rose today :"+count);
	}
	public void displaydecline(boolean rise[],int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(rise[i]==false)
				count=count+1;
		}
		System.out.println("Total no of companies whose stock price declined today :"+count);
	}
}
