import java.util.Scanner;
public class Q7_BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weightKg = sc.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;

        double bmi = weightKg / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Status: " + status);

        sc.close();
    }
}