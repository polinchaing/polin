import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        final int RATE = 4100;
        enum DAY {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        do {
            System.out.println("1.Wage Calculator ");
            System.out.println("2.Exchange Money ");
            System.out.println("3.Quit");
            System.out.println("Enter your option: ");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    double hour;
                    double wage;
                    DAY day;
                    double result;

                    System.out.println("<<<Wage Calculator>>> ");
                    System.out.println("Enter hour(hrs)");
                    hour = sc.nextDouble();
                    System.out.println("Enter wage($)");
                    wage = sc.nextDouble();
                    System.out.println("Enter day(ex.monday-sunday)");
                    day = DAY.valueOf(sc.next().toUpperCase());  //make small letter became big
                    result = wage* hour;
                    if (day == DAY.SATURDAY || day == DAY.SUNDAY) {
                        result = result * 2;
                    }
                    System.out.println("=======================");
                    System.out.println("Hour is : " + hour + "hr" + (hour > 1 ? "s" : ""));
                    System.out.println("Wage is :" + wage + "$");
                    System.out.println("Day is : " + day);
                    System.out.println("Result: " + result + "$");
                    break;
                }
                case 2: {
                    double khr;
                    double usd;
                    double result;
                    int op;
                    do {
                    System.out.println("<<<Exchange Money>>>");
                    System.out.println("1.KHR to USD");
                    System.out.println("2.USD to KHR");
                    System.out.println("3.Quit");
                    System.out.println("Enter your option: ");
                    op = sc.nextInt();
                        switch (op) {
                            case 1: {
                                System.out.println("<<<KHR to USD>>>");
                                System.out.println("Enter Your Cash :");
                                khr = sc.nextDouble();
                                result = khr / RATE;
                                System.out.println("======================");
                                System.out.println("result is  : " + "$" + result);
                                break;
                            }
                            case 2: {
                                System.out.println("<<<USD to KHR>>>");
                                System.out.println("Enter Your Cash :");
                                usd = sc.nextDouble();
                                result = usd * RATE;
                                System.out.println("======================");
                                System.out.println("result is :" + result + "Riel");
                                break;
                            }
                            case 3: {
                                System.out.println("<<<Quit>>>");
                                System.out.println("======================");
                                break;
                            }
                            default: {
                                System.out.println("Invalid option");
                                break;
                            }
                        }
                    } while (op != 3);

                }
                case 3: {
                    System.out.println("Quit");
                    System.out.println("=====================");
                    break;
                }
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 3);
    }
}


