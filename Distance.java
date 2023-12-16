import java.util.Scanner;

class boom{
    int feet,inches;
    public void get_data(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter feet :");
        feet=sc.nextInt();
        System.out.print("Enter inches : ");
        inches=sc.nextInt();
    }
    public void show_data(){
        System.out.print("Feet : "+ feet +" \t Inches : "+inches);
    }
    public void add_distance(boom D1,boom D2){
        inches=D1.inches+D2.inches;
        feet=D1.feet+D2.feet+(inches/12);
        inches=inches%12;
    }
}
public class Distance {
 public static void main(String[] args) {
    boom D1=new boom();
    boom D2=new boom();
    boom D3=new boom();
    System.out.println("Enter first distance : ");
    D1.get_data();
    System.out.println("Enter second distance : ");
    D2.get_data();
    D3.add_distance(D1,D2);
    System.out.println("Total distance is : ");
    D3.show_data();
 }
}