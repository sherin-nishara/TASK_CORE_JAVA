import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Main {
    private int ticketId;
    private String passengerName;
    private String source;
    private String destination;
    private String travelDate;
    
    static{
        System.out.println("--------Ticketing System--------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Main> records = new HashMap<>();
        boolean exit = true;
        while(exit){
            System.out.print("Enter choice by number\n 1)Book ticket\n 2)View by ID\n 3)View all\n 4)Update ticket\n 5)Cancel ticket\n 6)exit\n Enter number : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    bookTic();
                    break;
                case 2:
                    viewById();
                    break;
                case 3:
                    viewTic();
                    break;
                case 4:
                    updateTic();
                    break;
                case 5:
                    cancelTic();
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("Please enter provied numbers only");
            }
        }
    }
}
