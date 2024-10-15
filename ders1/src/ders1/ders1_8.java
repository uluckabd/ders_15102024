package ders1;

import java.util.Scanner;

public class ders1_8 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int sayi;
		
		
		System.out.print("lutfen tersi alinacak sayiyi giriniz");
		sayi=input.nextInt();
		int tersSayi=0;
		
		while(sayi!=0) {
			int basamak= sayi%10;
			tersSayi=tersSayi*10+basamak;
		     sayi /= 10; }
		
		
		    System.out.println("girilen sayinin tersi:" + tersSayi);
			

	}

}
