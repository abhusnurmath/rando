package collections;

import java.util.*;
 
public class ConcurrentExceptionExample {
 
    public static void main(String args[]){
        List<String> myList = new ArrayList<String>();
         
        myList.add("ar");
        myList.add("bh");
        myList.add("us");
         
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            if(value.equals("ar")) 
                myList.remove(value);
        }
      
    }
}