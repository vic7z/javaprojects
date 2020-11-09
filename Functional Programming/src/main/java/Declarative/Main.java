package Declarative;

import Model.Gender;
import Model.PeopleList;
import Model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        PeopleList people = new PeopleList();

        List<Person> female = people.getPeople()
                .stream()
                .filter(person -> person.getGender().equals(Gender.Female))
                .collect(Collectors.toList());

        female.forEach(person -> System.out.println(person.getName()));
    }
}
