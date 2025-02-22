import karakterler.Archer;
import karakterler.Knight;
import karakterler.Samurai;

public class Player {
    private int damage;
    private int healt;
    private int money;
    private String name;
    private String charName;

    Knight knight=new Knight();
    Samurai samurai=new Samurai();
    Archer archer=new Archer();
    public Player(String name){
        this.name=name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar(int secim){

        switch (secim){
            case 1:
                this.setMoney(samurai.getMoney());
                this.setHealt(samurai.getHealt());
                this.setCharName(samurai.getName());
                this.setDamage(samurai.getDamage());
                System.out.println(this.getCharName()+" seçimi başarıyla gerçekleşti");
                break;
            case 2:
                this.setMoney(archer.getMoney());
                this.setHealt(archer.getHealt());
                this.setCharName(archer.getName());
                this.setDamage(archer.getDamage());
                System.out.println(this.getCharName()+" seçimi başarıyla gerçekleşti");
                break;
            case 3:
                this.setMoney(knight.getMoney());
                this.setHealt(knight.getHealt());
                this.setCharName(knight.getName());
                this.setDamage(knight.getDamage());
                System.out.println(this.getCharName()+" seçimi başarıyla gerçekleşti");
                break;
            default:
                this.setMoney(samurai.getMoney());
                this.setHealt(samurai.getHealt());
                this.setCharName(samurai.getName());
                this.setDamage(samurai.getDamage());
                System.out.println(this.getCharName()+" seçimi başarıyla gerçekleşti");

        }

    }
}
