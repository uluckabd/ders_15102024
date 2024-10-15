package ders1;

import java.util.Scanner;

public class ders1_2 {
	
	public static void main(String[] args)
	
	{
	Scanner input= new Scanner(System.in);
	
	int number1;
	int number2;
	int sum;
	
	System.out.print("enter first integer:");
	number1=input.nextInt();
	
	System.out.print("enter second integer:");
	number2=input.nextInt();
	
	sum=number1+number2;
	
	System.out.printf("sum is %d\n",sum);
	
	
	
	}
	
	
	

}
