package org.example;


import org.example.model.Person;
import org.example.util.PersonComparator;

import java.time.LocalDate;
import java.util.*;

public class ArrayListDemo
{
    public static void main( String[] args )
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Erik Svensson", LocalDate.parse("1976-09-11")));
        people.add(new Person("Nisse Nys", LocalDate.parse("1986-09-11")));
        people.add(new Person("Ulf B", LocalDate.parse("1989-09-12")));
        people.add(new Person("Erik O", LocalDate.parse("1976-09-11")));

        //Collections.sort(people);
        Comparator<Person> comparator = new PersonComparator();
        people.sort(comparator);



        for(Person p : people){
            System.out.println(p);
        }



        List<Integer> ints = new ArrayList<>();
    }
}
