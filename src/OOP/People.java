package OOP;

public class People {
    private String name = "Undentified";
    private int age = 0;
    private static String message;

    static {
        message = "Hello new Person!";
    }

    public People() {

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public void registerNewPerson(String name, int age) {
        System.out.println(message);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static void showMessage() {
        System.out.println(message);
    }
}
