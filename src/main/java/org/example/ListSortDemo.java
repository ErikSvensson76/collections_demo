package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Negar");
        names.add("Michelle");
        names.add("Tobias");
        names.add("Martin");
        names.add("Patrik");
        names.add("Mattias");
        names.add("Ameer");

        System.out.println("Before sort: " + names);

        Collections.sort(names);

        System.out.println("After sort: " + names);


    }
}
