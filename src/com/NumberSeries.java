package com;

public class NumberSeries 
{
	
	public static void main(String[]arg)
	{
		// sum of series of numbers
		/*int sum=0;
		
		for (int i=1;i<=11;i++)
		{
			sum=sum+(i*i);
			
		}
		System.out.println("sum of series is ="+sum);*/
		
		// series of 10 starts from 1
		
		
		/*for(int i=0;i<=100;i+=10)
		{
		
			System.out.println(i);
	    }*/
		
		// fibo series
		
		int n1=0, n2=1;
		
		
		int N= 12;
		
		for(int i=0;i<=N;i++)
		{
			
			System.out.println(n1+ " ");
			
			int n3= n1+n2;
			n1=n2;
			n2=n3;
		}
		
		
		
		
	}
	
	
	
	
     
}
