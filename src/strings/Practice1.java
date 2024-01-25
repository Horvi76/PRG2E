package strings;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //nacti string od uzivatele
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej string: ");
        String input = "whatever";
        //je dlouhy alespon 8 znaku
        if (input.length() > 7){
            System.out.println("Input OK");
        }
        //overi rodne cislo
        //overi = znak '/'
        //pocet znaku = 11
        //vypis, zda se jedna o muze/zenu
        String rc = "005209/1245";
        if (rc.charAt(6) == '/'){
            System.out.println("/ je OK");
            if (rc.length() == 11){
                System.out.println("Delka OK");
                if (rc.charAt(2) == '0' || rc.charAt(2) == '1'){
                    System.out.println("Jedna se o muže");
                } else {
                    System.out.println("Jedna se o ženu");
                }
            }
        }
        //Pripravit string heslo
        //Overit, zda uzivatel heslo uhodl
        String password = "secret";
        System.out.println("Zadej heslo:");
        input = scanner.nextLine();
        //porovnava, ze jsou stejne
        if (input.equals(password)){
            System.out.println("Spravne zadano!");
        } else {
            System.out.println(":(");
        }

        ///hledani v poli Strings
        String[] passwords = {"bagr", "toi toi", "mamma mia!"};
        System.out.println("Zadej heslo: ");
        input = scanner.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].equals(input)){
                System.out.println("Zadal jsi spravne heslo");
                break;
            }
        }

        //prevod textu -> velka mala pismena
        //Java je case sensitive
        //uzivatel zada text, vypis je velkymi pismeny
        System.out.println("Zadej text: ");
        input = scanner.nextLine();
        String upperText = input.toUpperCase();
        System.out.println(input + " byl preveden na " + upperText);


        //porovnejte, zda jsou dve slova stejna bez ohledu na velikost pismen
        //hello -> hElLo budou stejne
        String first = "hello";
        String second = "hELlO";
        System.out.println("Jsou stejne? " + first.equals(second));
        System.out.println("Jsou stejne? " + first.equalsIgnoreCase(second));
        //Alternativne (a zbytecne slozite)
        boolean same = first.toUpperCase().equals(second.toUpperCase());
    }
}
