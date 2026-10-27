package Loop;

import java.util.Scanner;

////A fibonacci program that display the nth value of a fibonacci sequence
//// 1 , 1 , 2 , 3 , 5 ,8,13,21,34,55,89.........
//say n for the first value , second value is also n , therefore the next value is first + second
//say n is the position
//say f is first value
//    s is second value
//        if n is 3 then
//            f = 1 && s = 1
//            v = value for n
//            v = f+s;

public class Fibonacci {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a position interger n : ");
        int n = s.nextInt();

        int result = 0 ;
        int v1 = 1;
        int v2 = 1;

        for (int i =1 ; i <= n-2; i ++ ){
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("result = " + (result==0? 1 : result));

    }
}
