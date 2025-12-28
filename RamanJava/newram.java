package RamanJava;

public interface function {
    public int a = 5;

    void funny(){
        System.out.println("I am funny function");
    }
}

abstract class parent {
    abstract public void hello();
}

class child extends parent {
    public void hello() {
        System.out.println("hello");
    }
}

class child2 extends parent implements function{
    public void hello() {
    };

}

public class newram {
    public static void main(String[] args) {
        System.out.println("Happy birthday");
        child c = new child();

    }
}
