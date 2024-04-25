package oop;

public class Rectangle {
    int height, width;

    double getArea(){
        return height * width;
    }

    boolean isSquare(){
//        if (width == height){
//            return true;
//        } else {
//            return false;
//        }
        return width == height;
    }
}
