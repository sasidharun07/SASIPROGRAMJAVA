package sasijava;

public class find_common_number {

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,4,3,2,4,6};
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int k=0;k<i+1;k++)
			{
				if(a[i]==a[k])
					c++;
			}
			if(c==1)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						System.out.print(a[i]+" ");
					}
				}
			}
		}
	}

}
