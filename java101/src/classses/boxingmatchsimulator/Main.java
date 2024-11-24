package classses.boxingmatchsimulator;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Onur", 20, 100, 115, 20);
        Fighter fighter2 = new Fighter("Varlık", 20, 100, 95, 20);

        Ring ring = new Ring(60, 115, fighter1, fighter2);

        ring.match();

    }

}