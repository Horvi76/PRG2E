package strings;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //nacti string od uzivatele
        //String je heslo
        //nazev musi byt dlouhy aspon 8 znaku
        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej mozne heslo:");
//        String password = sc.nextLine();
//        if (password.length() < 8){
//            System.out.println("Neplatne");
//        } else {
//            System.out.println(password + " je OK");
//        }

//        //heslo musi odpovidat 'secret'
//        //vypiste, zda uzivatel uhadl
//        System.out.println("uhadni heslo:");
//        String correctPassword = "secret";
//        password = sc.nextLine();
//        if (password.equals(correctPassword)){
//            System.out.println("Spravne");
//        } else {
//            System.out.println("Spatne");
//        }

//        //uzivatel zada rodne cislo
//        //zjisti, ze je spravne
//        //zjisti, zda se jedna o muze/zenu
//        System.out.println("zadej rodne cislo");
//        String rc = sc.nextLine();
//        //je spravne = lomitko,
//        // a zaroven 123456/7899
//        if (rc.charAt(6) == '/'){
//            System.out.println("RC ma na spravne pozici /");
//            if (rc.length() == 11){
//                System.out.println("RC ma spravnou delku");
//                if (rc.charAt(2) == '0' || rc.charAt(2) == '1'){
//                    System.out.println("Jedna se o muze");
//                } else if (rc.charAt(2) == '5' || rc.charAt(2) == '6'){
//                    System.out.println("Jedna se o zenu");
//                }
//            }
//        }

        //Pole stringu:
        String[] passwords = {"ananas", "vodka", "rohlik"};
        System.out.println("Zkus uhadnout heslo:");
        String guess = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (guess.equals(passwords[i])){
                System.out.println("Uhadl!");
                break;
            }
        }

        //vypis z pole vsechny Honzy
        String[] names = {"Ctirad Novák", "Oldřich Starý", "Jan Franta", "Jan Boháč", "František karel"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")){
                System.out.println(names[i]);
            }
        }
    }
}
