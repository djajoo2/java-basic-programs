//open some existing file and append some text in it
import java.io.*;

class File1{
	public static void main(String args[]){
		try{
			File f=new File("C:/javafiles/file1.txt");
			FileOutputStream fos=new FileOutputStream(f,true);
			fos.write(" jajoo".getBytes());
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