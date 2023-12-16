import java.util.Scanner;
public class boom {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines want to print");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=1;j<(num*5);j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
       
    }
    
}
