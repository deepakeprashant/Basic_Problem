import java.util.Scanner;

public class BasicCoreProgram {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("WELCOME COIN PERCENTAGE");
        flipCoinPercentage();
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
}
