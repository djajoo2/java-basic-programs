// open existing file read its content and display on screen

import java.io.*;

class File3{
	public static void main(String args[]){
		try{
			FileInputStream fis=new FileInputStream("C:/javafiles/File1.txt");
		/*	
			int n=fis.read();
			while(n!=-1){
				System.out.print((char)n);
				n=fis.read();
			}
	    */
	    /*
	    int n;
	    while((n=fis.read())!=-1){
				System.out.print((char)n);
			}
			*/
		/*	byte b[]=new byte[10];
			int cnt=fis.read(b);
			while(cnt!=-1){
				System.out.print(new String(b,0,cnt));
				cnt=fis.read(b);
			}
		*/	
		
			byte b[]=new byte[10];
			int cnt;
			while((cnt=fis.read(b))!=-1){
				System.out.print(new String(b,0,cnt));
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