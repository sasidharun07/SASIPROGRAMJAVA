package sasijava;// Abstract class
abstract class Sunstar
{
    abstract void printInfo();
}
class Employee extends Sunstar 
{
    void printInfo()
    {
        String name = "sakthivel.s";
        int age = 21;
        float salary = 222.2F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
 class abstractclass {
    public static void main(String args[])
    {
        Sunstar s = new Employee();
        s.printInfo();
    }
}