package three;

import java.util.Scanner;

public class StringArrayLetterFreq {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size= ");		//Enter array size
		int arrl=s.nextInt();
		String a[]=new String[arrl];
		System.out.println("Enter words to check letter frequency= ");		//Enter words to check
		for (int i=0;i<arrl;i++)
			a[i]=s.next();
		for (int i=0;i<arrl;i++) {		//Selecting words one by one
			System.out.println();
			System.out.print("'"+a[i]+"' has  ");
			int chl=0;
			char[] ch=a[i].toCharArray();	//Putting that word into array
			for (char c:ch)		//Finding length of that array(word)
				chl++;
			for (int j=0;j<chl;j++) {		//Looping that word with letter one by one
				int count=1;
				for(int k=j+1;k<chl;k++) {		//Checking that letter with the rest of the letters in the word
					if (ch[j]==ch[k]) {
						count++;
						ch[k]='0';
					}				
				}
				if (ch[j]!='0') {		//Print how many times the letter is present and dont print for that letter again
					System.out.print(count+" '"+ch[j]+"'");
					if (j==chl-1)		//Avoiding the comma after the last letter in each word
						continue;
					int z=0;		//Avoiding comma after last letter for words like goatt where last letter is already '0'.  FROM HERE
					for(int k=j;k<chl;k++)
						if (ch[k]=='0')
							z++;
					if(z==(chl-1)-j)
						continue;																							   //TILL HERE
					System.out.print(",   ");
				}
			}
		}
	}
}