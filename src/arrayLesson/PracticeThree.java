package arrayLesson;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row,col,option;
        int floorNum,roomNum;
        String name;
        System.out.println("Enter the number of floor : ");
        row = in.nextInt();
        System.out.println("Enter the number of room : ");
        col = in.nextInt();
        String[][] condo= new String[row][col];

        do{
            System.out.println("1. Buy condo ");
            System.out.println("2. Sell condo ");
            System.out.println("3. Show information about condo ");
            System.out.println("4. Exit");
            System.out.println("Choose option (1-4) : ");
            option = in.nextInt();
            switch(option){
                case 1:
                    System.out.println("------- Buy condo -------");
                    System.out.println("Enter the floor number (1-"+row+")");
                    floorNum = in.nextInt();
                    System.out.println("Enter the room number (1-"+col+")");
                    roomNum = in.nextInt();
                    System.out.println("Enter your name to buy condo : ");
                    in.nextLine();
                    name= in.nextLine();
                    condo[floorNum-1][roomNum-1]= name;
                    break;
                case 2:
                    System.out.println("------- Sell condo -------");
                    System.out.println("Enter the floor number (1-"+row+")");
                    floorNum = in.nextInt();
                    System.out.println("Enter the room number (1-"+col+")");
                    roomNum = in.nextInt();
                    System.out.println("Enter your name to sell condo : ");
                    in.nextLine();
                    name= in.nextLine();
                    condo[floorNum-1][roomNum-1]= name;
                    break;
                case 3:
                    System.out.println("------- Show information about condo -------");
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            System.out.print(condo[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }while(option!=4);
    }
}
