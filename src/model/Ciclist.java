package model;

public class Ciclist {
    /**
     * name
     * roundPerMinutes
     * pushPower
     * bike
     *
     * pedal()
     * breaking()
     */
    private String name;
    private int rpm;
    private int pushPower;

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    private Bike bike;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getPushPower() {
        return pushPower;
    }

    public void setPushPower(int pushPower) {
        this.pushPower = pushPower;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }



    public int getSpeed(){
        return bike.speed;
    }


    public void pedal(){
        bike.pedal(rpm);
    }
    public void breaking() {
        bike.breaking(pushPower);
    }
}
