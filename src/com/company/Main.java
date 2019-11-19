package com.company;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>() {
        };
        list.add("Cat");
        list.add("Dog");
        list.add("Crow");
        list.add("Mouse");
        list.add("Giraffe");
        list.add("Crocodile");
        System.out.println(list.toString());
        list.remove("Cat");
        System.out.println(list.toString());


        list.remove(1);
        System.out.println(list.toString());


        list.contains("Cat");
        System.out.println(list.toString());

        System.out.println(list.size());


        list.clear();
        System.out.println(list.toString());
    }
}