// merge the content of a two text file into another text file using sis
import java.io.*;

class File5{
	public static void main(String args[]){
		try(
			FileInputStream fis1=new FileInputStream("C:/javafiles/File1.txt");
			FileInputStream fis2=new FileInputStream("C:/javafiles/File2.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			FileOutputStream fos=new FileOutputStream("C:/javafiles/File4.txt");	){
           		
			byte b[]=new byte[10];
			int cnt;
			while((cnt=sis.read(b))!=-1){
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