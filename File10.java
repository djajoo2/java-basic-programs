/*Replace all the occurrence of a word "is" with "was" in a text file.
(word by word read)*/
import java.io.*;
import java.util.Scanner;
class File10{
	public static void main(String args[]){
		try(
			FileInputStream fis=new FileInputStream("C:/javafiles/File5.txt");
			Scanner sc=new Scanner(fis);
			FileOutputStream fos=new FileOutputStream("C:/javafiles/temp.txt");
			){
				String s1;
				while(true)
				{
					if(sc.hasNext())
						s1=sc.next();
					else
						break;
					if(s1.equals("is"))
						s1="was ";
					else
						s1+=" ";
					fos.write(s1.getBytes());
				}
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			File f1=new File("C:/javafiles/File5.txt");
			f1.delete();
			File f2=new File("C:/javafiles/temp.txt");
			f2.renameTo(f1);
	}
}