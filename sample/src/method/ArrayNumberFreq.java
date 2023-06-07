package method;

import java.util.Scanner;

public class ArrayNumberFreq {
	
	void Freq (int length,int array[]) {
		System.out.print("Frequency in ");
		for (int i=0;i<length;i++)		//Number entered by user displayed
			System.out.print(array[i]);
		System.out.println(":");		//: displayed only once
		for (int i=0;i<length;i++) {		//Looping that array
			int count=1;
			for (int j=i+1;j<length;j++)		//Comparing that number with the rest of the array to check its frequency (using count)
				if(array[i]==array[j]) {
					count++;
					array[j]='0';		//Using this so the same numbers after the first one is not printed in the output
				}
			if (array[i]!='0')
				System.out.println("'"+array[i]+"' -- "+count);
		}
	}
	
	public static void main(String[] args) {
		ArrayNumberFreq z=new ArrayNumberFreq();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array size= ");		//Array size
		int arrl=s.nextInt();
		int arr[]=new int[arrl];		//Array initialized with the array size
		System.out.println("Enter the numbers to check frequency=");		//Enter the numbers in the array
		for (int i=0;i<arrl;i++)
			arr[i]=s.nextInt();
		z.Freq(arrl, arr);		//Freq method called
	}
}