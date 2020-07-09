import java.util.Scanner;
import java.io.*;
class File12{
	public static void main(String args[])throws IOException,FileNotFoundException{
		
			FileInputStream fis1=new FileInputStream("c:/javafiles/numbers.txt");
			Scanner sc=new Scanner(fis1);
			FileOutputStream fos1=new FileOutputStream("c:/javafiles/nosort.txt"); 
				int cnt=0;
				while(true){
					String s1;
					if(sc.hasNextLine()){
						s1=sc.nextLine();
					}
					else
						break;
					cnt++;
				}
				fis1.close();
				fos1.close();
				int a[]=new int[cnt];
			
			FileInputStream fis=new FileInputStream("c:/javafiles/numbers.txt");
			sc=new Scanner(fis);
			FileOutputStream fos=new FileOutputStream("c:/javafiles/nosort.txt");
		
		    	int l=0;
				while(true){
					if(sc.hasNextInt()){
						a[l]=sc.nextInt();
						l++;
					}
					else
						break;
				}
		    	for(int i=0;i<a.length-1;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]>a[j])
						{
							int t;
							t=a[i];
							a[i]=a[j];
							a[j]=t;
						}
					}
				}
		    	for(int k=0;k<a.length;k++)
				{
					fos.write((a[k]+"").getBytes());
					fos.write("\r\n".getBytes());
					//System.out.println(a[k]);
				}
			fis.close();
			fos.close();
	}
}