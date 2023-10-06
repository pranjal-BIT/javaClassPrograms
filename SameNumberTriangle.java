import java.util.Scanner;
import java.io.*;

class SameNumberTriangle{
	public static void main(String[] args){
		int i, j, n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n = input.nextInt();
		


		for(i=1; i<=n; i++){
			for(j=1; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}