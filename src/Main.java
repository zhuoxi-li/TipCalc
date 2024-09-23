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

        double temp_bpp = Math.round((bill/people)*100); //get rid of extra decimals after 100s
        double bpp = temp_bpp/100; //turns it back to decimals (xx.xx)
        double temp_tip = Math.round(bpp * percent * 100); //ref line 17
        double tip = temp_tip/100; //ref line 18
        System.out.println(spaces);
        System.out.print("Total bill: $");
        System.out.printf("%.2f", bill); // to have the amount be print w/ 2 decimals
        System.out.println(); // so that the space doesn't print on the same line

        System.out.println(spaces);
        System.out.print("Total people: " + people);
        System.out.println();

        System.out.println(spaces);
        System.out.print("Tip per person: $");
        System.out.printf("%.2f", tip); // ref line 23
        System.out.println(); // ref line 24

        System.out.println(spaces);
        System.out.print("Bill per person (Including tip): $");
        System.out.printf("%.2f", bpp); // ref line 23
        System.out.println(); // ref line 24
        System.out.println(spaces);

    }
}