package model;

public class Map {

    private Direct D1;
    private Round R2;
    private Direct D3;
    private Round R4;

    public Map(){
        D1 = new Direct();


        R2 = new Round();
        R2.maxSpeed = 20;

        D3 = new Direct();


        R4 = new Round();
        R4.maxSpeed = 10;



    }

    public Direct getD1() {
        return D1;
    }

    public Round getR2() {
        return R2;
    }

    public Direct getD3() {
        return D3;
    }

    public Round getR4() {
        return R4;
    }
}
