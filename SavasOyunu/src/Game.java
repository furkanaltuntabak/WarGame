
import Canavarlar.Obstacle;
import Canavarlar.Vampire;

import java.util.Scanner;

public class Game {
    Scanner sc=new Scanner(System.in);
    Player player=new Player("furkan");

    public void start(){

        System.out.println("macera oyununa hoşgeldiniz");
        System.out.println("Hangi karakteri oynamak istersiniz\n" +
                "1)SAMURAY Özellikler : Hasar: 5 Sağlık: 21 Para:15\n" +
                "2)OKÇU Özellikler : Hasar: 7 Sağlık: 18 Para:20\n" +
                "3)ŞOVALYE Özellikler : Hasar: 8 Sağlık: 24 Para:5\n");
        int secim=sc.nextInt();
        player.selectChar(secim);
        Location location=null;
        while (true){
            System.out.println("Bölgeler");
            System.out.println("--1-- Güvenli Ev ---> Burada Canınızı doldurabilirsiniz !!");
            System.out.println("--2-- Mağaza ---> Buradan Ekipman satın alabilirsiniz !!");
            int sc1=sc.nextInt();
            switch (sc1){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new BattleLoc(player,new Vampire());
                    break;
            }
            if (!location.onLocation()){
                System.out.println("GAME OVER");
                break;
            }
        }



    }
}
