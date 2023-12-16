import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a[] = new int[6];
        System.out.println("enter the elements : ");
        Scanner sc=new Scanner(System.in);
        for( int i=0;i<5;i++)
        {
                a[i]=sc.nextInt();
        }
        System.out.println("element of data are : ");
        for( int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }

}
