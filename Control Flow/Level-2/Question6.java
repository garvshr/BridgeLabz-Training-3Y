import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) 
        {
            System.out.println("Amar is the youngest");
        } 
        else if (ageAkbar < ageAnthony) 
        {
            System.out.println("Akbar is the youngest");
        } 
        else 
        {
            System.out.println("Anthony is the youngest");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) 
        {
            System.out.println("Amar is the tallest");
        } 
        else if (heightAkbar > heightAnthony) 
        {
            System.out.println("Akbar is the tallest");
        } 
        else 
        {
            System.out.println("Anthony is the tallest");
        }
    }
}