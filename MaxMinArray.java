import java.io.*;
import java.util.Scanner;

class MaxMinArray{

	int arr[] = new int[5]; int i; int idx;

	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements of the Array: ");
		for(i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
	}

	public void display(){
		System.out.println("The Elements of the Array are: ");
		for(i=0; i<5; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public void max(){
		int max = arr[0];
		for(i=0; i<5; i++){
			if(arr[i]>max){
				max = arr[i];
				idx = i;
			}
		}
		System.out.println("The Maximum Element of the Array is: "+max);
		System.out.println("The Index of the Maximum Element of the Array is: "+idx);
	}

	public void min(){
		int min = arr[0];
		for(i=0; i<5; i++){
			if(arr[i]<min){
				min = arr[i];
				idx = i;
			}
		}
		System.out.println("The Minimum Element of the Array is: "+min);
		System.out.println("The Index of the Minimum Element of the Array is: "+idx);
	}

	public static void main(String[] args){
		MaxMinArray mma = new MaxMinArray();
		mma.input();
		mma.display();
		mma.max();
		mma.min();
	}



}