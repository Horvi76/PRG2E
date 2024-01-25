package strings;

import javax.swing.*;
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        String input = JOptionPane.showInputDialog("Zadej IP");
        System.out.println("Zadal jsi: " + input);
        boolean ok = true;
        String[] parts = {};

        //uzivatel vubec neco zadal
        if (input == null){
            ok = false;
            System.out.println("Nebylo nic zadano");
        }

        //spocitej tecky:
        if (ok){
            parts = input.split("\\.");
            if (parts.length == 4) {
                System.out.println("Delka OK");
            } else {
                System.out.println("Neni format [0-255].[0-255].[0-255].[0-255]!");
                ok = false;
                //System.exit(1);
            }
        }

        //kontroluj, ze tam vubec jsou cisla
        for (int i = 0; i < parts.length && ok; i++) {
            for (int j = 0; j < parts[i].length() && ok; j++) {
                char current = parts[i].charAt(j);
                if (!Character.isDigit(current)){
                    System.out.println("Nejsou zadana cisla!");
                    ok = false;
                    break;
                }
            }
        }

        //overi, ze jsou cisla OK
        for (int i = 0; i < parts.length && ok; i++) {
            int number = Integer.parseInt(parts[i]);
            if (number >= 0 && number <= 255){
                System.out.println((i+1) + "/" + parts.length + " OK");
            } else{
                System.out.println("Cisla nejsou v intervalu IP adresy");
                ok = false;
                break;
            }
        }

        if (ok){
            System.out.println("Zadal jsi IP adresu");
        }else {
            System.out.println("Nebyla zadana IP adresa");
        }
    }
}
