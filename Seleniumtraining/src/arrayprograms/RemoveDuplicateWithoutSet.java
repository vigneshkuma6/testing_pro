package arrayprograms;


import java.util.Arrays;

public class RemoveDuplicateWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,6,7,9,4,3};
		int n=a.length;
		String empty="";
		String s=Arrays.toString(a);
		for(int i=0;i<s.length();i++)
		{
			if(!empty.contains(String.valueOf(s.charAt(i))))
			{
				empty=empty+s.charAt(i);
			}
		}
		
		System.out.println(empty);
			}

}
