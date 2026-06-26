class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void attack() {
        System.out.println(name + " uses a basic strike!");
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name) { super(name); }

    @Override
    public void attack() {
        System.out.println(getName() + " unleashes Greatsword Cleave! Deals 50 Physical Melee Damage.");
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " fires a piercing tracking shot! (Arrows remaining: " + arrowCount + ")");
        } else {
            System.out.println(getName() + " out of arrows! Out of ammo!");
        }
    }
}

class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public void attack() {
        if (mana >= 20) {
            mana -= 20;
            System.out.println(getName() + " casts Fireball blast spell! Cost 20 Mana. (Mana remaining: " + mana + ")");
        } else {
            System.out.println(getName() + " depleted mana reserves. Need to regenerate.");
        }
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] party = {
            new Warrior("Thorin"),
            new Archer("Legolas", 2),
            new Mage("Gandalf", 50)
        };

        for (GameCharacter hero : party) {
            hero.attack();
        }
    }
}
