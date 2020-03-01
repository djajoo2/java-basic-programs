import java.util.Random;

class Lotery{
	public static void main(String args[]){
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			System.out.println((i+1)+" lotery no : ");
			System.out.println(r.nextInt(1000)+1);
		}
	}
}