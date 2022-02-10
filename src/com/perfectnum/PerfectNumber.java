package com.perfectnum;
import java.util.Scanner;  


public class PerfectNumber {
	public static void perfectNum() {
		int sum = 0;
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		int perfNum = sc.nextInt();  
		int i=1;
		while(i <= perfNum/2) {  
			if(perfNum % i == 0) { 
				sum = sum + i;  
			}   
			i++ ;
		}  
		if(sum==perfNum) {  
			System.out.println(perfNum+" is a perfect number.");  
		} 
		else { 
			System.out.println(perfNum+" is not a perfect number.");
		}
		
	}

	public static void main(String[] args) {
		perfectNum();
		
	}  
}