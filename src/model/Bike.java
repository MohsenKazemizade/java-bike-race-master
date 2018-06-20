package model;

public class Bike extends Ciclist {
    /**
     * name
     * gear
     * break
     * speed    ( speed < 0 => 0 )
     * <p>
     * <p>
     * pedal( rpm )         (speed = gear size * rpm )
     * breaking ( push )    (speed -= break power * push)
     */


    public String name;
    Gear g = new Gear();
    Break b = new Break();
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0 && speed <= 10)
            System.out.println(g.getSize() * rpm);
        this.speed = speed;
    }
}
