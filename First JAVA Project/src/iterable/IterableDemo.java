package iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Make a collection
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("bugatti");
      cars.add("Mazda");
    
      // Get the iterator
      Iterator<String> it = cars.iterator();
      
      // Loop through a collection
      while(it.hasNext()) {
        System.out.println(it.next());
      }

}

}
