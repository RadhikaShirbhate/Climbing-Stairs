package Test;

import java.util.Scanner;

public class ClimbingStair 
{
	
	public static int climbstair(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		
		int[] a= new int[n+1];
		a[1]=1;
		a[2]=2;
		
		for(int i=3;i<=n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		return a[n];
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Climbing Stairs number : ");
		int n = sc.nextInt();
		System.out.println("Number of ways to climb " + n + " stairs: " + climbstair(n));
		sc.close();
	}

}
