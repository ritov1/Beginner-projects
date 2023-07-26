import java.util.Scanner;
import java.util.Random;

public class guessNumber{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int n, g, c = 0;
            System.out.println("Enter a number between 1 and 100! 10 chances");
            n = sc.nextInt();
            g = rand.nextInt(1, 100);

            while (c < 10) {
                if (n > g) {
                    System.out.printf("less than %d\n", n);

                    n = sc.nextInt();
                } else if (n < g) {
                    System.out.printf("greater than %d\n", n);
                    n = sc.nextInt();
                } else if (n == g) {
                    System.out.println("Congrats you are correct!!");
                    c = 10;
                }
                c++;
            }
        }
    }
}