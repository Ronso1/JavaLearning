package OOP;

import static java.lang.System.*;

public class MetanitOOP {
    public static void main(String[] args) {
        People people = new People("Ivan", 23);
        People people1 = new People();
        people.showInfo();
        out.println(); // Из-за статического пакета, мы можем не писать System.out
        people1.showInfo();
    }
}

