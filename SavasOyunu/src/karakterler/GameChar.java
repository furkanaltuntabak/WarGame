package karakterler;

public class GameChar {
    private int ID;
    private String name;
    private int damage;
    private int healt;
    private int money;

    public GameChar(int ID, String name, int damage, int healt, int money) {
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
