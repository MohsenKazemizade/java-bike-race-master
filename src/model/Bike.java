package model;

public class Bike {
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
    public Gear gear;
    public Break  abreak;


    public int speed;

    public void pedal(int rpm){
        speed = gear.getSize() * rpm;
    }
    public void breaking(int push){
        speed -= abreak.getPower() * push;
        if (speed < 0 ){
            speed = 0;
        }

    }
}
