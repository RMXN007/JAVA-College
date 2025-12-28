package GG.RamanJava;

class Library{
    String[] Book;
    int num;
    Library(){
        this.Book=new String[100];
        this.num=0;
    }
    public void AddBook(String s){
        this.Book[num]=s;
        num++;
        System.out.println(s+" has been added");
    }
    public void IssueBook(String bString){
        for(int i=0; i<this.Book.length;i++){
            if(this.Book[i]==bString){
                System.out.println(Book[i]+ " has been issued");
                this.Book[i]=null;
            }
        }
    }
    public void ReturnBook(String s){
        AddBook(s);
    }
    public void AvailableBooks(){
        for (String b : Book) {
            if(b==null){
                continue;
            }
            System.out.println("* "+ b);
        }
    }
}

public class Practicelibrary {
    public static void main(String[] args) {
        Library lab=new Library();
        lab.AddBook("Rich and Poor Dad");
        lab.AddBook("Ramayana");
        lab.AddBook("Mahabharat");
        lab.AvailableBooks();
        
        lab.IssueBook("Ramayana");
        lab.AvailableBooks();
        lab.ReturnBook("Ramayana");
        lab.AvailableBooks();
    }
}
