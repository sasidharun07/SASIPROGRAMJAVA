package sasijava;
import java.util.*;
public class remove_duplacted_elements_inarray {

	public static void main(String[] args) 
	{        int a[] = {1,2,3,4,4,5,5};
    int c=0;
    
    List<Integer> ak = new ArrayList<>();
    for(int i=0;i<a.length;i++)
    {
         c=0;
        for(int j=0;j<i+1;j++)
        {
            if(a[i]==a[j])
            c++;
        }
        if(c==1)
        {
            ak.add(a[i]);
        }
    }
    
    System.out.print(ak);
}
}