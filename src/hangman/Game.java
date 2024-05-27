package hangman;

import java.util.ArrayList;

public class Game {

    String secret;
    ArrayList<String> checked;
    final String[] POOL = {"papuce", "srst", "nejkulatoulinkatejsi", "kavovar", "chirurgie"};
    Player p;
    Reader inputReader;

    public Game(Player p, Reader inputReader) {
        this.p = p;
        this.inputReader = inputReader;
    }

    /**
     * Vygeneruje: nahodne slovo z poolu
     * Vycisti: pocet pokusu u hrace, vsechna zadana pismena
     */
    void setupGame(){
        p.resetAttempts();
        checked = new ArrayList<>();

    }

    String pickRandomWord(){
        int randomIndex = (int) (Math.random() * POOL.length);
        System.out.println("CHEAT: " + POOL[randomIndex]);
        return POOL[randomIndex];
    }
}
