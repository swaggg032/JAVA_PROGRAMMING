import java.util.Scanner;

public class conbin {
    public static void main(String[] args) {
        System.out.println("input the binary no.");
        Scanner n= new Scanner(System.in);
        int num=n.nextInt();
        System.out.println("Binary no. is "+Integer.toBinaryString(num));
    }
    
}
