package model;

public class Break {
    /**
     * model
     * power    (between 0 and 10)
     */
    public String model;
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >0 && power <10)
        this.power = power;
    }
}
