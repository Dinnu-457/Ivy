import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n+"->");
        while(n>1)
        {
            if(n%2==0){
                System.out.print(n/2+"->");
                n=n/2;
            }
            else{
                System.out.print((3*n+1)+"->");
                n=3*n+1;
            }
        }
    }
}
