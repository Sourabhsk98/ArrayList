package com.ArraylistMethods;
import java.util.ArrayList;
public class ArrayList_addAll {
    public static void main(String[] args) {

        // create an arraylist
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        System.out.println("Languages: " + languages);

        // create another arraylist
        ArrayList<String> programmingLang = new ArrayList<>();

        // add all elements from languages to programmingLang
        programmingLang.addAll(languages);

        System.out.println("Programming Languages: " + programmingLang);
    }

}
