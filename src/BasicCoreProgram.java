import java.util.ArrayList;
import java.util.Scanner;

public class BasicCoreProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME TO BASIC CORE PROGRAM");
            System.out.println("1] FLIP COIN % TAIL/HEAD");
            System.out.println("2] LEAP YEAR PROGRAM");
            System.out.println("3] POWER OF 2 PROGRAM");
            System.out.println("4] HARMONIC NUMBER PROGRAM");
            System.out.println("5] PRIME FACTORIZATION PROGRAM");
            System.out.println("6] QUOTIENT AND REMAINDER PROGRAM");
            System.out.println("7] SWAP TWO NUMBERS PROGRAM");
            System.out.println("8] EVEN ODD NUMBERS PROGRAM");
            System.out.println("9] EXIT PROGRAM");
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
                    System.out.println("WELCOME TO HARMONIC NUMBER ");
                    System.out.println("ENTER HARMONIC Nth NUMBER");
                    int Number_Nth = scan.nextInt();
                    if (Number_Nth != 0) {
                        double total = 0.0;
                        while (Number_Nth > 0) {
                            total = total + (double) 1 / Number_Nth;
                            System.out.print("   1/" + Number_Nth + " = " + total);
                            Number_Nth--;
                        }
                        System.out.println("\n   TOTAL SUM OF HARMONIC SERIES IS = " + total);

                    } else {
                        System.out.println("RESULT " + Number_Nth + " BECASUE 1/0 =" + Number_Nth);
                    }
                    break;
                case 5:
                    int number;
                    System.out.println("Please enter a number to find out the prime factors");
                    number = scan.nextInt();
                    int index;
                    for (index = 2; index * index <= number; index++) {
                        System.out.println("index" + index);
                        while (number % index == 0) {
                            System.out.println("\t" + index + "\t");
                            number = number / index;
                        }
                    }
                    if (!(index * index <= number))
                        System.out.println("\t" + number);
                    break;
                case 6:
                    System.out.println("WELCOME QUOTIENT & REMAINDER");
                    System.out.println("ENTER ANY DIVIDEND INTEGER VALUE");
                    int dividend = scan.nextInt();
                    System.out.println("ENTER DIVISOR INTEGER VALUE");
                    int divisor = scan.nextInt();
                    int quotient = dividend / divisor;
                    int remainder = dividend % divisor;
                    System.out.println("QUOTIENT IS = " + quotient);
                    System.out.println("REMAINDER IS = " + remainder);
                    break;
                case 7:
                    System.out.println("WELCOME TO SWAP TWO NUMBER");
                    System.out.println("ENTER ANY INTEGER VALUE");
                    int num = scan.nextInt();
                    System.out.println("ENTER NEXT INTEGER VALUE");
                    int num2 = scan.nextInt();
                    System.out.println("BEFORE SWAPPING :: FIRST_INPUT = " + num + "  SECOND_INPUT = " + num2);
                    int temp = 0;
                    temp = num;
                    num = num2;
                    num2 = temp;
                    System.out.println("AFTER SWAPPING :: FIRST_INPUT = " + num + "  SECOND_INPUT = " + num2);
                    break;
                case 8:
                    System.out.println("WELCOME EVEN ODD PROGRAMS\nPLEASE ENTER NUMBERS :");
                    num = scan.nextInt();
                    if (num % 2 == 0)
                        System.out.println("NUMBER" + num + " IS EVEN");
                    else
                        System.out.println("NUMBER" + num + " IS ODD");
                    break;
                case 9:
                    System.out.println("THANK YOU ..!");
                    System.exit(0);
                default:
                    System.out.println("WRONG CHOICE TRY AGAIN");
            }
        }
    }
}
