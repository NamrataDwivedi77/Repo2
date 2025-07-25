package com;

import org.testng.annotations.Test;

public class SplitString
{
  @Test
  public void splitString_Reverse() 
  {
	  
	  String myStr="Today is Friday";
	  String words[]=myStr.split(" ");
	  String rev =" ";
	 
	 // System.out.println(words[0]);
	  
	  for(int i=0;i<words.length;i++)
	  {
		  String word = words[i];
		  
		  for(int j=word.length()-1;j>=0;j--)
		  {
			  rev += word.charAt(j);
			  
		  }
		  
	  }
	  
	  System.out.print(rev);
	  
	  System.out.println("Git testing");
  }

     
}
