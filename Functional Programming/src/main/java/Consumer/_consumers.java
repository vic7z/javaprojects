package Consumer;

import Model.PeopleList;
import Model.Person;



import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _consumers {
    public static void main(String[] args) {
        PeopleList peopleList=new PeopleList();
        peopleList.getPeople().forEach(t->printList.accept(t,false));

    }
    public static Consumer<Person> printGender=person -> System.out.println(person.getGender());
    public static BiConsumer<Person,Boolean> printList=(person, aBoolean) -> System.out.println(person.getName()
            +" : "+((aBoolean)?person.getGender():"***"));

}
