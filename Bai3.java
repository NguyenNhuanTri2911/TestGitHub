package Java;

import java.util.Scanner;

public class Bai3 {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap vao so nguyen thu 1 ");
         int a = sc.nextInt();
         System.out.println("Nhap vao so nguyen thu 2 ");
         int b = sc.nextInt();
         int tg = a+b;
         int h = a-b;
         int t = a*b;
         double th = (double) a/b;
         int du = a%b;
         System.out.println("Tong la :" +tg);
         System.out.println("Hieu la :" +h);
         System.out.println("Tich la :" +t);
         System.out.println("Thuong la " +th);
         System.out.println("so du la " +du);
         sc.close();
      }  
   }
