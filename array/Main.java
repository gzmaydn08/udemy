package array;

import java.util.Scanner;

public class Main {
    public static void arrayBastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("elemnet : " + (i + 1) + ":" + array[i]);
        }


    }

    public static double ortalamabul(int[] array) {
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return ((double) toplam/ array.length);
    }


    public static void main(String[] args) {

       /* int[] a = { 30, 40,50,60,70};
        System.out.println(a[3]);
        System.out.println(a[2]);
        System.out.println(a[0]);*/

        /*
        a[5] = 32;
        a[9] = 50;
        */

        int[] a = new int[5];

        int[] b = {10,20,30,40,50};

        arrayBastir(b);
        System.out.println("ortalama = " +ortalamabul(b));


       // System.out.println("array uzunluğu = " + b.length);

        //Scanner scanner = new Scanner(System.in);
        /*for (int i =0; i<5 ;i++){
            a[i]= scanner.nextInt();
        }*/


       /* for (int i = 0; i < 5; i++) {
            a[i] = i * 4 + 2;
        }*/
        /*System.out.println("**************************************");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);

        }*/
    }
}