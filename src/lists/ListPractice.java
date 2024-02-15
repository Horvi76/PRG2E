package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPractice {

    public static void main(String[] args) {
        //Ptejte se uzivatele na tel. cisla
        //zadavani ukonci zadanim -1
        //Vypiste pote vsechana tel. cisla z CR (dle predvolby)
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        System.out.println("Zadavej tel. cisla, zadavani ukoncis zadanim -1");
        //dokud nezada "-1"
        while (!phoneNumber.equals("-1")){
            phoneNumber = sc.nextLine();//zadej dalsi string
            list.add(phoneNumber);
        }
        System.out.println("Zadano: " + list);

        //vypsat ty ceske (+420):
        String currentNumber;
        System.out.println("Ceska cisla:");
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            currentNumber = list.get(i);
            check = true;

            for (int j = 1; j < currentNumber.length(); j++) {
                //vezmi soucasny znak
                char currentSymbol = currentNumber.charAt(j);
                //overi, ze se jedna o cislo (0-9)
                if (!Character.isDigit(currentSymbol)){
                    check = false;
                    break;
                }
            }

            if (currentNumber.startsWith("+420") &&
                currentNumber.length() == 13 && check == true) {
                System.out.println(currentNumber);
            }
        }
    }
}
