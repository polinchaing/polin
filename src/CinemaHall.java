import java.util.*;

public class CinemaHall {

    private static String[][] seats;
    private static List<String> bookingHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nCinema Hall Management System");
            System.out.println("1. Set up hall seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. View booking history");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    setupSeats(scanner);
                    break;
                case 2:
                    bookSeat(scanner);
                    break;
                case 3:
                    cancelBooking(scanner);
                    break;
                case 4:
                    viewBookingHistory();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void setupSeats(Scanner scanner) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        seats = new String[rows][columns];

        char rowLabel = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = rowLabel + "-" + (j + 1) + " AV"; // AV = Available
            }
            rowLabel++;
        }

        System.out.println("Seating arrangement created successfully!");
        displaySeats();
    }

    private static void bookSeat(Scanner scanner) {
        if (seats == null) {
            System.out.println("Please set up the hall seats first.");
            return;
        }

        System.out.print("Enter seat code to book (e.g., A-1): ");
        String seatCode = scanner.nextLine().toUpperCase();

        boolean found = false;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].startsWith(seatCode)) {
                    if (seats[i][j].endsWith("AV")) {
                        seats[i][j] = seatCode + " BO"; // BO = Booked
                        bookingHistory.add("Seat " + seatCode + " booked on " + new Date());
                        System.out.println("Seat " + seatCode + " booked successfully!");
                    } else {
                        System.out.println("Seat " + seatCode + " is already booked.");
                    }
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Invalid seat code. Please try again.");
        }

        displaySeats();
    }

    private static void cancelBooking(Scanner scanner) {
        if (seats == null) {
            System.out.println("Please set up the hall seats first.");
            return;
        }

        System.out.print("Enter seat code to cancel booking (e.g., A-1): ");
        String seatCode = scanner.nextLine().toUpperCase();

        boolean found = false;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].startsWith(seatCode)) {
                    if (seats[i][j].endsWith("BO")) {
                        seats[i][j] = seatCode + " AV"; // AV = Available
                        bookingHistory.add("Seat " + seatCode + " booking canceled on " + new Date());
                        System.out.println("Booking for seat " + seatCode + " canceled successfully!");
                    } else {
                        System.out.println("Seat " + seatCode + " is not booked.");
                    }
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Invalid seat code. Please try again.");
        }

        displaySeats();
    }

    private static void viewBookingHistory() {
        if (bookingHistory.isEmpty()) {
            System.out.println("No bookings have been made yet.");
        } else {
            System.out.println("Booking History:");
            for (String record : bookingHistory) {
                System.out.println(record);
            }
        }
    }

    private static void displaySeats() {
        System.out.println("\nCurrent Seating Arrangement:");
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + "  ");
            }
            System.out.println();
        }
    }
}
