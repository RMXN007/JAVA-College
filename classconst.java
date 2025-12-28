package GG.RamanJava;


class base{
    base(){
        System.out.println("i am base constructor");
    }
    base(int b){
        System.out.println("i am base constructor no "+b);
    }
}
class derived extends base{
    derived(){
        System.out.println("i am derived constructor");
    }
    derived(int i){
        super(5);
        System.out.println("i am derived constructor no "+ i);
    }
}

public class classconst {
    public static void main(String[] args) {
        derived d=new derived(2);
    }
}
