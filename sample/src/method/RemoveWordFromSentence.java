//Java program to remove word(s) given by user from a sentence given by user.
package method;

import java.util.*;

import one.sample;

public class RemoveWordFromSentence {
	static Scanner s=new Scanner(System.in);
	
	void A(String array[]) {		//Method with array as argument
		String b;
		ArrayList la=new ArrayList();
		for (int i=0;i<array.length;i++) {
			la.add(array[i]);
		}	
		System.out.println("Enter word to remove= ");		//User enters word to remove
		b=s.next();
		for (int i=0;i<la.size();i++) {
			int ind=la.indexOf(b);
			if (ind!=-1)
				la.remove(ind);
		}
		System.out.print("New Sentence= ");
		Iterator itr=la.iterator();
		while (itr.hasNext())
			System.out.print(itr.next()+" ");
	}
	
	public static void main(String[] args) {
		RemoveWordFromSentence r=new RemoveWordFromSentence();
		System.out.print("Enter sentence= ");		//User enters word
		String a=s.nextLine();
		String words[]=a.split(" ");		//Sentence is split into the words as elements in string array words
		r.A(words);			//Calls the method A (with words array passed as argument to remove the words
	}
}
