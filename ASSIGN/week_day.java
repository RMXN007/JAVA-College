import java.util.Scanner;
public class week_day {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter day number");
        int day=in.nextInt();
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        if (day >= 1 && day <= 7)
            System.out.println(days[day - 1]);
        else
            System.out.println("Invalid Day!!!");
    }
}

// switch (a) {
    //     case 1:
    //         System.out.println("Today is Monday");
    //         break;
    //     case 2:
    //         System.out.println("Today is Tuesday");
    //         break;
    //     case 3:
    //         System.out.println("Today is Wednesday");
    //         break;
    //     case 4:
    //         System.out.println("Today is Thursday");
    //         break;
    //     case 5:
    //         System.out.println("Today is Friday");
    //         break;
    //     case 6:
    //         System.out.println("Today is Saturday");
    //         break;
    //     case 7:
    //         System.out.println("Today is Sunday");
    //         break;
    
    //     default:
    //         System.out.println("INVALID NUMBER");
    //         break;
    // }