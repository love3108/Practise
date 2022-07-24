package practice;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		//Suppose array size is 5
		int size=5;
		//suppose maximum value for an element can be 1000
		int ar[]=new int[1000];
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter elements : ");
		for(int i=0;i<size;i++)
		{
			int input=scan.nextInt();
			if(ar[input]!=0) {
				System.out.println("Array has duplicate element : "+input);
				flag=true;
			}
			ar[input]++;
		}
		if(flag==false)
		{
			System.out.println("Array has unique elements");
		}
	}

}
