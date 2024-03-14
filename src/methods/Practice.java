package methods;

import java.util.Arrays;

public class Practice {


    static void greetings(String name){
        System.out.println("Ahoj " + name);
    }

    static int rectangleArea(int width, int height){
        return width * height;
//        System.out.println("hello");
    }

    static int random(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }

    //metoda ma jako vstup pocet sekund
    //do konzole vypiste ve formatu mm:ss
    static void timeConvert(int seconds){
//        int hours = seconds / 3600;
//        int minutes =(seconds-hours*3600) / 60;
//        int remainingSeconds = (seconds-hours*3600-minutes*60) % 60;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
    }

    //vygeneruj pole nahodnych cisel od min po max
    //delka pole je argument funkce
    static int[] randomArray(int length, int min, int max){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(min, max);
        }
        return array;
    }

    public static void main(String[] args) {
        int rectangleArea = rectangleArea(5,4);
        System.out.println("Area is : " + rectangleArea);
        int randomNum = random(-10, 10);
        int anotherRandomNum = random(20, 100);
        System.out.println(Arrays.toString(randomArray(10, -100, 100)));
        timeConvert(90);
        timeConvert(180);
    }

}
