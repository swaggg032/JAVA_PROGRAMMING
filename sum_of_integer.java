import java.util.Scanner;

public class sum_of_integer {
    public static void main(String[] args) {
        int sum=0;
        int total_numbers=Integer.parseInt(args[0]);
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=total_numbers;i++)
        {
            System.out.print("enter the integer "+i+": ");
            int number=sc.nextInt();
            sum=sum+number;
        }
        System.out.println("The sum of numbers is : "+sum);
    }
}
