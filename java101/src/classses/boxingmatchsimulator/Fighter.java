package classses.boxingmatchsimulator;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter fighter) {
        System.out.println(this.name + " => " + fighter.name + " Dealt " + this.damage + " Damage.");

        if (fighter.dodge()) {
            System.out.println(fighter.name + " Dodged The Incoming Damage.");

            return fighter.health;

        }

        if (fighter.health - this.damage <= 0) {
            return 0;
        }

        return fighter.health - this.damage;

    }

    boolean dodge() {
        double randomValue = Math.random() * 100;

        return (randomValue <= this.dodge);

    }

}