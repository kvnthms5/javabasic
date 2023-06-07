package three;

import java.util.Scanner;

public class StringArrayPalindrome {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		System.out.print("Enter Array Size= "); 	//Array Size
		int arrl=s.nextInt();
		String a[]=new String[arrl];
		System.out.println("Enter words to check if palindrome: ");
		for (int i=0;i<arrl;i++)		//Entering words to check for
			a[i]=s.next();
		System.out.println("Palindrome words are: ");
		for (int i=0;i<arrl;i++) {
			int chl=0;
			char[] ch=a[i].toCharArray();
			for (char c:ch)
				chl++;
			int last=chl-1;
			int count=0;
			for (int j=0;j<chl/2;j++) {
				if (ch[j]==ch[last]) {
					count++;
				}
				last--;
			}
			if (count==chl/2)
				System.out.println(ch);
		}
	}
}