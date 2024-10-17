package SasiJava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	/*	File f1= new File("d:/test.txt");
		FileInputStream fis = new FileInputStream(f1);
		System.out.println(f1.length());
		for(int i=0;i<f1.length();i++)
		{
			System.out.print((char)fis.read());
		}*/
		File f1= new File("d:/test.txt");
		String data = "My name is sasidharun all the best";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes());
		fos.close();

	}

}
