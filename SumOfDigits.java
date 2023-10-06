import java.io.*;
import java.util.Scanner;

class SumOfDigits{
	public static void main(String args[])
	throws IOException{
		int n; int sum=0; int r=0;

		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while(n>0){
			r = n%10;
			sum = sum+r;
			n = n/10;
		}
		System.out.println("Sum of Digits is "+sum);
	
	}
}
