package edu.upc.dsa.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewMainActivity extends AppCompatActivity {

    TextView screen;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);

        screen = (TextView) findViewById(R.id.numbersView);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);


    }
    public void showOnBoard(View view){
        Log.d("MYAPP", "He hecho click en el button" );
    }

    public void showOnScreen(View view){
        if (view.getId()==(button0.getId()))
            screen.setText(screen.getText()+"0");

        if (view.getId()==(button1.getId()))
            screen.setText(screen.getText()+"1");

        if (view.getId()==(button2.getId()))
            screen.setText(screen.getText()+"2");

        if (view.getId()==(button3.getId()))
            screen.setText(screen.getText()+"3");

        if (view.getId()==(button4.getId()))
            screen.setText(screen.getText()+"4");

        if (view.getId()==(button5.getId()))
            screen.setText(screen.getText()+"5");

        if (view.getId()==(button6.getId()))
            screen.setText(screen.getText()+"6");

        if (view.getId()==(button7.getId()))
            screen.setText(screen.getText()+"7");

        if (view.getId()==(button8.getId()))
            screen.setText(screen.getText()+"8");

        if (view.getId()==(button9.getId()))
            screen.setText(screen.getText()+"9");

    }

/*
    btn7.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
        }
    });
*/
}