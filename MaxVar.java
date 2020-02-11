//use of var args to find max no

class MaxVar{
	static int max(int ...arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max)
			max=arr[i];
		}
		return max;
	}
	public static void main(String ...args){
		System.out.println("Max is "+max(5,9,3,6,2,35,6));
		System.out.println("Max is "+max(9,63,9,38,53,62,3));
	}
}