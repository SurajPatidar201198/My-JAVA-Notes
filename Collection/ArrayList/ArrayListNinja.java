import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNinja {
    public static void main(String[] args) {
        // create a arraylist
        ArrayList<String> a1 = new ArrayList<>();

        //add elements to arraylist
        a1.add("Suraj");
        a1.add("Zampa");
        a1.add("Krishna");
        a1.add("Prita");
        

        //beautiful way of adding element in arraylist
        a1.add(1,"AddedByIndex");

        //remove element from arraylist
        a1.remove("Suraj");  //removes  first occurence of "suraj" from the list

        //update an element in an arraylist

        a1.set(2, "Name_Updated");

        //lets know the index of a a particular string object
        System.out.println(a1.indexOf("Suraj"));

        //contains() method
        System.out.println(a1.contains("Zampa"));

        //get index of last occurence of element
        System.out.println(a1.lastIndexOf("Prita"));

        // print the arraylist
        System.out.println(a1);

        //find the size of the arrayList
        System.out.println(a1.size());

        //using for each to print
        for(String s:a1)
        {
            System.out.println(s);
        }

        //sort an arraylist
        Collections.sort(a1);
        System.out.println(a1);

        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1);
    
        //clear is a beutiful method
        a1.clear(); 

        // print the arraylist
        System.out.println(a1);     //empty arraylist will be printed
    }
}
