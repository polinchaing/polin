import java.util.Scanner;

public class InputDemo {
    private static int value;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int age ;
        float weight;

        System.out.println("Enter ur Name : ");
        name = input.nextLine();
        System.out.println("Enter ur Age : ");
        age = input.nextInt();
        System.out.println("Enter Ur Weight : ");
        weight = input.nextFloat();
        String result = switch (value) {
            case 1 -> "One";
            case 2 -> {
                yield "Two";
            }
            default -> "Other";
        };




    }
}
