import java.util.Scanner;

public class ControlFlowDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("_______<< ISTAD Restarant >>>______");
            System.out.println("1. Fried Rice ");
            System.out.println("2. Chicken Rice ");
            System.out.println("3. Soup SiChoun ");
            System.out.println("4. Water");
            System.out.println("5. Exit ");

            System.out.println("Choose option (1-4): ");
            option = input.nextInt();
            switch (option) {
                case 1: {
                    int price = 4000;
                    System.out.println("Bay chaa ");
                    System.out.println("Value of price : " + price);

                    System.out.println();
                    break;
                }
                case 2:
                    int price=5000;
                    System.out.println("Chicken rice ! ");
                    System.out.println("Price is : "+price);
                    break;
                case 3:
                    System.out.println("Soup SiChoun ");
                    break;
                case 4:
                    System.out.println("Water");
                    break;
                case 5:
                    System.out.println("Exit ");
                    break;
                default:
                    System.out.println(" Invalid option!!! ");
                    break;

            }
        } while (option != 5);
    }
}
