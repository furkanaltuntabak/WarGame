import Canavarlar.Obstacle;
import Canavarlar.Vampire;

public  class BattleLoc extends Location{
    Obstacle obstacle;

    public BattleLoc(Player player,Obstacle obstacle) {
        super(player,"Savaş Alanı");
        this.obstacle = obstacle;
    }

    public  boolean onLocation(){
        System.out.println(obstacle.getObsDamage());
        return true;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

}
