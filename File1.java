//create a file and write some text in it
import java.io.*;

class File1{
	public static void main(String args[]){
		try{
			FileOutputStream fos=new FileOutputStream("C:/javafiles/file1.txt");
			fos.write("dinesh".getBytes());
			fos.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}