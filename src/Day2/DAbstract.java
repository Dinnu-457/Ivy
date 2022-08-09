package Day2;

abstract class Main{
    void def(){
        System.out.print("hii");
    }
}
public class DAbstract extends Main{
    public static void main(String[] args) {
        DAbstract m=new DAbstract();
        m.def();
    }
}
