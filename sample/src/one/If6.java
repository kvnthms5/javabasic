package one;

import java.util.Scanner;

public class If6 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number to check if Armstong= ");
		int a=s.nextInt();
		int b=a;
		int f=a;
		int digit=0;
		int sum=0;
		int add;
		int sing;
		for (;a>0;) {
			a=a/10;
			digit=digit+1;
		}
		int ogdigit=digit;
		int ogdigit2=digit;
		for (;b>0;) {
			sing=b%10;
			add=1;
			digit=ogdigit;
			for (;digit>0;) {
				add=add*sing;
				digit=digit-1;
			}
			System.out.print(add);
			if (ogdigit2>1) {
				System.out.print(" + ");
				ogdigit2=ogdigit2-1;
			}
			sum=sum+add;
			b=b/10;
		}
		System.out.println(" = "+sum);
 		if (sum==f)
			System.out.print("Hence it IS an armstrong number");
		else
			System.out.print("Hence it IS NOT an armstrong number");
	}

}