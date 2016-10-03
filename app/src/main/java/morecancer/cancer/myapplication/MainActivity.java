package morecancer.cancer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 1;
    int y = 1;
    int d = 1;
    int f = 0;
    int i = 0;
    int t = 0;
    TextView second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        second = (TextView) findViewById(R.id.secondaryText);
        script();
    }


    Floor send = new Floorzero();

    public void script() {
        TextView textview = (TextView) findViewById(R.id.textView);
        TextView groundView = (TextView) findViewById(R.id.itemText);
        TextView direct = (TextView) findViewById(R.id.direction);

        textview.setText(send.look(x, y, d, t));

        String can = send.groundLook(x, y);
        groundView.setText(can);
        switch (d){
            case 1:
                direct.setText("North");
                break;
            case 2:
                direct.setText("East");
                break;
            case 3:
                direct.setText("South");
                break;
            case 4:
                direct.setText("West");
        }
    }

    public void advance() {
        f++;
        x = 1;
        y = 1;
        d = 1;
        i = 0;
        t = 0;
        Button p = (Button) findViewById(R.id.button5);
        p.setText("Pickup");
        if (f == 1) {
            send = new Floorone();
        } else if (f == 2) {
            send = new Floortwo();
        }
        script();
    }


    public void move() {

        switch (send.move(x, y, d, i)) {
            case "f":
                advance();
                second.setText("You advance to the next floor");
                break;
            case "x":
                x++;
                second.setText("You move forward");
                break;
            case "x-":
                x--;
                second.setText("You move forward");
                break;
            case "y":
                y++;
                second.setText("You move forward");
                break;
            case "y-":
                y--;
                second.setText("You move forward");
                break;
        }


    }

    public void up(View v) {
        if (v instanceof Button) {
            move();
            script();
        }
    }

    public void right(View v) {
        if (v instanceof Button) {
            //Button b = (Button) v;
            d++;
            if (d == 5) {
                d = 1;
            }
            script();

        }
    }

    public void left(View v) {
        if (v instanceof Button) {
            //Button b = (Button) v;
            d--;
            if (d == 0) {
                d = 4;
            }
            script();

        }
    }

    public void item(View v) {
        if (v instanceof Button) {
            Button b = (Button) v;
            if (i == 0) {
                switch (send.pickup(x, y, d)) {
                    case 0:

                        break;
                    case 1:
                        i = 1;
                        t = 1;
                        b.setText("Torch");
                        second.setText("You Pickup the torch and the room lights up");
                        break;
                    case 2:
                        i = 2;
                        b.setText("Box");
                        second.setText("You Pickup the box");
                        break;

                }
            } else {
                send.ground(x, y, i);
                i = 0;
                t = 0;
                b.setText("pickup");
                second.setText("You drop your item on the ground");
            }
        }
        script();
    }


}
