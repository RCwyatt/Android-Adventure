package morecancer.cancer.myapplication;

import java.util.ArrayList;

/**
 * Created by Rylan on 2016-09-13.
 */
public class Floorzero {

    String[][][][] sauce;

    int xi = -1;
    int yi = -1;
    int gi = 0;

    public Floorzero(){
        sauce = new String[1][1][4][2];
        sauce[0][0][0][0] = "You're in a dark room, you can faintly see a wall in front of you with an arrow pointing to the right painted on it";
        sauce[0][0][1][0] = "You can see a wall with an an arrow pointing up painted on it";
        sauce[0][0][2][0] = "You can see a wall with a torch in a scone";
        sauce[0][0][3][0] = "You can see a blank wall";
        sauce[0][0][0][1] = "You can see a blank wall where there used to be a painted arrow";
        sauce[0][0][1][1] = "You can see a wall with a crack, large enough to fit in";
        sauce[0][0][2][1] = "You can see an empty scone";
        sauce[0][0][3][1] = "You can see a blank wall";

    }

    public String move(int x,int y,int d, int i){

        if (x == 1 && y == 1 && d == 2 && i == 1){

            return "f";

        } else {
            return "a";
        }

    }

    public int pickup(int x,int y,int d){
        if (x == 1 && y == 1 && d == 3){
            return 1;
        } else if (xi == x && yi == y){
            return gi;
        } else {
            return 0;
        }
    }

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
        }

            return "";


    }





}
