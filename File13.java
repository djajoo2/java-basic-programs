import java.io.*;
import java.util.Date;

class File13{
	public static void main(String args[])throws IOException{
		File f1=new File("/javaprog/io/a.txt");
		f1.setReadOnly();
		System.out.println(new Date(f1.lastModified()));
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.length());
		
		File f2=new File("/javaprog/io/aaaa.txt");
		if(!f2.exists())
			f2.createNewFile();
			
		File f3=new File("pack");
		f3.mkdir();
		System.out.println(f3.isFile());
		System.out.println(f3.isDirectory());
		
		File f4=new File("../p1/p2/p3");
		f4.mkdirs();
		System.out.println(f1.isAbsolute());
		
		File f5=new File("../p1/p2/p3/z.txt");
		f5.createNewFile();
		System.out.println(f5.getCanonicalPath());
		System.out.println(f5.getPath());
		System.out.println(f5.getAbsolutePath());
		
		File f6=new File("c:/javaprog");
		//File f6=new File("c:/javaprog/A.class");
		String s[]=f6.list();//returns null if f6 is file
		for(String n:s){//NullPointerException if list returns null
			System.out.print(n+"\t");
			File f7=new File("C:/javaprog"+n);
			if(f7.isFile())
				System.out.println("Is a file");
			else
				System.out.println("Is a Directory");
		}
	}
}