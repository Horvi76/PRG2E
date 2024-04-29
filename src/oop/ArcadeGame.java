package oop;

public class ArcadeGame {
    private int score;
    private int players;
    private int highestScore;
    private final int MAX_PLAYERS = 3;


    public ArcadeGame() {
        this.score = 0;
        this.players = 0;
        this.highestScore = 0;
    }

    public int getHighestScore() {
        return highestScore;
    }

    private boolean resetScore() {
        if (players == 0) {
            score = 0;
            return true;
        } else {
            System.out.println("Score nejde resetovat, kdyz nekdo hraje");
            return false;
        }
    }

    public boolean join() {
        if (players < MAX_PLAYERS) {
            players++;
            return true;
        } else {
            System.out.println("Hraje uz max pocet hracu, nemuzes se pripojit");
            return false;
        }
    }

    public boolean logOut() {
        if (players > 0) {
            players--;
            if ( players == 0){
                resetScore();
            }
            return true;
        } else {
            System.out.println("Nikdo nehraje, nema kdo odejit");
            return false;
        }
    }

    public void increaseScore(int score) {
        if (players > 0 && score > 0) {
            this.score += score;
            if (this.score > highestScore) {
                highestScore = this.score;
            }
        } else {
            System.out.println("Nepodarilo se navysit skore");
        }
    }

    public void decreaseScore(int score) {
        if (score < this.score && players > 0) {
            this.score = 0;
        } else {
            this.score -= score;
        }
    }
}
