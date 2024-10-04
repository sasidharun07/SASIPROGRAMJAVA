package sasijava;
import java.util.*;
public class count_the_words
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String a = sc.nextLine();
        String ak[] = a.split(" ");
        int c=0;
        for(int i=0;i<ak.length;i++)
        {
            int l=0;
            for(int k=0;k<i+1;k++)
            {
                if(ak[i].equals(ak[k]))
                    l++;
            }
            if(l==1)
            {
             c=0;
                for(int j=0;j<ak.length;j++)
                {
                    if(ak[i].equals(ak[j]))
                    c++;
                }
        
        System.out.println(ak[i]+" : "+c);
            }
        }
	}

}
