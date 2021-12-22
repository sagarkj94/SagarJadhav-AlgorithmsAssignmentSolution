package com.sortingassignment.main;

import java.util.Scanner;

import com.sortingassignment.company.Company;
import com.sortingassignment.model.Binarysearch;
import com.sortingassignment.model.Operatecompany;
import com.sortingassignment.model.Sortcompany;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortcompany sortprice=new Sortcompany();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int size=sc.nextInt();
		Company c[]=new Company[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter current stock price of the company "+(i+1));
			double price=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			boolean rise=sc.nextBoolean();
			c[i]=new Company(price,rise);
		}
		double[] pricesort = new double[size];
		boolean[] stockrise = new boolean[size];
		for(int i=0;i<size;i++)
		{
			pricesort[i]=c[i].getStockprice();
			stockrise[i]=c[i].isRise();
		}
		sortprice.sort(pricesort, 0, size - 1);
		int choice=1;
		Operatecompany oc=new Operatecompany();
		Binarysearch bs=new Binarysearch();
		
		while(choice != 0)
		{
			System.out.println("___________________________________________________________________________");
			System.out.println();
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("___________________________________________________________________________");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("Exited successfully");
				break;
			case 1:
				oc.displayasc(pricesort, size);
				break;
			case 2:
				oc.displaydsc(pricesort, size);
				break;
			case 3:
				oc.displayrise(stockrise, size);
				break;
			case 4:
				oc.displaydecline(stockrise, size);
				break;
			case 5:
				System.out.println("Enter the key value");
				double key=sc.nextDouble();
				int result=bs.binarySearch(pricesort, 0, size-1, key);
				if (result == -1)
		            System.out.println("Value not found");
		        else
		            System.out.println("Stock of value "+key+" is present");
				break;	
			default:
				System.out.println("Enter Correct option");
				break;
			}
		}
		sc.close();
	}

}
