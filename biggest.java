import java.util.Scanner;

public class biggest {
        public static void main(String[] args) {
            int x,y,z;
            System.out.println("input 3 numbers");
            Scanner n=new Scanner(System.in);
            x=n.nextInt();
            y=n.nextInt();
            z=n.nextInt();
            if(x>y&&x>z)
            {
                System.out.println("largest no. = "+x);
            }
           else if(y>z&&y>x)
            {
                System.out.println("largest no. = "+y);
            }
            else
            {
                System.out.println("largest no. = "+z);
            }
        }
        
    }
    