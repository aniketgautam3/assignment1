# Assignment 2

####Question 3 : Create Inputs and outputs Dominos Pizza Store and web site

### Algorithm
```
STEP 1 : START.
STEP 2 : Take Input From the user (USER/ADMIN)
STEP 3 : For User and Admin Both have different View access of the Portal.
STEP 4 : For Users , They can order pizza, cancel order etc.
STEP 5 : For Admin , Total Pending order, Total order revieved.
STEP 6 : STOP.
```

Module 1 : (Selection of Avail Functionality)
```java
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
```
Module 2 : User Functionality 

```java
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
```

Module 3 : Admin Functionality

```java
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
```

##Input/Output
```
For User ...


Welcome To Domino's
Enter the Desired Number to Avail Functionality:
1. UserLogin
2. Admin Login
Enter The Input : 1

Choose the Services
1.Order Pizza
2.Cancel Order
Enter The Input : 1

Choose Which pizza U want to Order
1.Onion Pizza
2. Farmhouse Pizza
Enter The Input : 2

 Thank You For Choosing Domino's 
 Your FarmHouse Pizza is Ordered SuccessFully!!!
 Thanku!!!

```

```
For Admin

Welcome To Domino's
Enter the Desired Number to Avail Functionality:
1. UserLogin
2. Admin Login
Enter The Input : 2

Choose Which pizza U want to Order
1.No of Pending Orders.
2. Order Completetd.
Enter The Input : 1

 No. of Pending orders are 15.

```
