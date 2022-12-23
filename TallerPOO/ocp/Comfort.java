package ocp;

public class Comfort implements DrivingMode{

    private static int POWER=400;
    private static int SUSPENSION_HEIGHT=20;

    public int getPower(){
        return POWER;
    }

    public int getSuspensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
