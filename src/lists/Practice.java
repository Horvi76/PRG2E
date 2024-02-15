package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
       //uzivatel zadava userNames,
       // zadavni ukonci zadanim 'konec'
       // Jmena musi byt unikatni
        Scanner sc = new Scanner(System.in);
        ArrayList<String> userNames = new ArrayList<>();
        System.out.println("zadavej uzivatelska jmena, zadavani ukoncim napsanim 'konec'");
        String input = sc.nextLine();
        while (!input.equals("konec")){
            if (userNames.contains(input)){
                System.out.println("Jmeno jiz v seznamu je, zvolte jine...");
            } else {
                userNames.add(input);
                System.out.println("pridano " + input);
            }
            input = sc.nextLine();
        }
        System.out.println("Zadano: " + userNames);
        System.out.println();
        userNames.remove("pepa");

        //vygenerujte 10 nahodnych cisel
        //interval je 1 - 15
        //musi byt unikatni a ulozene
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int random;
        int count = 0;
        while (uniqueNumbers.size() != 15){
            random = (int) (Math.random()*15+1);
            if (!uniqueNumbers.contains(random)){
                uniqueNumbers.add(random);
            }
            count++;
        }
        System.out.println(uniqueNumbers);
        System.out.println("Vygenerovano cisel: " + count);

    }
}
