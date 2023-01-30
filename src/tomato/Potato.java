package tomato;

import java.util.Iterator;
import java.util.Scanner;

public class Potato {

	public static void main(String[] args) {

		// System.out.println("hi, guys");	
		//
		// double a = 125.56;
		// System.out.println(a);
		//	float x = 147.7f;
		//	System.out.println(x);
		//	char R ='1';
		//	System.out.println(R);
		//	double Y;
		//a =45.6;
		//System.out.println(a);
		//	int d =455;
		//	System.out.println(d);
		//	double e =1223;
		//	System.out.println(e);
		//	char t ='3';
		//	System.out.println(t);
		//	String c ="بسم اللة الرحمن الرحيم";
		//	

		//	
		//	 int n;
		//     Scanner s = new Scanner(System.in);
		//     System.out.print("Enter the number you want to check");
		//     n = s.nextInt();
		//     if(n > 0)
		//     {
		//         System.out.println("The given number "+n+" is Positive");
		//     }
		//     else if(n < 0)
		//     {
		//         System.out.println("The given number "+n+" is Negative");
		//     }
		//     else
		//     {
		//         System.out.println("The given number "+n+" is neither Positive nor Negative ");
		//     }

		//		Given an integer n, perform the following conditional actions:
		//			If n is odd, print I love java
		//			If n is even and in the inclusive range 3 of  to 7 , print I hate java
		//			If n is even and in the inclusive range 8 of  to 28 , print I love money
		//			If n is even and greater than 28, print I'm poor

		//		int odd;
		//		int even;
		//		int num;
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("please enter your number");
		//		
		//		
		//		
		//		num= scanner.nextInt();
		//		
		//		 if(!(num % 2 ==0)) {
		//			 
		//		System.out.println("I love java");
		//		}
		//		 else if(num > 3 && num < 7) {
		//			 System.out.println("I hate java");
		//		 }
		//		 else if(num>=8 && num<=28) {
		//			 System.out.println("I love money");
		//		 }
		//		 else if (num>28){
		//			 System.out.println("I'm poor");
		//		 }
		//		 else {
		//			 System.out.println("number does't met condition");
		//		 }
		//	

		//		depandin on the dY OF THWE WE=====
		//		int n;
		//
		//		Scanner scanner=new Scanner(System.in);
		//		System.out.println("please enter your number :");
		//		n=scanner.nextInt();
		//		System.out.println("The number you enter is: " + n );
		//		System.out.println("The list of "+ n+ "Multiplication from 1 to 10 is" );
		//
		//		for (int i = 0; i <=10; i++) 
		//		{
		//			System.out.println( n + "x" + i + "=" + n*i);
		//		}
		//		
		//		System.out.println("The list of the even numbers for :" + n+ " Multiplication from 1 to 10 is:" );
		//		for (int i = 0; i <=10; i++)
		//		{
		//			if (n*i%2==0) {
		//				System.out.println( n + "x" + i + "=" + n*i);
		//			}
		//		}
		//		
		//		System.out.println("The list of the odd numbers for :" + n+ " Multiplication from 1 to 10 is:" );
		//		for (int i = 0; i <=10; i++)
		//
		//		{
		//			if (n*i%2!=0) {
		//				System.out.println( n + "x" + i + "=" + n*i);
		//			}
		//			
		//		}
		//		 if(n%2==0) {
		//			System.out.println("Nothing has been found");
		//		
		//		
		//		}
		//			Scanner scanner = new Scanner(System.in);
		//			int, boolean, byte, long, char, double
		//			String str1 = "House";
		//			String str2 = "house";
		////			
		//			System.out.println(str1.equalsIgnoreCase(str2));
		//			
		//			System.out.println(str1.contains(str2));

		//			String str3 = str1+str2;
		//			String str4 = str1.concat(str2);

		//			String str3 = str1.trim();
		//			System.out.println(str3);
		//			System.out.println(str4);

		//			char c = 't';
		//			System.out.println(str.length());
		//			System.out.println(str1.concat(str2));

		//			int n = str1.length();
		//			System.out.println(n);

		//			
		//			Write a program that determines the season based on the month (switch-case practice)
		//			Dec, Jan, Feb: winter
		//			March, April, May: spring
		//			June, July, Aug: summer
		////			Sep, Oct, Nov: autumn



		//	int seasons;
		//	int months;
		//	Scanner scanner = new Scanner(System.in);
		//	System.out.println("please enter your Month");
		//	seasons = scanner.nextInt();
		//	months = scanner.nextInt();
		//	int winter = dec+jan+feb
		//	
		//	if (seasons = "winter"+dec + jan+ feb) {
		//		System.out.println("this is winter"+ dec + jan + feb);
		//		
		//	}

		// depending on the day of the week, it will determine the weather

		//		String day;
		//		String weather;
		//
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("Please enter the day");
		//		day = scanner.next();
		//		switch (day) {
		//		case "Monday":
		//		case "Wednesday":
		//			weather = "Cloudy";
		//			System.out.println("The weather today will be " + weather);
		//			break;
		//		case "Tuesday":
		//		case "Thursday":
		//			weather = "Sunny";
		//			System.out.println("The weather today will be " + weather);
		//			break;
		//		case "Friday":
		//			weather = "Snowy";
		//			System.out.println("The weather today will be " + weather);
		//			break;
		//		case "Saturday":
		//			weather = "Rainy";
		//			System.out.println("The weather today will be " + weather);
		//			break;
		//		case "Sunday":
		//			weather = "Foggy";
		//			System.out.println("The weather today will be " + weather);
		//			break;
		//
		//		default:
		//			System.out.println("Invalid value");
		//		}
		//			


		//		int items;
		//		double price;
		//		double total = 0;
		//
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("Please enter number of items:");
		//		items = scanner.nextInt();
		//		System.out.println("The number of your items is " + items);
		//
		//		for (int j = 0; j < items; j++) {
		//			System.out.println("Please enter the price of each item:");
		//			price = scanner.nextDouble();
		//			total = total + price;
		//
		//		}
		//		System.out.println("Your final total is: " + total);
		//			



		//		String str = "shady"; // 5
		//		StringBuffer sb = new StringBuffer(str);
		//		sb = sb.reverse();
		//		System.out.println(sb);

		// reverse the string
		//		for (int i = str.length() - 1; i >= 0; i--) {
		//			System.out.print(str.charAt(i));
		//		}
		//
		//		System.out.println();
		//		for (int i = 0; i < str.length(); i++) {
		//			System.out.print(str.charAt(i)+" ");
		//		}


		//		Write a program that checks a word if it's palindrome
		//		racecar - racecar
		//		mom - mom
		//		car - rac

		//		String str = "abba";
		//		String str2 = "";
		//
		//		for(int i=str.length()-1; i>=0 ;i--) {
		//			str2 = str2 + str.charAt(i);
		//		}
		//		if(str.equals(str2)) {
		//			System.out.println(str+" is palindrome");
		//		}else {
		//			System.out.println(str+" is not palindrome");
		//		}


		//		Write a program that counts the number of lower case and upper case letters.
		//		String str = "TTTttt";
		//		String upper = str.replaceAll("[a-z]", "");
		//		String lower = str.replaceAll("[A-Z]", "");
		//		System.out.println(str);
		//		System.out.println(upper);
		//		System.out.println(lower);
		//		System.out.println("The number of uppercase letters is "+upper.length());
		//		System.out.println("The number of lowercase letters is "+lower.length());

		//		char c = 'a';
		//		int i = c;
		//		System.out.println(c);
		//		System.out.println(i);
		//		char d = (char)i;
		//		System.out.println(d);

		//		String str = "I love Moms Organic";
		//		int numOfUpper = 0;
		//		int numOfLower = 0;
		//		for(int i = 0; i<str.length(); i++) {
		//			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
		//				numOfUpper++;
		//			}if(str.charAt(i)>=65 && str.charAt(i)<=97) {
		//				numOfLower++;
		//			}
		//		}
		//		System.out.println("The number of uppercase letters is "+numOfUpper);
		//		System.out.println("The number of lowercase letters is "+numOfLower);

		//		Print the numbers 1-100. If the number is a multiple of 3, print fizz instead.
		//		If the number is a multiple of 5, print buzz. If the number is a multiple
		//		of both 3 and 5, print FizzBuzz.

		//		for(int i=1; i<=100; i++) {
		//			if(i%3==0 && i%5==0) {
		//				System.out.println("FizzBuzz");
		//			}else if(i%5 == 0) {
		//				System.out.println("buzz");
		//			}else if(i%3==0) {
		//				System.out.println("fizz");
		//			}else {
		//				System.out.println(i);
		//			

		//		String str = "Tr2eeijo";
		//		int smAllnum = 0;
		//		int larGnum =0;
		//	String out ="";
		//	for(int i=0;i<str.length();i++) {
		//		if(str.charAt(i)>=50 && str.charAt(i)<=114);
		//	}
		//	System.out.println("The large number"+larGnum);
		//		
		//			



		//			
		//			String str = "9jkj";
		//			int smAllnum =0;
		//			int largnum = 0;
		//			String out = "";
		//			for(int i=0;i<str.length();i++){
		//				if(str.charAt(i)>=57&& str.charAt(i)<=75);
		//			
		//			}
		//			System.out.println("the large number is"  + largnum);
		//			


		//		 String str="9jkj";
		//		  String out="";
		//		  for(int i=0;i<str.length();i++)
		//		  {
		//		    int a=str.codePointAt(i);
		//		     if(a>=57&&a<=75)
		//		       {
		//		          out=out+str.charAt(i);
		//		       }
		//		   }
		//		 System.out.println(out);
		//			
		
//		Find the total sum of these numbers: 11, 60, 42, 88, 37, 9, 46, 17, 21


		
		
		
//		int [] t = { 11, 60, 42, 88, 37, 9, 46, 17, 21 };
//	    int sum = 0;
//	    
//	    int[] total = new int[sum];
//	    
//		for (int j =0; j<t.length; j++) {
//			
//			
//				sum =sum + total [j];
//			
//			
//		}
//		
//	   
//		
//		
//		System.out.println("Total sum of these numbers is " + sum);

	
	
		 int[] numbers = new int[]{ 10, 10, 10, 10};
         
	        int sum = 0;
	          
	        for (int i=0; i < numbers.length ; i++) {
	            sum = sum + numbers[i];
	        }
	          
	        System.out.println("Sum value of array elements is : " + sum);
	         
  


 











		









































































	}

}
