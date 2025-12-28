// Q4: WAP to implement multiple inheritance using interface

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing content...");
    }

    public void show() {
        System.out.println("Showing content...");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}
