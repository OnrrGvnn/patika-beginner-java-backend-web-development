package classses.boxingmatchsimulator;

public class Ring {
    int minWeight;
    int maxWeight;
    double firstHit;
    Fighter fighter1;
    Fighter fighter2;

    Ring(int minWeight, int maxWeight, Fighter fighter1, Fighter fighter2) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firstHit = firstHit;

        if (firstHit()) {
            this.fighter1 = fighter2;
            this.fighter2 = fighter1;
        } else {
            this.fighter1 = fighter1;
            this.fighter2 = fighter2;
        }

    }

    void match() {
        if (isCheck()) {
            System.out.println("\nWelcome The Box Match !");
            System.out.println("The Battle Between " + this.fighter1.name + " And " + this.fighter2.name + " Is Starting !");

            int roundNumber = 1;

            if (firstHit()) {
                System.out.println("According To The Coin Toss, " + this.fighter1.name + " Starts The Fight !");
            } else {
                System.out.println("According To The Coin Toss, " + this.fighter2.name + " Starts The Fight !");
            }

            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("\n----Round " + roundNumber + "-----");

                this.fighter1.health = this.fighter2.hit(this.fighter1);

                if (this.fighter1.health <= 0) {
                    System.out.println(this.fighter1.name + "'s Remaining Health: " + this.fighter1.health + ".");
                    System.out.println("\n" + this.fighter1.name + " Is Knocked Out!");
                    System.out.println(this.fighter2.name + " Wins The Match!");
                    break;
                }

                System.out.println(this.fighter1.name + "'s Remaining Health: " + this.fighter1.health + ".");
                System.out.println("------------");

                this.fighter2.health = this.fighter1.hit(this.fighter2);

                if (this.fighter2.health <= 0) {
                    System.out.println(this.fighter2.name + "'s Remaining Health: " + this.fighter2.health + ".");
                    System.out.println("\n" + this.fighter2.name + " Is Knocked out!");
                    System.out.println(this.fighter1.name + " Wins The Match!");
                    break;
                }

                System.out.println(this.fighter2.name + "'s remaining health: " + this.fighter2.health + ".");
                System.out.println("------------");

                roundNumber++;

            }
        } else {
            System.out.println("\nThe Fighters' Weights Are Not Suitable For The Fight !");
        }
    }

    private boolean firstHit() {
        double randomValue;

        randomValue = Math.random() * 100;
        this.firstHit = randomValue;

        return randomValue >= 50;

    }

    boolean isCheck() {
        return ((this.fighter1.weight >= this.minWeight) && (this.fighter1.weight <= this.maxWeight) &&
                (this.fighter2.weight >= this.minWeight) && (this.fighter2.weight <= this.maxWeight));
    }

}