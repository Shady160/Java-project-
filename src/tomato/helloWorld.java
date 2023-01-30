package tomato;

import java.util.Scanner;

public class helloWorld {

	public helloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		System.out.println("I'm Shady ");
//		System.out.println("He said that\n I'm from Egypt\n but Lives in  KSA");
//		System.out.println("Work Days Are \n Sunday \t Monday \t TUesday \t Wednesday\t");
//		write a program to find the area of rectangle.

//		 Scanner input  = new Scanner(System.in);
//		int leangth;
//		double width;
//		double area;
//		System.out.println("ENTER THE rectanle length");
// leangth = input.nextInt();
// System.out.println("enter the width");
//     width = input.nextDouble();
//     
//     area = leangth*width;
//     System.out.printf("the rectangle area is %f",area);

//     Write a program to ask your name and  print your net salery
//     Scanner input = new Scanner(System.in);
//     
//     String fname;
//     double salery;
//     double netsalery;
//     System.out.println("enter your first name");
//     fname = input.next();
//     System.out.println("enter your salery");
//     salery = input.nextDouble();
//     
//     netsalery = salery - (salery * .10f);
//    		 System.out.printf("Your net salery is %f" ,netsalery);
//     
//		
////		
////		
//		System.out.println(5.0/2);
		// int i = 9 , j =2;
//		System.out.println((float)i/j);
//i--;
//j--;
		// increment and decremnt ruls
//System.out.println(i++);
//System.out.println(i);
//System.out.println(++j);

// compound assignemnets
//		i+=5; // i= i+5
//		j*=20;   /// j= j *20
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(++i *--j * 2);

//		// Control statment: selections statements  if, one way 
//		Scanner input =new Scanner(System.in);
//		int grades;
//		System.out.println("enter your grade");
//		grades = input.nextInt();
//		
//		if(grades>=60) {
//		
//		System.out.println("Congratulation");
//		System.out.println("you passeed");
//		}

//		// if else statements , two way if statement
//		Scanner input = new Scanner(System.in);
//		int number;
//		System.out.println("enter your number");
//		number =input.nextInt();
//		if(number % 2==0)
//			System.out.println("even number");
//		else
//			System.out.println("odd number");
//		

		// creat a program to identfy postive from negative numbers

//		Scanner input = new Scanner(System.in);
//		
//		
//		int number;
//		System.out.println("enrter your number");
//		number= input.nextInt();
//		if(number>0)
//			System.out.println("positive number");
//		else
//			System.out.println("negative number");
		// write a program to accept intger number from user.
		// in case the number is positive, check and print out wheather its evenor odd
		// number
		// Nested If
//		Scanner input = new Scanner(System.in);
//		int number;
//		System.out.println("Enter your number");
//		number = input.nextInt();
//		if(number>=0)
//		
//			
//			
//		{  
//			if(number%2==0)
//			{
//				System.out.println("this number is positive");
//		System.out.println("this number is Even");   
//		}
//		
//		else
//			System.out.println("this number is odd");
//		}
//	
//	
//			else
//				System.out.println("this number is negative");
//			

		// If -Else If statement
		// write a program ask the user to enter 2 numbers and print out.
		// whether they are equal or there is one is greater than the other.

//		Scanner input= new Scanner(System.in);
//		int num1,num2;
//		System.out.println("enter 2 numbers");
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		
//		if(num1==num2)
//			System.out.println("both are equal");
//		else if(num1>num2)
//			System.out.println("num1 greater than num2");
//		
//		else
//			System.out.println("num2 is greater than num1");
//		
//		
		// grade programe using else if
//	
//		Scanner input = new Scanner(System.in);
//		int markes;
//		System.out.println("please enter your grade");
//		markes = input.nextInt();
//		
//		
//		if(markes>=90)
//			System.out.println("your grade is A ");
//		else if(markes>=80)
//			System.out.println("your grade is B");
//		else if(markes>=70)
//			System.out.println("your grade is C");
//		else if(markes>=60)
//			System.out.println("your grade is D");
//		else
//			System.out.println("your grade is F");
//		
		// combining more than one condition. logical operators
		// && and
		// || or

//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.println("enter your number");
//		num = input.nextInt();
//		
//		if(num>=0 && num<=100)
//			System.out.println("your number is between 0 and 100");
//		else
//			System.out.println("your number is out of range");

//		Scanner input = new Scanner(System.in);
//		int markes;
//		System.out.println("please enter your grade");
//		markes = input.nextInt();
////		
////		
//		if (markes >= 90 && markes <= 100)
//			System.out.println("your grade is A ");
//		else if (markes >= 80 && markes <= 90)
//			System.out.println("your grade is B");
//		else if (markes >= 70 && markes <= 80)
//			System.out.println("your grade is C");
//		else if (markes >= 60 && markes <= 70)
//			System.out.println("your grade is D");
//		else
//			System.out.println("your grade is F");
		
		// Creat a proggram to calculate your grade by using Swtich Statmen
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please Enter your grade");
//
//	
//				char grade ;
//				
//				grade = input.next().charAt(0);
//	
//				switch(grade)
//				{
//				case 'a':
//					System.out.println("exellent");
//					break;
//				case 'b':
//					System.out.println("very good");
//					break;
//				case 'c':
//				System.out.println("good");
//				break;
//				
//				case 'd':
//					System.out.println("fair");
//					break;
//				case 'f':
//					System.out.println("failed");
//					break;
//					default:
//						System.out.println("invalid grade");
		{
//					
				}
	
	//	creat a program that display the following menu, then acts accordingly: by using switch statements
//			Enter your choice :
//			1.	Add two numbers
//			2.get the subtract of two number
//			3. get the square of  number 
//		Scanner  input= new Scanner(System.in);
//		int choise,num1,num2;
//		
//		System.out.println("1.Add two numbers");
//		System.out.println("2.get the double of positive number");
//		System.out.println("3.get the square of a number");
//		choise = input.nextInt();
//		
//		switch (choise)
//		{
//		case 1:
//			System.out.println("1.enter two numbers");
//			num1=input.nextInt();
//			num2=input.nextInt();
//			System.out.println(num1+num2);
//			
//			break;
//			
//		case 2 :
//			System.out.println("2.get the double of positive number");
//			num1=input.nextInt();
//			num2=input.nextInt();
//			System.out.println(num1-num2);
//			break;
//			
//		case 3 :
//			System.out.println("3.get the square of a number");
//			num1=input.nextInt();
//			if(num1>0)
//				System.out.println(num1*num1);
//			break;
//			
//			default:
//				System.out.println("invalid choise number");
//		}
//	
		// Creat a program to find Vowel letters.
		
//		Scanner input= new Scanner(System.in);
//		char cha;
//		System.out.println("Enter your test letter");
//		cha = input.next().charAt(0);
//		
//		switch(cha)
//		{
//		case'a':
//		case'e':
//		case'o':
//		case'i':
//		case'u':
//			System.out.println("This is Vowel");
//			break;
//			//the default here its an optional
//			default:
//				System.out.println("This is normal letters");
//			
			
			// Creat a Program to Calculates and prints out the Average grade for 6 students. 
		//using while loop
			
//		
//		int counter=1;
//		int grade=0, sum=0;
//		
//		
//		Scanner input= new Scanner(System.in);
//		
//		
//		while(counter<=6) {
//		
//			 System.out.println("enter the grade of studnet number"+counter);
//		grade= input.nextInt();
//		sum+=grade;
//		counter++;
//		}
//		System.out.println("The avaerage of the 6 grades is "+sum/6);
//		
		
		
//		int counter=1;
//		int grade=0, sum=0;
//		
//		
//		Scanner input= new Scanner(System.in);
//		
//		System.out.println("enter the 5 grades to get the average or -1 to exit");
//		while(counter<=5&&grade!=-1) {
//		
//			 System.out.println("enter the grade of studnet number"+counter);
//		grade= input.nextInt();
//		sum+=grade;
//		counter++;
//		}
//		System.out.println("The avaerage of the 6 grades is "+sum/5);
//		
		
			
		// Write a program that asks for a natural number and determines if it's an even number or odd
		
//	int num;
//		Scanner input= new Scanner(System.in);
//		System.out.println("plz enter your numner");
//	num = input.nextInt();
//	
//		if(num>0)			System.out.println("positive number");
//	else
//		System.out.println("negative number");
//		
		
//		Scanner reader= new Scanner(System.in);
//		double sum= 0.0;
//		double value;
//		 boolean positive= true;
//		 
//		 while(positive==true)
//		 {
//			 System.out.println("enter the next positive number");
//			 value = reader.nextDouble();
//			 if(value<0)
//				 positive= false;
//			 else
//				 sum=sum+value;
//		 }
//		 System.out.println("the total is is"+sum);
			
//			Scanner input=new Scanner(System.in);
//			int guessing;
//			int rand ;
//			
//			rand = (int)(Math.random()*100);
//			boolean stillplaying=true;
//			System.out.println("the generated number is"+rand);
//			while (stillplaying)
//			{
//				System.out.println("guess a number between 0 and 100");
//				guessing=input.nextInt();
//				if(guessing>rand)
//					System.out.println("guess is too large");
//				else
//					if(guessing<rand)
//						System.out.println("guess is too small");
//					else
//					{
//
//						System.out.println("you win");
//				stillplaying= false;
//					}
//			}
//			
//			
			
			
	
			

	
//	
//	Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("enter your number ");
//		
//	int x = scanner.nextInt();
//try {
//	if(x%2==0) {
//		System.out.println(x/2);
//	}	
//		
//	}
//	catch (Exception e) {
//	System.out.println(x +" this is odd number");	
//	}
	
		
		// writte grade using switch statement
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your grades");
//		char grade;
//		grade = scanner.next().charAt(0);
//		
//		switch(grade)
//		{
//		case 'a':
//			System.out.println("exelent");
//			break;
//		case 'b':
//			System.out.println(" very good");
//			break;
//		case 'c':
//			System.out.println("good ");
//			break;
//		case 'd':
//			System.out.println(" fair ");
//			break;
//		case 'f':
//			System.out.println(" failed");
//			break;
//			default :
//			System.out.println("invalid grade");
//		}

	//	Write a program that asks the ages of three people and prints out the average age.
//		System.out.println("how many members");
//		Scanner inpute = new Scanner(System.in);
//	
//		
//		
//		int age1,age2,age3;
//		int total;
//		
//		
//		age1  = inpute.nextInt();
//		System.out.println("first member");
//		age2 = inpute.nextInt();
//		System.out.println("second member");
//		age3= inpute.nextInt();
//		System.out.println("third member");
//		total = inpute.nextInt();
//		
//		
//		
//		
//	 System.out.println("your average is" age2+age2+age3/total);
//		
		
	//while loop statements
	
//		int count =0;
//		while (count<100)
//		{
//			System.out.println("welcome to java");
//			count++;
//		}
		
		
		
//	write a program that calculate and prints the average grade of 6 students.
//		Scanner inpute = new Scanner(System.in);
//		
//	
//		
//		int counter = 1;
//		int grade=0;
//		int sum = 0;
//		
//		 
//		while(counter<=5&&grade!=-1)
//		{
//			System.out.println(" enter your grades of students number "+ counter);
//			grade = inpute.nextInt();
//			sum+= grade;
//			counter++;
//			
//		}
//		
//		System.out.println(" average of the 5 grades is" + sum/5);
	
		
//		Write a program that asks how many houses you have, and how many keys each house has. 
//		Display the total number of house keys
	Scanner inpute = new Scanner(System.in);
	
	int house;
	int count;
	int keys;
	System.out.println(" How Many house Do you have");
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
