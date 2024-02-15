package methods;

public class Basics {
    //neco tady

    static void printHello(){
        System.out.println("Hello world");
        System.out.println("Called from a method!");
    }

    static void printGreeting(String name){
        System.out.println("Ahoj " + name);
    }

    static void sum(int a, int b){
        int cislo = a+b;
        System.out.println( a + " + " + b + " = ");
        System.out.println(cislo);
    }

    static int multiplication(int a, int b){
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        int cislo = 5;
        printHello();
        printGreeting("Karel");
        printGreeting("Honza");
        sum(2,5);
        sum(-3,20);
        multiplication(5,3); // spocita, ale nic neudela
        int multiplicationResult = multiplication(5,3);
        System.out.println(multiplicationResult);
    }

    //nebo tady
}
