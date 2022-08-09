package Day2;

import java.util.Scanner;

public class StringConcept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println("length of 2 strings "+s1.length()+","+s2.length());
        System.out.println("concatenation of 2 strings: "+s1.concat(s2));
        String a[]=s1.split("@",1);
        for(String i:a){
            System.out.println(i);
        }
        StringBuffer sb=new StringBuffer(s1);
        System.out.print(sb.reverse());
        if(s1.equals(s2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
