import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lowerlimit = 1;
        int upperlimit = 100;
        Random random = new Random();
        int randomInteger = random.nextInt(upperlimit - lowerlimit + 1) + lowerlimit;
        int score = 100;
        int n = 0;
        System.out.println("Guess the magic number in the range 1 to 100----");
        while (n != randomInteger) {
            System.out.println("Enter your guess:");
            n = sc.nextInt();
            if (n < randomInteger)
                System.out.println("GUESS HIGHER!");
            if (n > randomInteger)
                System.out.println("GUESS LOWER!");
            score--;
        }
        System.out.println("NUMBER FOUND :)");
        System.out.println("Score:" + score);
        sc.close();
    }
}
