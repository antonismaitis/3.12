import java.util.List;

public class mainClass {
    public static void main(String... args){

        int i;
        i=Person.listNumber();
        List<Person> personList = Person.createShortList();
        for(int y=0; y<i; y++) {
            personList.get(y).printPerson();
        }

}
