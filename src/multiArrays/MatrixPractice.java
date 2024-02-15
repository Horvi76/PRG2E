package multiArrays;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class MatrixPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
//        int[][][] b = new int[10][4][45];
        //vygenerovani
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*90+10);
            }
        }

        //vypsani
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println("Printing row:");
//        //uzivatel zada cislo radku, vypises radek
//        String input = JOptionPane.showInputDialog("Zadej cislo radku");
//        int row = Integer.parseInt(input);
//        for (int i = 0; i < matrix[row].length; i++) {
//            System.out.print(matrix[row][i] + " ");
//        }
//        System.out.println();
//
//
//
//        System.out.println("Printing column:");
//        //uzivatel zada cislo sloupce, vypises sloupec
//        input = JOptionPane.showInputDialog("Zadej cislo sloupce");
//        int col = Integer.parseInt(input);
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(matrix[i][col]);
//        }
//        System.out.println();

        //vypis prumery kazdeho pole a pak prumer vsech
        int sumPartial = 0;
        int sumTotal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumPartial = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumTotal += matrix[i][j];
                sumPartial += matrix[i][j];
            }
            System.out.println("Average of arr#" + i + ": " + (sumPartial / matrix[i].length));
        }

        //pozor, funguje pouze, kdyz pocet radku == pocet sloupcu
        System.out.println("Total average = " + (sumTotal / (matrix.length*matrix.length)));

        //vypis ve formatu
        //*
        //**
        //***...
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
