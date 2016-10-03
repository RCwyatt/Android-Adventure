package morecancer.cancer.myapplication;

/**
 * Created by Rylan on 2016-09-13.
 */
public abstract class Floor {

    String[][][][] sauce;

    int xi;
    int yi;
    int gi;
    int scone;

    public Floor(int x, int y, int g, int scone){
        xi = x;
        yi = y;
        gi = g;
        this.scone = scone;
    }

    public abstract String move(int x,int y,int d, int i);

    public abstract int pickup(int x,int y,int d);

    public void ground(int x, int y, int i){
        xi = x;
        yi = y;
        gi = i;
    }

    public String look(int x,int y,int d, int i){

        return sauce [x - 1][y - 1][d - 1][i];
    }

    public String groundLook(int x, int y) {
        if (x == xi && y == yi) if (gi == 1) {
            return "There is a torch on the ground";
        } else if (x == xi && y == yi && gi == 2){
            return "There is a box on the ground";

        }

            return "";


    }





}
