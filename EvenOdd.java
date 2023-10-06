import java.io.*;

class EvenorOdd{
	public static void main(String args[])
	throws IOException{
		int n=0;

		System.out.print("Enter a Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		if(n%2==0){
			System.out.println("It is Even.");

		}else{
			System.out.println("It is Odd.");
		}
	}
}