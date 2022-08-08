import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        int s=0,sub=0;
        for(int i=0;i<7;i++){
            a[i]=sc.nextInt();
            if(a[i]>8){
                sub=sub+(a[i]-8);
            }
        }
        for(int i=0;i<7;i++) {
            if (a[i] <= 8) {
                s += a[i] * 100;
            } else if (a[i] > 8 && sub < 40) {
                s += a[i] * 100 + (a[i] - 8) * 15;
            } else {
                if (i == 5) {
                    s += a[i] * 100 + 25 + 0.25 * a[i];
                } else if (i == 6) {
                    s += a[i] * 100 + 25 + 0.5 * a[i];
                } else {
                    s += a[i] * 100 + 25;
                }
            }
        }

        System.out.println(s);
    }
}

