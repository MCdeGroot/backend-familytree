import java.util.ArrayList;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings = new ArrayList<>();
    private ArrayList<Person> children = new ArrayList<>();
    private ArrayList<Pet> pets = new ArrayList<>();

    public Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, char sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person mother, Person father) {
        this.mother = mother;
        mother.addChild(this);

        this.father = father;
        father.addChild(this);
    }

    public void addChild(Person child) {
        ArrayList<Person> children = new ArrayList<>();
        if (this.getChildren() != null) {
            for (Person c : this.getChildren()) {
                children.add(c);
            }

        }
        children.add(child);
        this.setChildren(children);
    }


    public void addSibling(Person sibling) {
        ArrayList<Person> siblings = new ArrayList<>();
        if (this.getSiblings() != null) {
            for (Person s : this.getSiblings()) {
                siblings.add(s);
            }
        }
        siblings.add(sibling);
        this.setSiblings(siblings);
    }

    public void addPet(Pet pet) {
        ArrayList<Pet> pets = new ArrayList<>();
        if (this.getPets() != null) {
            for (Pet p : this.getPets()) {
                pets.add(p);
            }
        }
        pets.add(pet);
        this.setPets(pets);
    }

   public ArrayList<Person> getGrandChildren() {
       ArrayList<Person> grandChilds = new ArrayList<>();
       for (Person p : this.getChildren()) {
           for (Person child : p.getChildren()) {
               grandChilds.add(child);
           }
       }
       return grandChilds;
   }

}
