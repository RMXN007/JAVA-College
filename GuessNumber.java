package GG.RamanJava;


import java.util.Random;
import java.util.Scanner;

class Game{
    public int cnt;
    public int Number;
    public int guess;
    Game(){
        Random random=new Random();
        Number=random.nextInt(101);
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
    public int getCnt() {
        return cnt;
    }
    int TakeUserInput(){
        Scanner in=new Scanner(System.in);
        System.out.println("Guess any number between 1-100");
        int guess=in.nextInt();
        return guess;
    }
    boolean IsCorrectNumber(int guess){
        if(Number==guess){
            System.out.println("Your guess is correct "+guess);
            return true;
        }
        else if(Number<guess){
            System.out.println("Your guess is bigger than number");
        }
        else if(Number>guess){
            System.out.println("Your guess is smaller than number");
        }
        return false;
    }
}
public class GuessNumber {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        int cnt=0;
        while(!b){
            int ram = g.TakeUserInput();
            b=g.IsCorrectNumber(ram);
            cnt++;
            g.setCnt(cnt);
        }
        System.out.println("You took "+g.getCnt() + " chances");
    }        
}