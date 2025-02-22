package Canavarlar;

public class Obstacle {
    private String obsName;
    private int obsId;
    private int obsDamage;
    private int obsHealt;
    private int obsMoney;

    public Obstacle(String obsName, int obsId, int obsDamage, int obsHealt, int obsMoney) {
        this.obsName = obsName;
        this.obsId = obsId;
        this.obsDamage = obsDamage;
        this.obsHealt = obsHealt;
        this.obsMoney = obsMoney;
    }

    public String getObsName() {
        return obsName;
    }

    public void setObsName(String obsName) {
        this.obsName = obsName;
    }

    public int getObsId() {
        return obsId;
    }

    public void setObsId(int obsId) {
        this.obsId = obsId;
    }

    public int getObsDamage() {
        return obsDamage;
    }

    public void setObsDamage(int obsDamage) {
        this.obsDamage = obsDamage;
    }

    public int getObsHealt() {
        return obsHealt;
    }

    public void setObsHealt(int obsHealt) {
        this.obsHealt = obsHealt;
    }

    public int getObsMoney() {
        return obsMoney;
    }

    public void setObsMoney(int obsMoney) {
        this.obsMoney = obsMoney;
    }
}
