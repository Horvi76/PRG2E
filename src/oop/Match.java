package oop;

public class Match {
    private int hostScore, visitingScore;

    public Match(int hostScore, int visitingScore) {
        this.hostScore = hostScore;
        this.visitingScore = visitingScore;
    }

    public void getResult(){
        if (hostScore > visitingScore){
            System.out.println("Vyhráli domácí");
        } else if (visitingScore > hostScore){
            System.out.println("Vyráli hosté");
        } else {
            System.out.println("Remíza");
        }
    }

    public int getHostScore() {
        return hostScore;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    public int getVisitingScore() {
        return visitingScore;
    }

    public void setVisitingScore(int visitingScore) {
        this.visitingScore = visitingScore;
    }
}
