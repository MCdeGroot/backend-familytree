import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person mathijs = new Person("Mathijs", "de Groot", 29, 'm');
        Person joost = new Person("Joost", "de Groot", 31, 'm');
        Person bart = new Person("Bart", "de Groot", 34, 'm');
        Person daan = new Person("Daan", "de Groot", 26, 'm');
        Person corieke = new Person("Corieke", "de Groot", 21, 'f');
        Person dorien = new Person("Dorien", "de Groot", 59, 'f');
        Person kees = new Person("Kees", "de Groot", 59, 'm');
        Person pepijn = new Person("Pepijn", "de Groot", 6, 'm');
mathijs.addParents(dorien, kees);

bart.addChild(pepijn);
bart.addParents(dorien, kees);

System.out.println(dorien.getGrandChildren().get(0).getName());

dorien.setMiddleName("Theodora");
        System.out.println("wajooo");




    }

}
