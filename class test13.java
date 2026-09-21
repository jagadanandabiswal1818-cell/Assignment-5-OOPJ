interface Greeting {
    void sayHello();
    default void sayBye() { // Default method (Java 8+)
        System.out.println("Goodbye! Have a nice day.");
    }
}

class Person implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello! Welcome to Java.");
    }
}

public class test13 {
    public static void main(String[] args) {
        Person person = new Person();
        
               person.sayHello();
        
               person.sayBye();
    }
}