package com.ArraylistMethods;
import java.util.ArrayList;
public class ArrayList_removeAll {
    public static void main(String[] args){

        // create an arraylist
        ArrayList<String> languages = new ArrayList<>();

        // add elements to arraylist
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements from arraylist
        languages.removeAll(languages);
        System.out.println("ArrayList after removeAll(): " + languages);
    }
}
