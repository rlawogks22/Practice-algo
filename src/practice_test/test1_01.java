package practice_test;

import java.util.Scanner;

//최소, 최대
public class test1_01 {
    static int max1(int a, int b, int c, int d){ //4개 값 중 최대
        int max1 = a;
        if(b>max1){
            max1 = b;
        }if (c > max1){
            max1 = c;
        }if (d > max1){
            max1 = d;
        }
        return max1;
    }

    static int min1(int a, int b, int c){
        int min1 = a;
        if(b < min1){
            min1 = b;
        }if (c < min1){
            min1 = c;
        }
        return min1;
    }

        public static void main(String[] args){
        System.out.println("최대값은 " + max1(1,2,3,4) + "입니다." );
        System.out.println("최대값은 " + min1(1,2,3) + "입니다." );


    }
}
