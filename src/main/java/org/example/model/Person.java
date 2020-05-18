package org.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private static int counter = 0;
    private int personId;
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.personId = ++counter;
        setName(name);
        setBirthDate(birthDate);
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId &&
                Objects.equals(name, person.name) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return birthDate.compareTo(o.getBirthDate());
    }
}
