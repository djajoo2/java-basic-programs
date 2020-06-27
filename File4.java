// copy the content of a text file into another text file

import java.io.*;

class File3{
	public static void main(String args[]){
		try{
			FileInputStream fis=new FileInputStream("C:/javafiles/File1.txt");
			FileOutputStream fos=new FileOutputStream("C:/javafiles/File2.txt");	
		
			byte b[]=new byte[10];
			int cnt;
			while((cnt=fis.read(b))!=-1){
				fos.write(b,0,cnt);
			}
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}