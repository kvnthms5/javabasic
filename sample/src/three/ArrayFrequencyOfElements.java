//Program to find the frequency of each element in the array with second array
package three;

public class ArrayFrequencyOfElements {
	
	public static void main(String[] args) {
		int a[]={1,8,2,3,3,2,3};
		int count;
		int ch;
		for (int i=0;i<7;i++) {
			count=0;
			ch=0;
			for (int j=0;j<7;j++) {		//Check how many times that element is present
				if (a[i]==a[j]) {
					count++;
				}
			}
			for (int k=i;k>=0;k--) {	//Check if that element was already printed before
				if (a[k]==a[i])
						ch++;
			}
			if (ch>1)	//Using flag print if element not already printed before
				continue;
			else
				System.out.println(a[i]+" is present "+count+" times.");
		}
	}
}