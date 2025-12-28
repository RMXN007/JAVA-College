// Q5: Demonstrate compile-time and runtime polymorphism

class MathOperation {
    // Compile-time polymorphism (method overloading)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Runtime polymorphism (method overriding)
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println("Addition (int): " + obj.add(10, 20));
        System.out.println("Addition (double): " + obj.add(5.5, 4.5));

        Animal a = new Dog(); // upcasting
        a.sound();
    }
}
