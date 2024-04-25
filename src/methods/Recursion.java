package methods;

import java.io.File;

public class Recursion {


    static void countdown(int n){
        System.out.println(n);

        if(n > 1){
            n--;
            countdown(n);
        }
    }

    static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int nonRecursive(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static void infinity(){
        System.out.println("Doing something..");
        infinity();
    }

    static void saharaCounter(int n){
        System.out.println("Sahara speck #" + n);
        if (n == 36546484){
            System.out.println("Counted!");
            return;
        }
        saharaCounter(n+1);
    }

    public static void main(String[] args) {
        countdown(5);
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(100));
//        infinity();
        saharaCounter(1);
    }
}
