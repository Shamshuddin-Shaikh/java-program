package DATA_STRUCTURE.Listts;

import java.util.*;
public class ExampleArrayList {
    public static void main(String[] args) {
         ArrayList<String> fruits = new ArrayList<String>();
         ArrayList<String> vegitabls = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banan");
        fruits.add("orange");
        System.out.println(fruits.get(1));
        fruits.remove("orange");
        vegitabls.add("kakdi");
        vegitabls.add("gajar");
        vegitabls.add("tomato");
        System.out.println(fruits);
        System.out.println(vegitabls);
        fruits.addAll(vegitabls);
        System.out.println(fruits);
        fruits.removeAll(vegitabls);
        System.out.println(fruits);



 
    MyArrayList<String,Integer> al = new MyArrayList<String,Integer>("shammi", 32);
    MyArrayList<Boolean,String> al2 = new MyArrayList<Boolean,String>(true ,"shammi");
    al.getDiscribtion();
    al2.getDiscribtion();
    }
}