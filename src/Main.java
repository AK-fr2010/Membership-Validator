import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double packageWeight ;
        int shippingType ;
        boolean isMember ;
        String name ;
        double baseCost = 0;
        boolean invalidChecker ;

        System.out.print("Enter The Customer Name :");
        name = scanner.nextLine().trim();

        System.out.print("Enter the weight of the package :");
        packageWeight = scanner.nextDouble();

        System.out.print("Enter the Shipping Type ( 1 -> Standard , 2 -> Express , 3 ->Next Day ) :");
        shippingType = scanner.nextInt();

        System.out.print("Is " + name + " a Member (true/false) :");
        isMember = scanner.nextBoolean();

        switch (shippingType) {
            case 1 -> {
                System.out.println("The Standard Shipping Type is used");
                baseCost = 5 * packageWeight ;
                invalidChecker = true ;
            }
            case 2 -> {
                System.out.println("The Express Shipping Type is used");
                baseCost = 12 * packageWeight ;
                invalidChecker = true ;
            }
            case 3 -> {
                System.out.println("The Next-Day Shipping Type is used");
                baseCost = 25 * packageWeight ;
                invalidChecker = true ;
            }
            default -> {
                System.out.println("Invalid Shipping Type is Used ");
                invalidChecker = false ;

            }
        }
        if (invalidChecker ) {
            if (isMember) {
                System.out.println("20% Discount on the basis of Membership .");
                System.out.println("======Final Invoice=========");
                double newBaseCost = baseCost - ((double) 20 / 100) * baseCost;
                System.out.printf("The Total Cost of The Shipping of the package is %.1f", newBaseCost);
            } else {
                System.out.println("======Final Invoice=========");
                System.out.printf("The Cost of the Shipping is :$%.1f", baseCost);
            }
        }


        scanner.close();
    }
}
