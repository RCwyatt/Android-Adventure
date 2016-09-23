package morecancer.cancer.myapplication;

import java.util.ArrayList;

/**
 * Created by Rylan on 2016-09-13.
 */
public class Floorzero extends Floor{





    public Floorzero(){
        super(-1, -1, 0, 1);
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
        if (x == 1 && y == 1 && d == 3 && scone == 1){
            sauce [0][0][2][0] = "You can see an empty scone";
            scone = 0;
            return 1;
        } else if (xi == x && yi == y){
            int temp = gi;
            gi = 0;
            return temp;
        } else {
            return 0;
        }
    }







}
