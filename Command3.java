// sorting of array usng command line argument

class Command3{
	public static void main(String args[])
	{
		int n=args.length;
		float m[]=new float[n];
		for (int i=0;i<args.length;i++)
		{
			m[i]=Float.parseFloat(args[i]);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(m[i]>m[j])
				{
					float t=m[i];
					m[i]=m[j];
					m[j]=t;
				}
			}
		}
		for(float e:m)
			System.out.print(e+"\t");
	}
}