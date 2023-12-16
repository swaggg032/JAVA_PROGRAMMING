import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int count=0;
        System.out.println("input the number");
        Scanner n = new Scanner(System.in);
        int x=n.nextInt();
        for(int i=1;i<=x;i++){
            if(x%i==0)
            {
                 count++;
            }
        }
        if (count==2)
        {
            System.out.println(x+" is a prime no.");
        }
        else{
            System.out.println(x+" is not a prime no.");
        }
    }
    
}
