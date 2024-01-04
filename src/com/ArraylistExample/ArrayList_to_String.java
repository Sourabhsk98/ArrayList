package com.ArraylistExample;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Set;

public class ArrayList_to_String {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        System.out.println("ArrayList: " + languages);

        // convert ArrayList into a String
        String str = languages.toString();
        System.out.println("String: " + str);
    }
}
