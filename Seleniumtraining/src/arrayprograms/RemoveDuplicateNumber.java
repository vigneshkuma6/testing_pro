package arrayprograms;

public class RemoveDuplicateNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,3,4,8,9,4,3};
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
					{
						a[j]=visited;
					}
				}
				System.out.print(a[i]+" ");
			}
			
		}
		}

}
