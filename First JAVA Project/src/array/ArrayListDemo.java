package array;
import java.util.ArrayList;
//import java.util.List;
public class ArrayListDemo {
	public static void main(String []args) {
	// creating array list	
	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
    //adding values to list1
	list1.add(10);
	list1.add(20);
	list1.add(30);
	
	//adding values to list2
	list2.add(40);
	list2.add(50);
	list2.add(60);
	
	//adding whole list into another
	list1.addAll(list2);
	
	
    //changing 0 index value
	list1.set(0,200);
	
	//removing zero index from list 1
    list1.remove(0);
    
    //getting values from calling index number
    
    //System.out.println(list2.get(2)); 

    
    
	System.out.println("List 1:- "+list1+ '\n'+"List 2:- "+list2);

	
	}
}
