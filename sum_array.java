import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        int a[] = new int[6];
        int sum=0;
        System.out.println("enter the elements of the array : ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
    {
            a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++)
    {
        sum=sum+a[i];
    }
    System.out.println("sum of the elements is : "+sum);
    }
}
