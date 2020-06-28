// copy the content of a text file into another text file
//jdk1.7
import java.io.*;

class File5{
	public static void main(String args[]){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream("C:/javafiles/File1.txt");
			fos=new FileOutputStream("C:/javafiles/File2.txt");	
           		
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
		finally{
			try{
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}