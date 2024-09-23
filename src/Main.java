import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //scanner
        String spaces = "---------------------"; //i didnt want to type sm

        System.out.print("Enter bill: ");
        double bill = s.nextDouble();

        System.out.print("Enter percentage (w/o % sign): ");
        double percent = (s.nextDouble())/100; //divide by 100 to get decimal

        System.out.print("Enter number of people: ");
        Integer people = s.nextInt(); //Because there cant be a fraction of a person

        double bpp = (bill/people);
        System.out.printf("%.2f", bpp);

    }
}