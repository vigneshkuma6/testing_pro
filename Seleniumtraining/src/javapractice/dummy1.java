package javapractice;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class dummy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date date=new Date();

	
	System.out.println(date.toString());
	int a[]= {1,2,3};
	
	
	List<Integer>li=Arrays.asList(1,2,3);
//	li.add(1);
//	li.add(3);
	
	System.out.println(li);
	List<Integer>li1=Arrays.asList(1,2,3);
	Iterator<Integer>it=li.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}