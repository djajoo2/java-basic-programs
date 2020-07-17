
import java.io.*;

class File17{
	public static void main(String args[]){
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st Integer: ");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter 2nd Integer: ");
		int b=Integer.parseInt(br.readLine());
		int sum=a+b;
		System.out.println("Sum is "+sum);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}