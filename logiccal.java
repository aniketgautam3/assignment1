import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter One Number : ");
        x = sc.nextInt();
        System.out.print("Enter The second Number : ");
        y =sc.nextInt();

        if(x>y){
            System.out.println(x+" Is Greater.");
        }
        else{
            System.out.println(y+" Is Greator");
        }
    }
}
