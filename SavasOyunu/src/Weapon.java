import java.util.Scanner;

public class Weapon {

    private String name;
    private int ID;
    private int price;
    private int damageplus;

    public Weapon(String name, int damageplus, int price, int ID) {
        this.name = name;
        this.damageplus = damageplus;
        this.price = price;
        this.ID = ID;
    }

    static void weaponList(Player player){
        Weapon[] weapons=new Weapon[3];
        weapons[0]=new Weapon("Tabanca",2,5,1);
        weapons[1]=new Weapon("Kılıç",3,35,2);
        weapons[2]=new Weapon("Tüfek",7,45,3);
        System.out.println("########################################################");
        System.out.println("-------SİLAHLAR-------");
        for (Weapon weapon : weapons) {
            System.out.println("ID:  "+weapon.getID() +"Silahın adı: "+weapon.getName()+"    Hasar Artış Miktarı:  "+weapon.getDamageplus()+"    Fiyatı"+weapon.getPrice());

        }
        System.out.println("########################################################");
        System.out.println("Satın Almak istediğiniz Silahın IDsını giriniz");
        Scanner inp=new Scanner(System.in);
        int id=inp.nextInt();
        switch (id){
            case 1:
                if (player.getMoney()>=weapons[0].getPrice()){
                    player.setDamage(player.getDamage()+weapons[id-1].getDamageplus());
                    player.setMoney(player.getMoney()-weapons[id-1].getPrice());
                    System.out.println("Yeni Hasarınız :  "+player.getDamage());

                }else
                    System.out.println("yeterli paranız yok ");
                break;
            case 2:
                if (player.getMoney()>=weapons[1].getPrice()){
                    player.setDamage(player.getDamage()+weapons[id-1].getDamageplus());
                    player.setMoney(player.getMoney()-weapons[id-1].getPrice());
                    System.out.println("Yeni Hasarınız :  "+player.getDamage());
                    System.out.println("Yeni Paranız :  "+player.getMoney());

                }else
                    System.out.println("yeterli paranız yok ");
                break;
            case 3:
                if (player.getMoney()>=weapons[id-1].getPrice()){
                    player.setDamage(player.getDamage()+weapons[id-1].getDamageplus());
                    player.setMoney(player.getMoney()-weapons[id-1].getPrice());
                    System.out.println("Yeni Hasarınız :  "+player.getDamage());
                }else
                    System.out.println("yeterli paranız yok ");
                break;
            default:
                break;
        }
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamageplus() {
        return damageplus;
    }

    public void setDamageplus(int damageplus) {
        this.damageplus = damageplus;
    }
}
