package ders1;

import java.util.Scanner;

public class ders1_6 {

	public static void main(String[] args) 
	
	{Scanner input= new Scanner(System.in);
	
	float boy;
	float kilo;
	float bmi;
	
	System.out.print("lutfen boyu metre cinsinden giriniz");
	boy=input.nextFloat();
	
	System.out.print("lutfen kilonuzu tam sayi olarak girinz ");
	kilo=input.nextFloat();
	
	bmi=kilo/(boy*boy);
	
	
	if( bmi <= 18.5)
		System.out.printf("zayif");
	else if(18.5<bmi && bmi<=25)
		System.out.printf("orta");
	else if(25<bmi && bmi<=30)
		System.out.printf("sisman");
	else if(30<bmi)
		System.out.printf("obez");
		
	
	

	
	
		
		
		

	}

}
