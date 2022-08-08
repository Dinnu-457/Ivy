import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m=sc.nextInt(); int flag=0;
        for(int i=0;i<r;i++){
            if(r*(i)+1==m) {
                System.out.print("Yes");
               break;
            }
            for(int j=0;j<c;j++){
                if(m==c*(j)+r) {
                    System.out.println("Yes");
                    flag=1;
                }
                else if(i==0 && j+1==m){
                    System.out.println("Yes");
                    flag=1;
                }
                if(flag==1){
                    break;
                }
            }

        }
    }
}
