package imperaitive;

import Model.Gender;
import Model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<Person>(Arrays.asList(
                new Person("Alice", Gender.Female),
                new Person("pooja",Gender.Female),
                new Person("John",Gender.Male),
                new Person("vic",Gender.Male),
                new Person("Debra",Gender.Female),
                new Person("Bruce",Gender.Male)

        ));

        List<Person> females=new ArrayList<Person>();
        for (Person person:people){
            if(person.getGender().equals(Gender.Female)){
                females.add(person);
            }
        }
        for (Person person:females){
            System.out.println(person.getName());
        }
    }
}
