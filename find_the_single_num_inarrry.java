package sasijava;
public class find_the_single_num_inarrry 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,1,2,3,4,5};
		int r=0;
		
		for(int i=0;i<a.length;i++)
		{
			int flag = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					flag++;
				}
			}
			if(flag == 1)
			{
				r= a[i];
			}
		}
		System.out.println(r);
	}
}
