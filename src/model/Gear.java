package model;

public class Gear {
    /**
     * model
     * size (between 0 and 10)
     */
    public String model;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0 && size < 10)
        this.size = size;
    }


}
