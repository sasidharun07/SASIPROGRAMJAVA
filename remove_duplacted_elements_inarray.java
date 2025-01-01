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
/*
import java.util.*;

public class MyJava {
    public static void main(String args[]) {
        // Predefined array
        int nums[] = {121,121, 2, 12, 24, 2, 4, 34, 35, 34, 23, 22};
        int i = 1; // Counter for unique values

        // Check if the array is empty
        if (nums.length == 0) {
            System.out.println("No values in the array.");
        }

        // Iterate through the array to filter duplicates
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Display the result
        System.out.print("Unique values: ");
        for (int k = 0; k < i; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
*/
