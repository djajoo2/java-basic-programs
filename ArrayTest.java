//array program using class

import java.util.Scanner;
class Array{
	private int a[],n;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size :");
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter element "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
	}
	
	void setdata(int ...x){
		a=x;
		n=x.length;
	}
	
	void sort(){
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++)
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
	}
	
	void reverse(){
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			int t;
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
	
	void display(){
		for(int e:a)
			System.out.print(e+"\t");
		System.out.println();
	}
}

class ArrayTest{
	public static void main(String args[]){
		Array a1=new Array();
		a1.getdata();
		//a1.setdata(5,4,3,9,35,4);
		a1.sort();
		a1.display();
		a1.reverse();
		a1.display();
	}
}