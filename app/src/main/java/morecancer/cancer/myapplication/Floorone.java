package morecancer.cancer.myapplication;

import java.util.ArrayList;

/**
 * Created by Rylan on 2016-09-13.
 */
public class Floorone extends Floor{





    public Floorone(){
        super(1, 1, 2, 0);
        sauce = new String[1][3][4][1];
        sauce[0][0][0][0] = "You can see an open room ahead, with a green switch on the ground";
        sauce[0][0][1][0] = "You can see a blank wall";
        sauce[0][0][2][0] = "You can see a blank wall";
        sauce[0][0][3][0] = "You can see a blank wall";
        sauce[0][1][0][0] = "You can see an empty room ahead with an open green door on the far side, you are standing on a green switch";
        sauce[0][1][1][0] = "You can see a blank wall, you are standing on a green switch";
        sauce[0][1][2][0] = "You can see the room you started in, you are standing on a green switch";
        sauce[0][1][3][0] = "You can see a blank wall, you are standing on a green switch";
        sauce[0][2][0][0] = "You can see a closed green door";
        sauce[0][2][1][0] = "You can see a blank wall";
        sauce[0][2][2][0] = "You can see an open room ahead, with a green switch on the ground";
        sauce[0][2][3][0] = "You can see a blank wall";

    }

    public String move(int x,int y,int d, int i){
        System.out.println(x + " " + y + " " + d + " " + xi + " " + yi);
        if (xi == 1 && yi == 2){
            sauce[0][2][0][0] = "There is an open green door in front of you";
        } else {
            sauce[0][2][0][0] = "You can see a closed green door";
        }
        if (x == 1 && y == 1 && d == 1){

            return "y";

        } else if (x == 1 && y == 2 && d == 1){

            return "y";

        } else if (x == 1 && y == 2 && d == 3){

            return "y-";

        } else if (x == 1 && y == 3 && d == 3){

            return "y-";

        } else if (x == 1 && y == 3 && d == 1  && xi == 1 && yi == 2) {

            return "f";

        } else
         {
            return "a";
        }

    }

    public int pickup(int x,int y,int d){
         if (xi == x && yi == y){
            int temp = gi;
            gi = 0;
            return temp;
        } else {
            return 0;
        }
    }



}
