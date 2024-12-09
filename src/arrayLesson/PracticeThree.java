package arrayLesson;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, col, option;
        int floorNum, roomNum;
        String name;
        System.out.println("Enter the number of floor : ");
        row = in.nextInt();
        System.out.println("Enter the number of room : ");
        col = in.nextInt();
        String[][] condo = new String[row][col];
        System.out.println("====<<you have successfully set up condo!>>====");
        System.out.println("Total Rooms : "+(row*col)+ " rooms");
        System.out.println("Rooms in each floor : "+col+ " rooms");
        System.out.println("Total floors : "+ row+ " floors");
        do {
            System.out.println("1. Buy condo ");
            System.out.println("2. Sell condo ");
            System.out.println("3. Show information about condo ");
            System.out.println("4. Search condo information");
            System.out.println("5. Exit");
            System.out.println("Choose option (1-5) : ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("------- Buy condo -------");
                    System.out.println("Enter the floor number (1-" + row + ")");
                    floorNum = in.nextInt();
                    System.out.println("Enter the room number (1-" + col + ")");
                    roomNum = in.nextInt();
                    if(condo[floorNum-1][roomNum-1]==null){
                        System.out.println("Enter your name to buy condo : ");
                        in.nextLine();
                        name = in.nextLine();
                        condo[floorNum - 1][roomNum - 1] = name;
                    }
                    else{
                        System.out.println("Sorry this room already has an owner");
                        System.out.println("Owner name is : "+condo[floorNum-1][roomNum-1]);
                    }
                    break;
                case 2:
                    System.out.println("------- Sell condo -------");
                    System.out.println("Enter the floor number (1-" + row + ")");
                    floorNum = in.nextInt();
                    System.out.println("Enter the room number (1-" + col + ")");
                    roomNum = in.nextInt();
                    if(condo[floorNum - 1][roomNum - 1] == null) {
                        System.out.println("Cannot sell the condo!! \n It does not belong to anyone yet !");
                    }else {
                        // verify the owner name
                        System.out.println("Confirm you name: ");
                        in.nextLine(); // clear
                        String ownerName = in.nextLine();
                        if(ownerName.equals(condo[floorNum - 1][roomNum - 1])) {
                            System.out.println("You have successfully sold a condo");
                            condo[floorNum - 1][roomNum - 1] = null;
                        }else{
                            System.out.println("This condo doesn't belong to you! ");
                        }
                    }
                case 3:
                    System.out.println("------- Show information about condo -------");
                    for (int i = row-1; i >=0; i--) {
                        System.out.print("Floor "+(i+1)+": ");
                        for (int j = 0; j < col; j++) {
                            System.out.print(condo[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int searchOption =0;
                    do {
                    System.out.println("------- Search condo information -------");
                    System.out.println("1.Search by owner name");
                    System.out.println("2.Search by floor");
                    System.out.println("3.Search by room [floor][room]");
                    System.out.println("4. Exit");
                    System.out.println("Choose option (1-4) : ");
                    searchOption = in.nextInt();
                    switch (searchOption) {
                        case 1:
                            System.out.println("<<Search by owner name>> ");
                            System.out.println("Enter the owner name :");
                            String ownerName = in.nextLine();

                            break;
                            case 2:
                                System.out.println("<<Search by floor>> ");
                                System.out.println("Enter floor number :");
                                floorNum = in.nextInt();
                                System.out.println("Result of floors"+floorNum);
                                for(int j=0;j<condo[floorNum-1].length;j++){
                                    System.out.print(condo[floorNum-1][j] + " ");
                                }
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("<<Search by room>>  ");
                                break;
                            case 4:
                                System.out.println("Exit ");
                                break;
                    }
                    }while(searchOption!=4);
                    break;
                case 5:
                    System.out.println("Exit the program");
                    break;
            }
            if (option != 5) {
                System.out.println("---------------Press ENTER to continue -----------");
                in.nextLine(); // clearing the buffer from int
                in.nextLine();
            }
        } while (option != 5);
    }
}



