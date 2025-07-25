package com;

public class reverseString 
{
	String name ="Namrata";
	String rev = "";
	
	public void rs() {
	
	for (int i= name.length()-1; i>=0; i--)
	{
		rev += name.charAt(i);
	}

	System.out.println(rev);
	}
	
	public static void main(String[] args) 
	{
		reverseString rss = new reverseString();
		rss.rs();

	}

}
