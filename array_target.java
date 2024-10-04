package sasijava;

public class array_target {

	public static void main(String[] args) {
		int target  = 24;
		int a[] = {12,12,23,15,20,45,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] + a[j] == target)
				{
				System.out.println("the num "+a[i]+" , "+a[j]+" is equals to target "+target);
				break;
				}
			}
		}
	}

}
