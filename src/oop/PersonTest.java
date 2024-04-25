package oop;

public class PersonTest {

    public static void main(String[] args) {
        int a;
        String s = "neco";

        Osoba person = new Osoba();
        person.age = 21;
        person.name = "Carl";
        person.shoeSize = 42.5;
        person.intro();
        Osoba otherPerson = new Osoba();
        otherPerson.age = 30;
        otherPerson.name = "Stanly";
        otherPerson.shoeSize = 44.1;
        otherPerson.intro();
    }
}
