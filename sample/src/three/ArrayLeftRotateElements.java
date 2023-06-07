//Java Program to left rotate the elements of an array
package three;

import java.util.Scanner;

public class ArrayLeftRotateElements {

	public static void main(String[] args) {
		System.out.print("Enter how many times to rotate= ");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]= {1,2,3,4,5,6};
		int temp;
		System.out.println("Original Array: ");
		for (int i=0;i<6;i++)	//Original array print
				System.out.print(arr[i]+"   ");
		for (int i=1;i<=n;i++) {	//Number of times to rotate
			temp=arr[0];
			for (int j=0;j<5;j++) {		//Shifting all elements once to the left
				arr[j]=arr[j+1];
			}
			arr[5]=temp;
		}
		System.out.println();
		System.out.println();
		System.out.println("Array after left rotation: ");
		for (int i=0;i<6;i++) {		//New array print
			System.out.print(arr[i]+"   ");
		}

	}
}
