import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int dif1=(x-n);
        int dif2=(y-n);
        int dif3=(z-n);
        if(dif1<0 && dif2>=0 && dif3>=0 ){
            if(dif2<dif3){
                System.out.println("L2");
            }else{
                System.out.println("L3");
            }
        }
        if(dif1>=0 && dif2<0 && dif3>=0 ){
            if(dif1<dif3){
                System.out.println("L1");
            }else{
                System.out.println("L3");
            }
        }
        if(dif1>=0 && dif2>=0 && dif3<0 ){
            if(dif1<dif2){
                System.out.println("L1");
            }else{
                System.out.println("L2");
            }
        }
        if(dif1<=dif2 && dif1<=dif3 && dif1>=0 && dif2>=0 && dif3>=0){
            System.out.println("L1");
        }
        else if(dif2<=dif1 && dif2<=dif3 && dif1>=0 && dif2>=0 && dif3>=0){
            System.out.println("L2");
        }
        else if(dif3<=dif1 && dif3<=dif2 && dif1>=0 && dif2>=0 && dif3>=0){
            System.out.println("L3");
        }


    }
}
