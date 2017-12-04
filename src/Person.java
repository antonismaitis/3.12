import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    String emailAd;
    int age;
    static int choise;
    static int i;
    static Person a = new Person("","");
    Scanner input = new Scanner(System.in);

    //constractor-----------------------------------------
    public Person(String onoma,String eTaxid){
        name=onoma;
        emailAd=eTaxid;
    }


    public enum Sex{
        MALE, FEMALE
    }


    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
    public static List<Person> createShortList()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many employees you want to add?");
        choise=input.nextInt();

        List<Person> myList= new ArrayList<Person>(choise);

        for(i=0; i<choise; i++)
        {
            System.out.printf("Give name for employee number %d: ", i);

            while(true) {
                a.setName();
                break;
            }
            System.out.printf("\nGive e-mail for employee number %d: ", i);
            a.setEmailAd();
            myList.add(new Person(a.getName(),a.getEmailAd()));
        }
        return myList;
    }

    //megethos listas--------------------------------------------
    public static int listNumber()
    {
        return i;
    }
    //onoma-------------------------------------------------------
    public void setName(){
        name=input.nextLine();
    }

    public String getName() {

        return name;
    }

    //email-------------------------------------------------------
    public void setEmailAd(){
        emailAd=input.nextLine();
    }
    public String getEmailAd() {

        return  emailAd;
    }
    //age---------------------------------------------------------
    public void serAge(){
        age=input.nextInt();
    }
    public int getAge(){
        return age;
    }


    public void printPerson() {
        System.out.printf("Name: %s",name);
        System.out.printf("Email: %s",emailAd);
    }
}
