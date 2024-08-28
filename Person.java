public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

