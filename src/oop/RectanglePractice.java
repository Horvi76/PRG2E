package oop;

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle();
        abcd.width = 5;
        abcd.height = 4;
        System.out.println("Obsah: " + abcd.getArea());
        System.out.println("je to ctverec? " + abcd.isSquare());
    }
}
