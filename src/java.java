import model.*;

public class Java {

    public static void main(String[] args) {

        Break shimanoBreak = new Break();
        shimanoBreak.setModel("model2017");
        shimanoBreak.setPower(2);

        Gear shimanoGear = new Gear();
        shimanoGear.setModel("model2018");
        shimanoGear.setSize(5);

        Bike gitan = new Bike();
        gitan.name = "shimanobike";
        gitan.gear = shimanoGear;
        gitan.abreak = shimanoBreak;

        Ciclist teacher = new Ciclist();
        teacher.setName("Mr.teacher");
        teacher.setRpm(8);
        teacher.setPushPower(6);
        teacher.setBike(gitan);



        Map map = new Map();

        teacher.pedal();
        System.out.println(teacher.getSpeed());

        while(teacher.getSpeed() > map.getR2().maxSpeed){
            teacher.breaking();
            System.out.println(teacher.getSpeed());
        }
        teacher.pedal();
        System.out.println(teacher.getSpeed());

        while(teacher.getSpeed() > map.getR4().maxSpeed){
            teacher.breaking();
            System.out.println(teacher.getSpeed());
        }

        System.out.println("Match finished");




    }
}
