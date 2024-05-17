package arrayprograms;

public class LargestNumberInArray {

	// public static int largestNumber(int a[])
	// {
	// int largest=a[0];
	// for(int i=1;i<a.length;i++)
	// {
	// if(largest<a[i])
	// {
	// largest=a[i];
	// }
	// }
	//
	// return largest;
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 23, 45, 98, 12, 95, 32 };
		// System.out.println("The largest number is "+largestNumber(a));
		int largest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (largest < a[i]) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}

}
