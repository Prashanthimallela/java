import java.util.*;
import java.util.function.*;

public class SupplierTest {
    public static void main(String args[]) {
        Supplier<String> supplier1 = () -> " Prashanthi";   // lambda expression
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = () -> 7;    // lambda expression
        System.out.println(supplier2.get());

        Person p = new Person("anna");
        Person p1 = new Person("reddy");
        Person p2 =new Person("konda");
        System.out.println(p1.equals(p2));
    }
    public static Person get(Supplier<Person> supplier) {
        return supplier.get();
    }
}
// Person class
class Person {
    public Person(String name) {
        System.out.println(name);
    }
}
