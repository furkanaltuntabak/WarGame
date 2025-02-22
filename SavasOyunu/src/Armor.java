public class Armor {
    private String name;
    private int ID;
    private int damageReduction;
    private int money;

    public Armor(String name, int ID, int damageReduction, int money) {
        this.name = name;
        this.ID = ID;
        this.damageReduction = damageReduction;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public static void ArmorList(){

        Armor[] armor=new Armor[3];
        armor[0]=new Armor("Hafif",1,1,15);
        armor[1]=new Armor("Orta",2,2,25);
        armor[2]=new Armor("Ağır",3,5,45);
        for (int i=0;i< armor.length;i++){
            System.out.println("Zırhın adı:  "+armor[i].getName()+"  ID:  "+armor[i].getID()+"  Hasar Azaltması:  "+armor[i].damageReduction+" Ücreti:  "+armor[i].money);
        }


    }
}
