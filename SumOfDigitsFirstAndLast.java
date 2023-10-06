import java.io.*;
import java.util.Scanner;

class SumOfDigitsFirstAndLast{
	public static void main(String args[])
	throws IOException{
		int n; int sum=0; int r=0; int first=0; int last=0;

		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		last = n%10;
		while(n>0){
			r = n%10;
			first = r;
			n = n/10;
		}
		sum = first+last;
		System.out.println("Sum of First and Last Digits is "+sum);
	
	}
}