import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) 
        {
            double number = sc.nextDouble();

            if (number <= 0) 
            {
                break;
            }

            total += number;
        }

        System.out.println("The total is " + total);
    }
}