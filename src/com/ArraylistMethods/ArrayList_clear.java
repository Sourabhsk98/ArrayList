package com.ArraylistMethods;
import java.util.ArrayList;
public class ArrayList_clear {
    public static void main(String[] args){

        // create an arraylist
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements
        languages.clear();
        System.out.println("ArrayList after clear(): " + languages);
    }

}
