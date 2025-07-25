package com;





public class ArrayDemo 

{

 // @Test

  public void forLoopDemo() 


  { 

	  // find max, min and second largest number in an array

	  int [] num = {36,29,46,90,38,99,86};

	  int secondLargestNum=0;

	  int len = num.length;

	  for(int i=0;i<num.length;i++)

	  { 

		  for(int j=0;j<num.length-1;j++)

		  {	  

		  if (num[j]>num[j+1])

		  {

			 int k = num[j];

			 num[j]=num[j+1];

			 num[j+1]=k;

		  }

		  

		  }

	  }

	  

	  System.out.println("after sorting");

	  for(int i=0;i<num.length;i++)

	  {

		  System.out.println(num[i]);

		  

	  }

	  

	  System.out.println("minimum num is "+num[0]);

	  System.out.println("maximum num is "+num[len-1]);

	  System.out.println("second maximum num is "+num[len-2]);

  }

  

  //@Test

  public void searchNumber()

  {

	  //search the number

	  int [] numbers= {33,78,57,04,26,97,11,23};

	  int findNumber = 11;

	  

	  for(int i=0;i<numbers.length;i++)

	  {

		  if(numbers[i]==findNumber)

		  {

			  

			  System.out.println("number is "+numbers[i]+ " and index of the number is "+i);

			  break;

	      }

		  

		  else 

		  {

			  System.out.println("number not found");

			  

		  }

		 

	  }

  }

  //@Test

  public void splitString()

  {

	  /*String myStr = "Learn Java";

	  String spl[]= myStr.split(myStr);

	  

	  for(int i=myStr.length()-1;i>=0;i--)

	  {

		  

		  for(int j=0;j<)

		  

	  }*/

	  

	  int []ary = {6,9,3,2};

	  String str[]={"Java","Python","Javascript"};

	  

	 for(int i=0;i<str.length;i++)

	 {

		 

		 System.out.println(str[i]);

	 }

	  

  }

  

 // @Test

  public void reversingWordsOfTheSentenceDemo()

  {

	  

	  //String myString[]= {"Selenium","TestNg","BDD"};

	  String str= "Hello world good morning";

	  String words[]=str.split(" ");

	  System.out.println(words[0]);

	  String str1 = "Jan,feb,march,april,may";

	  String month[]=str1.split(",");

	 System.out.println(month[2]); 

	  

	  for(int i=words.length-1;i>=0;i--)

		  

	  {
		  System.out.print(words[i]+" "); 

	  }

		  

  }
}