package sasijava;
public class emp
{
   String empname;
   String empadd;
   public emp()
   {
      empname = "sasi";
      empadd = "717823p351";
   }
   public void display()
   {
      System.out.println("employee name : "+empname);
      System.out.println("employee address : "+empadd);
   }

public static void main(String[] args)
{
   emp newemp = new emp();
   newemp.display();
}
}
