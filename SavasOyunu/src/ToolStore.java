import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {

        super(player,"Eşya Dükkanı");

    }
Scanner sc=new Scanner(System.in);

    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya Hoşgeldiniz!!!!!!");
        System.out.println("--- 1  Silahlar---");
        System.out.println("--- 2  Zırhlar---");
        System.out.println("--- 3  Çıkış Yap---");
        System.out.println("--- Seçim Yap---");
        int sc1=sc.nextInt();
        while (sc1<1||sc1>3){
            System.out.println("Tekrar Seçim Yap Yanlış Tuşlama");
            sc1=sc.nextInt();
        }
        switch (sc1) {
            case 1:
                Weapon.weaponList(this.getPlayer());

                break;
            case 2:
                Armor.ArmorList();
                break;
            default:
                return true;
        }

        return true;
    }
}
