package Day2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int size=10;
        int a[]=new int[10];
        //a[]={1,2,3};
        int b[]={1,2,3,4,5};
        int c[];
        Scanner sc=new Scanner(System.in);
        int marks=0;
        for(int j=0;j<10;j++){
             marks=sc.nextInt();
            a[j]=marks;
        }
       //java.util.Arrays.sort(a);
       // System.out.println("least mark got is"+a[0]);
       // System.out.print("max mark is "+a[9]);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int top=0,least=0;
        for(int i=0;i<10;i++){
            if(a[i]>max){
                max=a[i];
                top=i;
            }
            if(a[i]<min){
                min=a[i];
                least=i;
            }
        }
        System.out.println("least mark "+min+" max mark "+max);
        System.out.println("least mark person "+least+" max mark person"+top);
    }
}
