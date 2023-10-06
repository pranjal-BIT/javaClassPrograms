import java.io.*;

class Fact{

	public static void main(String args[])
	throws IOException{
		int n=0; int i=0; int fact=1;

		System.out.print("Enter a Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		for(i=1;i<=n;i++){
			fact = fact*i;

		}
		System.out.println("Factorial is "+fact);
	}
}