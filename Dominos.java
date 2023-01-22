import java.util.*;
public class Dominos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Welcome To Domino's");
        System.out.println("Enter the Desired Number to Avail Functionality:");
        System.out.println("1. UserLogin");
        System.out.println("2. Admin Login");
        System.out.print("Enter The Input : ");
        choice = sc.nextInt();

        switch(choice){
            case 1 : user(); break;
            case 2 : admin();; break;
            default : System.out.println("\nInvalid Input\n Please Try Again. \n"); break;
        }
    }

    public static void user(){
        System.out.println("\nChoose the Services");
        System.out.println("1.Order Pizza");
        System.out.println("2.Cancel Order");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Input : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : pizza(); break;
            case 2 : cancelOrder() ; break;
            default : System.out.println("\n Invalid Input. \nTry Again!!!\n"); user(); break;
        }
    }

    public static void admin(){
        System.out.println("\nChoose Which pizza U want to Order");
        System.out.println("1.No of Pending Orders.");
        System.out.println("2. Order Completetd.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Input : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : System.out.println("\n No. of Pending orders are 15."); break;
            case 2 : System.out.println("\n No of order Completed. 25"); break;
            default : System.out.println("\n Invalid Input. \nTry Again!!!\n"); pizza(); break;
        }
    }

    public static void pizza(){
        System.out.println("\nChoose Which pizza U want to Order");
        System.out.println("1.Onion Pizza");
        System.out.println("2. Farmhouse Pizza");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Input : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : System.out.println("\n Thank You For Choosing Domino's \n Your Onion Pizza is Ordered SuccessFully!!!\n Thanku!!!\n"); break;
            case 2 : System.out.println("\n Thank You For Choosing Domino's \n Your FarmHouse Pizza is Ordered SuccessFully!!!\n Thanku!!!\n"); break;
            default : System.out.println("\n Invalid Input. \nTry Again!!!\n"); pizza(); break;
        }
    }

    public static void cancelOrder(){
        System.out.println("\nYour Order has been Cancelled Thank You!!!");
    }
}
