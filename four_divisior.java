package sasijava;

public class four_divisior {

	public static void main(String[] args)
	{
		 int nums[] = {21,4,7};
	        int sum =0 ;
	        for(int x:nums)
	        {
	            int c=0;
	            int s=0;
	            for(int i=1;i<=x;i++)
	            {
	                if(x%i==0)
	                {
	                    c++;
	                    s+=i;
	                }
	            }
	            if(c==4)
	            {
	                sum+=s;
	            }
	        }
	System.out.print(sum);
	    }
	}
