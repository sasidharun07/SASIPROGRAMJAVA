package SasiJava;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class Deserialdemo {

	public static void main(String[] args)throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/sasi.txt"));
		Stud obj = (Stud)ois.readObject();
		System.out.println(obj.id);
		System.out.println(obj.name);
		ois.close();

	}

}
