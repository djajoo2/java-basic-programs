import java.io.*;  
class Student implements Serializable{  
	int id;  
	String name;  
	transient int age;//Now it will not be serialized  
	Student(int id, String name,int age) {  
		this.id = id;  
		this.name = name;  
		this.age=age;  
 	}  
}  
//Serialize
class PersistExample{  
	public static void main(String args[])throws Exception{  
		Student s1 =new Student(211,"ravi",22); 
		FileOutputStream fos=new FileOutputStream("f.txt");  
		ObjectOutputStream oos=new ObjectOutputStream(fos);  
		oos.writeObject(s1);  
  		oos.close(); 
  		fos.close();  
 	}  
}  
//DeSerialize
class DePersist{  
	public static void main(String args[])throws Exception{  
  		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f.txt"));  
  		Student s=(Student)ois.readObject();  
  		System.out.println(s.id+" "+s.name+" "+s.age);  
  		ois.close();  
 	}  
}