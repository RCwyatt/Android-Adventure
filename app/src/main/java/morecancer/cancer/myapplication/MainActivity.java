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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    Floorzero send = new Floorzero();

    public void script(){
        TextView textview = (TextView)findViewById(R.id.textView);
        TextView groundView = (TextView)findViewById(R.id.itemText);

        if (f == 0){
            textview.setText(send.look(x, y, d, i));
        }
        String can = send.groundLook(x, y);
        groundView.setText(can);
    }



    public void move(int c){
        if (f == 0){

                switch (send.move(x, y, d, i)){
                    case "f":
                        f++;
                        break;
                    case "x":
                        x++;
                        break;
                    case "x-":
                        x--;
                        break;
                    case "y":
                        y++;
                        break;
                    case "y-":
                        y--;
                        break;
                }

        }
    }


    public void up(View v){
        if (v instanceof Button){
            //Button b = (Button) v;

            move(1);
            script();

        }
    }
    public void right(View v){
        if (v instanceof Button){
            //Button b = (Button) v;
            d++;
            if (d == 5){
                d = 1;
            }
            script();

        }
    }

    public void left(View v){
        if (v instanceof Button){
            //Button b = (Button) v;
            d--;
            if (d == 0){
                d = 4;
            }
            script();

        }
    }

    public void item(View v){
        if (v instanceof Button){
            Button b = (Button) v;
        if (i == 0){
            switch(send.pickup(x, y, d)){
                case 0 :

                    break;
                case 1 :
                    i = 1;
                    b.setText("Torch");
                    break;

            }
        } else {
            send.ground(x,y,i);
            i = 0;
            b.setText("pickup");
        }
        }
        script();
    }



}
