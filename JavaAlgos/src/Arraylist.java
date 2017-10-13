/*import java.util.*;
public class Arraylist {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("ashutosh");
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		 //Using foreach
		  
		  for(String obj:al)  
			    System.out.println(obj);  
			 }  
		  
		/* 
		 * Using Iterator
		 *  Iterator itr= al.iterator();  
		  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  // //
		
	}

*/
import java.util.*;  
class Arraylist {  
int id;  
String name,author,publisher;  
int quantity;  
public Arraylist(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  

public static void main(String[] args) {  
    //Creating list of Arraylists  
    List<Arraylist> list=new ArrayList<Arraylist>();  
    //Creating Arraylists  
    Arraylist b1=new Arraylist(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Arraylist b2=new Arraylist(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Arraylist b3=new Arraylist(103,"Operating System","Galvin","Wiley",6);  
    //Adding Arraylists to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
  /*Traversing list  
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  */

    //Traversing list  
    Iterator<Arraylist> itr =list.iterator();
    	while(itr.hasNext()){
    		Arraylist b=(Arraylist)itr.next();
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    	}
}  
}