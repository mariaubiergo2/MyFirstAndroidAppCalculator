package edu.upc.dsa.myfirstapplication;

import static java.lang.Float.parseFloat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;
import java.util.Arrays;

public class NewMainActivity extends AppCompatActivity {

    TextView screen;
    TextView resultScreen;

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

    Button buttonplus;
    Button buttonminus;
    Button buttonmultiply;
    Button buttondivide;
    Button buttoncos;
    Button buttonsin;
    Button buttontan;
    Button buttondegree;
    Button buttonradians;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);

        screen = (TextView) findViewById(R.id.numbersView);
        resultScreen = (TextView) findViewById(R.id.resultView);

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

        buttonplus = (Button) findViewById(R.id.buttonplus);
        buttonminus = (Button) findViewById(R.id.buttonminus);
        buttonmultiply = (Button) findViewById(R.id.buttonmultiply);
        buttondivide = (Button) findViewById(R.id.buttondivide);
        buttoncos =  (Button) findViewById(R.id.buttoncos);
        buttonsin =  (Button) findViewById(R.id.buttonsin);
        buttontan =  (Button) findViewById(R.id.buttontan);
        buttondegree =  (Button) findViewById(R.id.buttondegree);
        buttonradians =  (Button) findViewById(R.id.buttonradians);

    }
    public void showOnBoard(View view){
        Log.d("MYAPP", "He hecho click en el button" );
    }

    public void showOnScreen(View view){
        if (resultScreen.getText().length()!=0){
            screen.setText(null);
            resultScreen.setText(null);
        }

        if (view.getId()==(buttonplus.getId()))
            screen.setText(screen.getText()+" + ");

        if (view.getId()==(buttonminus.getId()))
            screen.setText(screen.getText()+" - ");

        if (view.getId()==(buttonmultiply.getId()))
            screen.setText(screen.getText()+" x ");

        if (view.getId()==(buttondivide.getId()))
            screen.setText(screen.getText()+" / ");

        if (view.getId()==(buttoncos.getId()))
            screen.setText(screen.getText()+" cos ");

        if (view.getId()==(buttonsin.getId()))
            screen.setText(screen.getText()+" sin ");

        if (view.getId()==(buttontan.getId()))
            screen.setText(screen.getText()+" tan ");

        if (view.getId()==(buttondegree.getId()))
            screen.setText(screen.getText()+" o ");

        if (view.getId()==(buttonradians.getId()))
            screen.setText(screen.getText()+" rad ");

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

    public void showOperationOnScreen(View view){
        if (screen.getText().length()==0);
        else {
            String[] values = screen.getText().toString().split(" ");
            int i = values.length - 1;

            if (values[i].equals("+") || values[i].equals("-") || values[i].equals("x") || values[i].equals("/"))
                ;
            else
                showOnScreen(view);
        }
    }

    public void ResultOnScreen(View view){
        String[] values = screen.getText().toString().split(" ");

        if (values[1].equals("sin")||values[1].equals("cos")||values[1].equals("tan")){
           calculateTrigo(values);
        }

        else {
            float result = parseFloat(values[0]);

            for (int i = 1; i < values.length; i++) {
                if (values[i].equals("+"))
                    result = result + parseFloat(values[i + 1]);

                if (values[i].equals("-"))
                    result = result - parseFloat(values[i + 1]);

                if (values[i].equals("x"))
                    result = result * parseFloat(values[i + 1]);

                if (values[i].equals("/")) {
                    if (parseFloat(values[i + 1]) == 0.0)
                        resultScreen.setText("ERROR DIVISION");
                    else
                        result = result / parseFloat(values[i + 1]);
                }
            }

            resultScreen.setText("= " + Float.toString(result));
        }

    }

    public void ACOperation(View view){
        screen.setText(null);
        resultScreen.setText(null);
    }

    public void showTrigoOnScreen(View view){
        if (resultScreen.getText().length()==0)
            showOnScreen(view);
    }

    public void calculateTrigo(String[] values){
        double angle = parseFloat(values[2]);
        double result = 0.0;

        if (values[3].equals("o"))
            angle = Math.toRadians(parseFloat(values[1]));

        switch (values[1]){
            case "cos":
                result = Math.cos(angle);
                break;

            case "sin":
                result = Math.sin(angle);
                break;

            case "tan":
                result = Math.tan(angle);
                break;
        }
        resultScreen.setText("= "+Double.toString(result));

    }

/*
    btn7.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
        }
    });
*/
}