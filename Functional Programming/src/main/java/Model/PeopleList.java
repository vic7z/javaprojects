package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleList {
    List<Person> people=new ArrayList<Person>(Arrays.asList(
            new Person("Alice", Gender.Female),
            new Person("pooja",Gender.Female),
            new Person("John",Gender.Male),
            new Person("vic",Gender.Male),
            new Person("Debra",Gender.Female),
            new Person("Bruce",Gender.Male)

    ));

    public List<Person> getPeople() {
        return people;
    }


}
