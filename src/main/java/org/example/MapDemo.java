package org.example;

import org.example.model.Person;

import java.time.LocalDate;
import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        Person person = new Person("Erik", LocalDate.parse("1976-09-11"));
        Person person2 = new Person("Ulf", LocalDate.parse("1986-07-03"));
        Person person3 = new Person("Simon", LocalDate.parse("1999-04-27"));

        map.put(person.getPersonId(), person);
        map.put(person2.getPersonId(), person2);
        map.put(person3.getPersonId(), person3);

        for(Integer key : map.keySet()){
            System.out.println(map.get(key));
        }

        Map<Character, List<String>> listMap = new HashMap<>();

        List<String> aNames = new ArrayList<>(Arrays.asList(
                "Ali", "Alice", "Anders", "Alica"
        ));


        listMap.put('a', aNames);

        System.out.println(listMap.get('a'));


    }

}
