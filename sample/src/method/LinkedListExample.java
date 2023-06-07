package method;

import java.util.*;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		int e=0;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Check");
			System.out.println("4. Exit");
			System.out.print("Enter Option: ");
			int opt=s.nextInt();
			switch (opt) {
				case 1:
					System.out.print("Enter word to add= ");
					String input=s.next();
					l1.add(input);
					break;
				case 2:
					System.out.println("Size of array list= "+l1.size());
					System.out.print("Enter which position to remove= ");
					int p=s.nextInt();
					l1.remove(p-1);
					break;
				case 3:
					System.out.print("Enter word to check for= ");
					String w=s.next();
					if (l1.contains(w))
						System.out.println(w+" is found.");		
					break;		
				case 4:
					System.out.println("Exited.");
					e=1;
					break;
				default:
					System.out.println("Wrong input. Try again.");				
			}
		}
		while (e==0);
		System.out.print("Final Linked List= ");
		for (int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+", ");	
	}
}