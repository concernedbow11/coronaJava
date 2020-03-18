import java.util.Scanner;
public class Main{
    public static void printBetween(char ch1, char ch2, int n) {
        for (int ctr = 1; ch1 <= ch2; ctr++, ch1++) {
             System.out.print(ch1 + " ");
            if (ctr%n == 0) System.out.println("");
        }
    System.out.print("\n");
    }
    public static void main(String[] args) {
        System.out.print("Enter the two characters: \n");
        Scanner sc= new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        printBetween(a,b, 20);
    }
}