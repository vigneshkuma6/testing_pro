package arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,6,7,9,4,3};
Set<Integer>se=new HashSet<Integer>();
for(int i:a)
{
	se.add(i);
}
System.out.println(se);

	}

}
