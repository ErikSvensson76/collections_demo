package org.example;

import org.example.model.Person;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Erik", LocalDate.parse("1976-09-11")));
        personSet.add(new Person("Nisse", LocalDate.parse("1986-09-11")));
        personSet.add(new Person("Ulf", LocalDate.parse("1989-09-12")));

        Set<Person> personTreeSet = new TreeSet<>(personSet);
        personTreeSet.add(new Person("Nils", LocalDate.parse("1944-05-17")));
        personTreeSet.add(new Person("Anna", LocalDate.parse("1968-07-24")));
        personTreeSet.add(new Person("Peter", LocalDate.parse("2020-01-06")));

        for(Person p : personTreeSet){
            System.out.println(p);
        }
    }

}
