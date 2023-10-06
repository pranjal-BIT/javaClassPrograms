import java.io.*;
import java.util.Scanner;

class ReverseNumber{
	public static void main(String args[])
	throws IOException{
		int n; int r=0; int rev=0;
		
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(n>0){
			r = n%10;
			//rev = (rev*10)+r;
			System.out.print(r);
			n = n/10;
		}
		//System.out.println("Reverse of the Number is "+rev);
	
	}

}
