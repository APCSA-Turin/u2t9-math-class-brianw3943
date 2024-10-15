import java.util.Scanner;
public class Freestyle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int int1 = scan.nextInt();
        System.out.print("Enter another integer: ");
        int int2 = scan.nextInt();
        System.out.print(Math.min(int1, int2) + " is the smaller number!\n");
        System.out.print(Math.max(int1, int2) + " is the bigger number!");
    }
}
