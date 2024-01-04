package com.ArraylistMethods;
import java.util.ArrayList;
public class ArrayList_replaceAll {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        // replace all elements to uppercase
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}
