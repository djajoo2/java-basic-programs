class File11{
	public static void main(String args[]){
		Console con=System.console();
		try(
			FileReader fr1=new FileReader("C:/javafiles/country.txt");
			FileReader fr2=new FileReader("C:/javafiles/capital.txt");
			BufferedReader br1=new BufferedReader(fr1);
			BufferedReader br2=new BufferedReader(fr2);
			String country="",capital="",countrysearch;
			System.out.print("Enter Country To Search ");
			countrysearch=con.readLine();
			boolean found=false;
			while(true){
				country=br1.readLine();
				capital=br2.readLine();
				if(country==null)
					break;
				if(country.equalsIgnoreCase(countrysearch))
				{
					found=true;
					break;
				}
			}	
			if(found==true)
					
	}
}