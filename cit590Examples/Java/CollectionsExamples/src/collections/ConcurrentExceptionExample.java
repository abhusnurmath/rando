package collections;

import java.util.*;
 
public class ConcurrentExceptionExample {
 
    public static void main(String args[]){
        List<String> myList = new ArrayList<String>();
         
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
         
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            //you cannot iterate and remove at the same time
            if(value.equals("3")) myList.remove(value);
        }
         
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                //myMap.put("4", "4");
            }
        }
 
    }
}