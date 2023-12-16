class A{
    int a,b;
    A(int i,int j){
        a=i;
        b=j;
    }
    void hello( A a1){
        a1.a*=2;
        a1.b/=2;
    }
}
public class object_reference_object_parameter {
    public static void main(String[] args) {
        A a2=new A(15,20);
        System.out.println(a2.a+a2.b);
        a2.hello(a2);
        System.out.println(a2.a+a2.b);        
    }
}
