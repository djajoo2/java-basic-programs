// use of var args ..

class ArrayArgument{
	static int sum(int ...arr){
		int s=0;
		for(int i=0;i<arr.length;i++){
			s+=arr[i];
			}
        return s;
		}
	public static void main(String ...args){
		
		int n1[]={5,6,7};
		int ans1=sum(n1);
		System.out.println("sum is " +ans1);
	    int n2[]={5,9,3,6,7};
		int ans2=sum(n2);
		System.out.println("sum is " +ans2);
	}
}