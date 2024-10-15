package ders1;

import java.util.Scanner;

public class ders1_5 {

	public static void main(String[] args) {
		
		
		{
			Scanner input= new Scanner(System.in);
			int sayi;
			
			System.out.print("5 basamakli sayi giriniz:");
			sayi=input.nextInt();
			
			int bir;
			int on;
            int yuz;
            int bin;
			int onbin;
			
			onbin=(sayi/10000)%10;
			bin=(sayi/1000)%10;
			yuz=(sayi/100)%10;
			on=(sayi/10)%10;
			bir=(sayi %10);
			
			
			System.out.printf("onbin:  %d\n",onbin);
			System.out.printf("bin:  %d\n",bin);
			System.out.printf("yuz: %d\n",yuz);
			System.out.printf("on: %d\n",on);
			System.out.printf("bir : %d\n",bir);
			
			
			
			

	}
	}
}


