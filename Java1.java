package com.sangamone;

import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int limit1=sc1.nextInt();
		System.out.print("Enter the lower limit: ");
		int limit2=sc1.nextInt();
		for(int i=limit2;i<limit1;i++) {
			System.out.println(i*i);
		}
	}

}
