package ders1;

import java.util.Scanner;

public class ders1_4 {

	public static void main(String[] args) {
		
		
			
			
			{
			Scanner input= new Scanner(System.in);
			
			int number1;
			int number2;
			int toplam;
			int fark;
			int carpim;
			int bolum;
			System.out.print("enter first integer:");
			number1=input.nextInt();
			
			System.out.print("enter second integer:");
			number2=input.nextInt();
			
			toplam=number1+number2;
			fark=number1-number2;
			carpim=number1*number2;
			bolum=number1/number2;
			
			
			System.out.printf("toplam : %d\n",toplam);
			System.out.printf("fark: %d\n",fark);
			System.out.printf("carpim: %d\n",carpim);
			System.out.printf("bolum:  %d\n",bolum);
			
			
			
			}
			
			
			

		}

	}


