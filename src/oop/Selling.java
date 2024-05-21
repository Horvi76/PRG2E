package oop;

public class Selling {

    public static void main(String[] args) {
        Instrument violin = new Instrument("string type", "Violin", 8500);
        Instrument organ = new Instrument("mixed", "Organ", 220000);
        Instrument piano = new Instrument("Key type", "Piano", 35000);

        violin.sellInstrument();
        System.out.println("Name: " + violin.name);
        System.out.println("Name: " + organ.name);
        System.out.println("Name: " + piano.name);
        piano.sellInstrument();
        System.out.println(Instrument.instrumentsSold);

        Instrument.amountPrinted();
    }
}
