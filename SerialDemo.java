package SasiJava;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Stud implements Serializable
{
	int id;
	String name;
	Stud(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}
public class SerialDemo {

	public static void main(String[] args)throws Exception {
		Stud s1 = new Stud(1001,"sasi");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/sasi.txt"));
		oos.writeObject(s1);
		System.out.println("serialization success");
		oos.close();
	}

}
