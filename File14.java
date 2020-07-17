import java.io.*;
class File14{
	public static void main(String args[])throws IOException{
		FileInputStream fis=new FileInputStream("C:/javaprog/io/a.txt");
		PushbackInputStream pis=new PushbackInputStream(fis);
		char ch;
		ch=(char)pis.read();
		System.out.println(ch);
		ch=(char)pis.read();
		System.out.println(ch);
		pis.unread(ch);
		ch=(char)pis.read();
		System.out.println(ch);
		pis.close();
		fis.close();
	}
}