import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
       for(int i=0;i<3;i++){
           for(int k=0;k<=i;k++){
               System.out.print(a);
           }
           for(int j=3;j>i;j--){
               System.out.print(b);
           }
            System.out.println();
       }
    }
}
