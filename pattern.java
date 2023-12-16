import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of stars u want to print");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.print("\n");
        }
       
    }
    
}
