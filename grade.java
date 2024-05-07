import java.util.Scanner;

public class grade {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int marks[];
        marks = new int[n];
        int total = 0, avg = 0;
        System.out.println("Enter the marks of each subject out of 100 individually: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        avg = total / n;
        System.out.println("Total Marks obtained in " + n + "subjects: " + total);
        System.out.println("Average Marks: " + avg);
        if (avg >= 90)
            System.out.println("Grade 0");
        if ((avg < 90) && (avg >= 80))
            System.out.println("Grade E");
        if ((avg < 80) && (avg >= 70))
            System.out.println("Grade A");
        if ((avg < 70) && (avg >= 60))
            System.out.println("Grade B");
        if ((avg < 60) && (avg >= 50))
            System.out.println("Grade C");
        if ((avg < 50) && (avg > 40))
            System.out.println("Grade D");
        if (avg < 40)
            System.out.println("Grade F");
        sc.close();
    }
}