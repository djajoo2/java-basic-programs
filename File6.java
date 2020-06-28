// copy the content of a text file into another text file
//jdk1.8
import java.io.*;

class File5{
	public static void main(String args[]){
		try(
			FileInputStream fis=new FileInputStream("C:/javafiles/File1.txt");
			FileOutputStream fos=new FileOutputStream("C:/javafiles/File3.txt");	){
           		
			byte b[]=new byte[10];
			int cnt;
			while((cnt=fis.read(b))!=-1){
				fos.write(b,0,cnt);
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}