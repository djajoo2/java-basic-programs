import java.io.*;
class File16{
	public static void main(String args[])throws IOException ,FileNotFoundException{
		FileOutputStream fos=new FileOutputStream("a.txt");
		PrintStream ps=new PrintStream(fos,true);
		ps.println(5);
		ps.println(5.4f);
		ps.println("abc");
		ps.close();
		fos.close();
	}
}

 