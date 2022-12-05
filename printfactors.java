package basic;

import java.util.Scanner;

public class Primefactors {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("Enter the number");
		for(int i=2; i<n; i++) {
			while(n%i==0) {
				System.out.println(i+" ");
				n=n/i;
			}
		}
		if(n>2) {
			System.out.println(n);
		}
		

	}

}