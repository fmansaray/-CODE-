// Matt Halloway
// Faith Mansaray
// CSCI- A504
// Homework 6- Question 1 
// October 17th 2021

// Write a program that verifies if someone gave you a penny and then doubles that amount
// every day, by the end of 30 days you will be a millionaire. You do not need to display the
// answer in dollar amount, but you may if you wish. For full credit your program must use a FOR
// loop. Output should look like:


import java.util.Scanner;
import java.text.*;

public class PenniesForPay
{
	public static void main(String[] args)
	{
		int NumDays;
		double Amount = 0.01;
	    double Total_Amount = 0.01;
	    double total = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
	    // Decimal formating for salary variables
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		
		System.out.print("Enter the number of days worked: ");
		NumDays = keyboard.nextInt();
		
		// Input validation: Input must not be less than 1
	    while(NumDays < 1)
	    {
	    System.out.print("Enter the number of days worked: ");
		NumDays = keyboard.nextInt();
	    }
		
		// Display table header
		
		System.out.println(" Day    " +        " Amount   "); 
		System.out.println("-----   " +        " ------"); 
	
		//+ "Total_Amount");
		
		// Display number of days
		int Day = 1 ;
		
		for (Day = 1; Day <= NumDays; Day++)
        {
         System.out.println(Day + "     $" + df.format(Amount));
         Amount = Amount * 2;
         Total_Amount += Amount;
        }
    } 
}	


/*


Enter the number of days worked: 30
 Day     Amount   
-----    ------
1     $0.01
2     $0.02
3     $0.04
4     $0.08
5     $0.16
6     $0.32
7     $0.64
8     $1.28
9     $2.56
10    $5.12
11    $10.24
12    $20.48
13    $40.96
14    $81.92
15    $163.84
16    $327.68
17    $655.36
18    $1,310.72
19    $2,621.44
20    $5,242.88
21    $10,485.76
22    $20,971.52
23    $41,943.04
24    $83,886.08
25    $167,772.16
26    $335,544.32
27    $671,088.64
28    $1,342,177.28
29    $2,684,354.56
30    $5,368,709.12




*/
	

