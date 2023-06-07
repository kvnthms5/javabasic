//Java Program to search the array and print its position in the array
package three;

import java.util.Scanner;

public class ArraySearch {
	
		public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.print("Enter Array size: ");
				int arrl=s.nextInt();
				int a[]=new int[arrl];
				int b[]=new int[arrl];
				System.out.println("Enter the numbers: ");
				for (int i=0;i<arrl;i++) {
				
					a[i]=s.nextInt();			
				}			
				System.out.print("Enter number to search for: ");
				int num=s.nextInt();
				System.out.println();
				int count=0;
				int j=0;
				for (int i=0;i<arrl;i++) {		//Check how many times num is present and its place position in array in new array
					if (num==a[i]) {
						count=count+1;
						b[j]=i+1;
						j++;
					}
				}
				if (count>0) {		//If array is present, print its frequency and its positions in the original array
					System.out.print("The '"+num+"' is found "+count+" times and the positions are ");
					for (int i=0;i<arrl;i++)
						if (b[i]!=0) {
							System.out.print(b[i]);
							if (b[i+1]==0)
								continue;
							System.out.print(", ");	
						}
				}
				else		//If array is not present, print this
					System.out.println("The '"+num+"' is NOT found in the array.");
		}
}