package OOP;

public class People {
    String name = "Undentified";
    int age = 0;

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
}
