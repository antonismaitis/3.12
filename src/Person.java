import java.time.LocalDate;
import java.util.List;

public class Person {
    public enum Sex{
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int a;
    public int getAge(){
      return a;
    }

    public void printPerson(){

    }
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}
