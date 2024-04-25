package oop;

public class GinShop {
    int bottles;
    final int PRICE_PER_SELL = 500;
    final int PRICE_PER_BUY = 230;
    int balance;

    public GinShop(int bottles, int balance){
        this.balance = balance;
        this.bottles = bottles;
    }

    void sell(int bottles){
        if (this.bottles >= bottles ){
            this.bottles -= bottles;
            balance += PRICE_PER_SELL*bottles;
            System.out.println("Prodej probehl uspesne");
        } else {
            System.out.println("Prodej neprobehl, na sklade je malo lahvi");
        }
    }

    void buy(int bottles){
        if (balance >= PRICE_PER_BUY * bottles){
            balance -= PRICE_PER_BUY * bottles;
            this.bottles += bottles;
        } else {
            System.out.println("Nepodarilo se dokoupit zasoby, malo penez");
        }
    }

    void printBalance(){
        System.out.println("Na sklade: " + bottles + " lahvi");
        System.out.println("V pokladne: " + balance);
    }
}
