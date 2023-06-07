//Java program to find the vowels and vowel count from each string in a string array
package method;

import java.util.Scanner;

public class VowelsFromArray {

	void vowels(char array[]) 
	{
		int chl=0;
		for (char c:array)
			chl++;
		char vowel[]={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};		//Taking vowels in an array to compare it later with the letters of the word
		int count =0;
		char yvowel[]=new char[chl];		//Iniliazing the yvowel which will contain the vowels that are present in the word
		System.out.println();
		System.out.print("The vowels of '");
		int k=0;		//k will iterate to keep the vowels in the yvowel char array
		for(int i=0;i<chl;i++) {
			System.out.print (array[i]);
			for (int j=0;j<10;j++)
				if (array[i]==vowel[j]) {
					count++;		//count keeps track of how many vowels are present
					yvowel[k]=array[i];		//yvowel will keep the vowels that are present in the word
					k++;
				}
		}
		System.out.print("' count is "+count);
		if (count!=0)		//if the count is 0 there is no vowels to print
			System.out.print(" and they are ");
		for (int i=0;i<chl;i++) {		//printing the yvowels char array with loop
			if (yvowel[i]==0 )		//avoiding printing yvowel[i] and , if null in yvowel
				continue;
			System.out.print(yvowel[i]);	
			if(yvowel[i+1]==0)		//avoiding printing , if i is the last non null value
				continue;
			System.out.print(", ");
		}
	}

	public static void main(String[] args) {
		VowelsFromArray z=new VowelsFromArray();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size= ");
		int arrl=s.nextInt();
		String arr[]=new String[arrl];
		System.out.println("Enter words to check vowels= ");
		for (int i=0;i<arrl;i++)		//Entering words
			arr[i]=s.next();			
		for (int i=0;i<arrl;i++) {		//Selecting words one by one and making it character array ch
			char[] ch=arr[i].toCharArray();
			z.vowels(ch);		//Calling vowels method with char array ch as arugment
		}
	}
}