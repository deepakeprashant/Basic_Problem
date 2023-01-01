import java.util.Scanner;

public class BasicCoreProgram {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME TO BASIC CORE PROGRAM");
            System.out.println("1] FLIP COIN % TAIL/HEAD");
            System.out.println("2] LEAP YEAR PROGRAM");
            System.out.println("3] EXIT PROGRAM");
            System.out.println("ENTER YOUR CHOICE");
            switch (scan.nextInt()) {
                case 1:
                    flipCoinPercentage();
                    break;
                case 2:
                    leapYearCheck();
                    break;
                case 3:
                    System.out.println("THANK YOU ..!");
                    System.exit(0);
                default:
                    System.out.println("WRONG CHOICE TRY AGAIN");
            }
        }
    }

    private static void flipCoinPercentage() {
        int Head_Counter = 0;
        int Tail_Counter = 0;
        System.out.println("Enter Number of times to Flip Coin");
        int Through = scan.nextInt();
        for (int i = 0; i < Through; i++) {
            double Random_Number = Math.random();
            if (Random_Number < 0.5) {
                Head_Counter += 1;
            } else {
                Tail_Counter += 1;
            }
        }
        float Head_Percentage = (Head_Counter * 100) / Through;
        float Tail_Percentage = (Tail_Counter * 100) / Through;
        System.out.println("HEAD PERCENTAGE = " + Head_Percentage + "%");
        System.out.println("TAIL PERCENTAGE = " + Tail_Percentage + "%");
    }
    private static void leapYearCheck() {
        System.out.println("WELCOME LEAP YEAR PROGRAM");
        System.out.println("ENTER 2000 To 2022 ANY YEAR");
        int Year = scan.nextInt();
        if (Year % 4 == 0) {
            System.out.println(Year + " IS A LEAP YEAR");
        } else {
            System.out.println(Year + " IS NOT LEAP YEAR");
        }
    }
}