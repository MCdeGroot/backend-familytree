import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addParents() {
        //arrange:
        Person mathijs = new Person("Mathijs", "de Groot", 29, 'm');
        Person dorien = new Person("Dorien", "de Groot", 59, 'f');
        Person kees = new Person("Kees", "de Groot", 59, 'm');


        //act:
        mathijs.addParents(dorien,kees);
        Person mother = mathijs.getMother();
        Person father = mathijs.getFather();


        //assert:
        assertEquals(dorien,mother);
        assertEquals(kees,father);
    }

    @Test
    void addChild() {
        //arrange:
        Person kees = new Person("Kees", "de Groot", 59, 'm');
        Person mathijs = new Person("Mathijs", "de Groot", 29, 'm');
        Person bart = new Person("Bart", "de Groot", 34, 'm');
        //act:
        kees.addChild(mathijs);
        kees.addChild(bart);
        ArrayList<Person> children = kees.getChildren();


        //assert:
        assertEquals(children.get(0),mathijs);
        assertEquals(children.get(1),bart);
    }

    @Test
    void addSibling() {
        //arrange:
        Person joost = new Person("Joost", "de Groot", 31, 'm');
        Person mathijs = new Person("Mathijs", "de Groot", 29, 'm');
        Person bart = new Person("Bart", "de Groot", 34, 'm');
        //act:
        mathijs.addSibling(bart);
        mathijs.addSibling(joost);

        ArrayList<Person> siblings = mathijs.getSiblings();

        //assert:
        assertEquals(siblings.get(0),bart);
        assertEquals(siblings.get(1),joost);

    }

    @Test
    void addPet() {
        //arrange:
        Person mathijs = new Person("Mathijs", "de Groot", 29, 'm');
        Pet pietje = new Pet("Pietje",5,"dog");
        Pet pietjePuk = new Pet("PietjePuk",5,"cow");

        //act:
        mathijs.addPet(pietje);
        mathijs.addPet(pietjePuk);
        ArrayList<Pet> pets = mathijs.getPets();

        //assert:
        assertEquals(pets.get(0),pietje);
        assertEquals(pets.get(1),pietjePuk);
    }

    @Test
    void getGrandChildren() {
        //arrange:
        Person bart = new Person("Bart", "de Groot", 34, 'm');
        Person kees = new Person("Kees", "de Groot", 59, 'm');
        Person pepijn = new Person("Pepijn", "de Groot", 6, 'm');
        Person dorien = new Person("Dorien", "de Groot", 59, 'f');
        bart.addParents(dorien,kees);
        bart.addChild(pepijn);
        //act:
        ArrayList<Person> grandchilds = kees.getGrandChildren();

        //assert:
        assertEquals(grandchilds.get(0), pepijn);

    }
}