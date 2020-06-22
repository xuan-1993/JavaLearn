package 面对对象.常用类;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nextInt等待录入一个int
        int i = sc.nextInt();
        double i1=sc.nextDouble();
        System.out.println(i);
        System.out.println(i1);
    }

}
