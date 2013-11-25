package collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2    = new HashSet<String>();

        for (String a : args)
            if (!set1.add(a))
                set2.add(a);

        // Destructive set-difference
        set1.removeAll(set2);

        System.out.println("Unique words:    " + set1);
        System.out.println("Duplicate words: " + set2);
    }
}