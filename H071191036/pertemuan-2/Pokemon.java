//Tugas Praktikum kls C No. 1

class Pokemon {
    private String name;
    private String type;
    private int defense;
    private int xp;
    private int health;
    private String winner;
    private String loser;

    public Pokemon(String name, String type, Integer defense) {
        this.name = name;
        this.type = type;
        this.defense = defense;
        xp = 1000;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDefense() {
        return defense;
    }

    public void getDamage(Pokemon enemy) {
        health = health - (defense - enemy.getDefense());

    }

    public void attack(Pokemon enemy) {

        switch (type) {
            case "fire":
                switch (enemy.getType()) {

                    case "water":
                        winner = enemy.getName();
                        loser = name;
                    case "ground":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("There's no such type\n");
                        break;
                }
                break;
            case "ground":
                switch (enemy.getType()) {
                    case "fire":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "electric":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "water":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("There's no such type\n");
                        break;
                }
                break;
            case "electric":
                switch (enemy.getType()) {
                    case "water":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "ground":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("There's no such type\n");
                        break;
                }
                break;
            case "water":
                switch (enemy.getType()) {
                    case "fire":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "ground":
                        winner = name;
                        loser = enemy.getName();
                        break;
                    case "electric":
                        winner = enemy.getName();
                        loser = name;
                        break;
                    default:
                        System.out.println("There's no such type\n");
                        break;
                }
            default:
                break;

        }

        if (winner == name) {
            xp += 1000;
        }

    }

    public void dead() {
        if (health <= 0) {
            System.out.println(name + " is dead");
        }

    }

    public void desc() {
        System.out.println("Name    : " + name);
        System.out.println("Type    : " + type);
        System.out.println("Defense : " + defense);
        System.out.println("Health  : " + health);
        System.out.println("Xp      : " + xp);
        System.out.println();
    }

    public void result() {
        if (winner != null && loser != null) {
            System.out.println(winner + " win");
            System.out.println(loser + " lose");
        }
    }

}
class Main{
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("pika 1", "fire", 50);
        Pokemon p2 = new Pokemon("pika 2", "water", 90);

        p1.getDamage(p2);
        p2.getDamage(p1);

        p1.attack(p2);
        p2.attack(p1);

        p1.dead();
        p2.dead();

        p1.desc();
        p2.desc();

        p1.result();
    }
}
