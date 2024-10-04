package sasijava;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.*;
public class date
{
	public static void main(String[] args) 
	{
		LocalDate myjava = LocalDate.now();
		LocalTime myja = LocalTime.now();
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println(myjava);
		System.out.println(myja);
		System.out.println(myObj);		

	}
}