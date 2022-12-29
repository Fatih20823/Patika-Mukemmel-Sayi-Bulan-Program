package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int total=0,n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n = input.nextInt();
		
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				total +=i;
			}
		}
		
		if(total == n) {
			System.out.println(n+" is a perfect number");
		}else {
			System.out.println(n+" is not a perfect number");
		}

	}

}
