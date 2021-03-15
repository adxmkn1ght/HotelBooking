package hotelbooking;

import java.util.*;

public class HotelBooking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double TotalCost = 0.00;
        int RoomCost = 0;
        int BoardCost = 0;
        
        System.out.println("How many days are you staying for?");
        int Days = input.nextInt();

        try {

            System.out.println("Do you want:");
            System.out.println(" 1: A Single Room \n 2: A Double Room \n 3: A Family Room");
            int RoomChoice = input.nextInt();

            switch (RoomChoice) {
                case (1):
                    RoomCost = 50;
                case (2):
                    RoomCost = 75;
                case (3):
                    RoomCost = 105;
                default:
                  
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION: ERROR OCCURED");
        }
        
        try {

            System.out.println("Do you want:");
            System.out.println(" 1: Self Catering \n 2: Half-Board \n 3: Full-Board");
            int BoardChoice = input.nextInt();

            switch (BoardChoice) {
                case (1):
                    BoardCost = 0;
                case (2):
                    BoardCost = 10;
                case (3):
                    BoardCost = 20;
                default:
                 
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION: ERROR OCCURED");
        }
        
        if(Days < 8){
            TotalCost = (RoomCost + BoardCost) * Days;
        }else {
            TotalCost = (RoomCost + BoardCost) * 7;
            TotalCost = TotalCost + (((RoomCost + BoardCost) * (Days - 7)) * 0.8);
        }
        
        double NonDiscount = (RoomCost + BoardCost) * Days;
        
        System.out.println("The Total before discounts is " + NonDiscount);
        System.out.println("The total after discounts is " + TotalCost);
        
    }

}
