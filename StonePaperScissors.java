package GG.RamanJava;


import java.util.Random;
import java.util.Scanner;
import java.util.Scanner.*;
public class StonePaperScissors {
    public static void main(String[] args) {
        Random random=new Random();
        int ComputerInput=random.nextInt(3);

        Scanner in=new Scanner(System.in);
        System.out.println("Enter 0 for Stone 1 for Paper 2 for Scissors");
        int UserInput=in.nextInt();

        if(ComputerInput==UserInput){
            System.out.println("DRAW");
        }
        else if(ComputerInput==0 && UserInput==2 || ComputerInput==1 && UserInput==0 || ComputerInput==2 && UserInput==1  ){
            System.out.println("Computer Won");
        }
        else{
            System.out.println("User Won");
        }

        if(ComputerInput==0){
            System.out.println("Computer choose Stone");
        }
        else if(ComputerInput==1){
            System.out.println("Computer choose Paper");
        }
        else{
            System.out.println("Computer choose Scissors");
        }
    }
}
