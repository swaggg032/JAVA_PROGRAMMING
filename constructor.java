class A{
    int length,width,height;
    A(){
        System.out.println("The constructor is called ");
        length=50;
        width=30;
        height=90;
    }
    int volume(){
        return length*height*width;
    }    
}
public class constructor {
    public static void main(String[] args) {
        A a=new A();
        int vol;
        vol=a.volume();
        System.out.println("volume is "+vol);
    }
}
