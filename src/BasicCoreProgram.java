import java.util.Scanner;

public class BasicCoreProgram {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME TO BASIC CORE PROGRAM");
            System.out.println("1] FLIP COIN % TAIL/HEAD");
            System.out.println("2] LEAP YEAR PROGRAM");
            System.out.println("3] POWER OF 2 PROGRAM");
            System.out.println("4] EXIT PROGRAM");
            System.out.println("ENTER YOUR CHOICE");
            switch (scan.nextInt()) {
                case 1:
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
                    break;
                case 2:
                    System.out.println("WELCOME LEAP YEAR PROGRAM");
                    System.out.println("ENTER 2000 To 2022 ANY YEAR");
                    int Year = scan.nextInt();
                    if (Year % 4 == 0) {
                        System.out.println(Year + " IS A LEAP YEAR");
                    } else {
                        System.out.println(Year + " IS NOT LEAP YEAR");
                    }
                    break;
                case 3:
                    System.out.println("Welcome TO Command Line Argument");
                    int X = Integer.parseInt(args[0]);
                    double power = Math.pow(2, X);
                    System.out.println("Command Line Argument Value is " + X);
                    int table2 = 2;
                    int a = 1;
                    while (table2 <= power) {
                        System.out.println(a + "] Table Of The Power 2 = "
                                + table2 + " Equal To 2^N " + (int) power);
                        table2 = table2 * 2;
                        a++;
                    }
                    if (table2 % 4 == 0) {

                        System.out.println((int) power + " IS LEAP YEAR");
                    } else {
                        System.out.println((int) power + " IS NOT LEAP YEAR");
                    }
                    break;
                case 4:
                    System.out.println("THANK YOU ..!");
                    System.exit(0);
                default:
                    System.out.println("WRONG CHOICE TRY AGAIN");
            }
        }
    }
}
